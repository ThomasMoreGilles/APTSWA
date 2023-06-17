package be.thomasmore.library.controllers;
import be.thomasmore.library.model.Movie;
import be.thomasmore.library.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    MovieRepository movieRepository;


    @GetMapping({"", "/", "/home"})
    public String home() {
        return "admin/home";
    }


    @GetMapping({"/managemovies", "/manageMovies"})
    public String manageMovies(Model model){
        Iterable<Movie> movies = movieRepository.findAll();
        model.addAttribute("movies", movies);
        return "admin/manageMovies";
    }

    @PostMapping({"/deleteMovie","/deletemovie"})
    public String deleteMovie(@RequestParam int id) {
        movieRepository.findById(id).ifPresent(movie -> movieRepository.delete(movie));
        return "redirect:/admin/manageMovies";
    }

    @GetMapping({"/addMovie","/addmovie"})
    public String addMovie(){

        return "admin/addMovie";
    }

    @PostMapping({"/addMovie","/addmovie"})
    public String addMoviePost(@RequestParam String title, @RequestParam String director,@RequestParam String description , @RequestParam int year, @RequestParam int duration){
        Movie movie = new Movie(director, title, description, duration, year);
        movieRepository.save(movie);
        return "redirect:/admin/manageMovies";
    }
}