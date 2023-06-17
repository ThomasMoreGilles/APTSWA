package be.thomasmore.library.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Purchase {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_generator")
    @SequenceGenerator(name = "order_generator", sequenceName = "order_seq", allocationSize = 1)
    @Id
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Movie> movies;

    private boolean isFinalised;

    public Purchase(User user, List<Movie> movies) {
        this.user = user;
        this.movies = movies;
        this.isFinalised = false;
    }

    public Purchase() {
    }

    public User getUser() {
        return user;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    public boolean isFinalised() {
        return isFinalised;
    }

    public void setFinalised(boolean finalised) {
        isFinalised = finalised;
    }
}
