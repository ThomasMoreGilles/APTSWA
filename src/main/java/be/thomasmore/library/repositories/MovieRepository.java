package be.thomasmore.library.repositories;

import be.thomasmore.library.model.Movie;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie, Integer> {
    @Query("SELECT b FROM Movie b WHERE b.director LIKE CONCAT('%',?1,'%')")
    List<Movie> findAllByAuthor(String director);
    @Query("SELECT b FROM Movie b WHERE b.title LIKE CONCAT('%',?1,'%')")
    List<Movie> findAllByTitle(String title);
    List<Movie> findAllByYear(int year);

    List<Movie> findByArchivedTrue(Sort sort);
    List<Movie> findByArchivedFalse(Sort sort);
}
