package be.thomasmore.library.model;

import javax.persistence.*;

@Entity
public class Movie {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movie_generator")
    @SequenceGenerator(name = "movie_generator", sequenceName = "movie_seq", allocationSize = 1)
    @Id
    private int id;
    private String director;
    private String title;
    private int duration;
    private int year;

    private String description;

    public Movie(String director, String title, String description, int duration, int year) {
        this.director = director;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.year = year;
    }

    public Movie() {
    }

    public String getAuthor() {
        return director;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public int getYear() {
        return year;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
