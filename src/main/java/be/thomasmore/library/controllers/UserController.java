package be.thomasmore.library.controllers;

import be.thomasmore.library.model.Movie;
import be.thomasmore.library.model.Purchase;
import be.thomasmore.library.model.User;
import be.thomasmore.library.repositories.MovieRepository;
import be.thomasmore.library.repositories.PurchaseRepository;
import be.thomasmore.library.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PurchaseRepository purchaseRepository;

    @GetMapping({"", "/", "/home"})
    public String home(Model model, Principal principal) {
        Optional<User> optionalUser = userRepository.findByUsername(principal.getName());
        if (optionalUser.isPresent()) {
            List<Purchase> purchases = purchaseRepository.findByUserAndIsFinalised(optionalUser.get());
            List<Movie> movies = new ArrayList<>();
            for (Purchase purchase : purchases) {
                movies.addAll(purchase.getMovies());
            }
            model.addAttribute("movies", movies);
        }
        return "user/home";
    }

    @GetMapping({"/catalog"})
    public String catalog(Model model, @RequestParam(required = false) String director, @RequestParam(required = false) String title, @RequestParam(required = false) Integer year) {
        Iterable<Movie> movies;
        if (director != null && director != "") {
            movies = movieRepository.findAllByAuthor(director);
        } else if (title != null && title != "") {
            movies = movieRepository.findAllByTitle(title);
        } else if (year != null) {
            movies = movieRepository.findAllByYear(year);
        } else {
            movies = movieRepository.findAll();
        }
        model.addAttribute("movies", movies);
        return "user/catalog";
    }

    @GetMapping({"/detail/{id}"})
    public String detail(Model model, @PathVariable int id) {
        Optional<Movie> optionalMovie = movieRepository.findById(id);
        if (optionalMovie.isPresent()) {
            model.addAttribute("movie", optionalMovie.get());
            boolean lastPage = !movieRepository.existsById(id + 1);
            model.addAttribute("lastPage", lastPage);
        }
        return "user/detail";
    }

    @PostMapping({"/addToCart/{id}", "/addtocart/{id}"})
    public String addToCart(Principal principal, Model model, @PathVariable int id) {
        Optional<User> optionalUser = userRepository.findByUsername(principal.getName());
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            Optional<Movie> optionalMovie = movieRepository.findById(id);
            if (optionalMovie.isPresent()) {
                Movie movie = optionalMovie.get();
                Optional<Purchase> optionalPurchase = purchaseRepository.findByUserAndNotFinalised(user);
                Purchase purchase;
                if (optionalPurchase.isEmpty()) {
                    purchase = new Purchase(user, List.of(movie));
                } else {
                    purchase = optionalPurchase.get();
                    purchase.addMovie(movie);
                }
                purchaseRepository.save(purchase);
            }
        }
        return "redirect:/user/catalog";
    }

    @GetMapping("/cart")
    public String cart(Principal principal, Model model) {
        Optional<User> optionalUser = userRepository.findByUsername(principal.getName());
        if (optionalUser.isPresent()) {
            Optional<Purchase> optionalPurchase = purchaseRepository.findByUserAndNotFinalised(optionalUser.get());
            if (optionalPurchase.isPresent()) {
                model.addAttribute("movies", optionalPurchase.get().getMovies());
            } else {
                model.addAttribute("movies", null);
            }
        }
        return "user/cart";
    }

    @PostMapping({"/makePurchase", "/makepurchase"})
    public String makePurchase(Principal principal) {
        Optional<User> optionalUser = userRepository.findByUsername(principal.getName());
        if (optionalUser.isPresent()) {
            Optional<Purchase> optionalPurchase = purchaseRepository.findByUserAndNotFinalised(optionalUser.get());
            if (optionalPurchase.isPresent()) {
                Purchase purchase = optionalPurchase.get();
                purchase.setFinalised(true);
                purchaseRepository.save(purchase);
            }
        }
        return "redirect:/user/home";
    }


}