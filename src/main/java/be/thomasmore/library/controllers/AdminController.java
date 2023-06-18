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
        Iterable<Movie> unarchivedMovies = movieRepository.findByArchivedFalse();
        Iterable<Movie> archivedMovies = movieRepository.findByArchivedTrue();

        model.addAttribute("unarchivedMovies", unarchivedMovies);
        model.addAttribute("archivedMovies", archivedMovies);

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

    @PostMapping({"/archiveMovie","/archivemovie"})
    public String archiveMovie(@RequestParam int id) {
    movieRepository.findById(id).ifPresent(movie -> {
        movie.setArchived(true);
        movieRepository.save(movie);
    });
    return "redirect:/admin/manageMovies";
    }

    @PostMapping({"/unarchiveMovie","/unarchivemovie"})
    public String unarchiveMovie(@RequestParam int id) {
    movieRepository.findById(id).ifPresent(movie -> {
        movie.setArchived(false);
        movieRepository.save(movie);
    });
    return "redirect:/admin/manageMovies";
    }

}