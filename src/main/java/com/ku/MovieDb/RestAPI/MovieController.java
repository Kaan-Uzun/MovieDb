package com.ku.MovieDb.RestAPI;

import com.ku.MovieDb.Business.Abstract.IMovieService;
import com.ku.MovieDb.Entities.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieController {

    @Autowired
    private IMovieService _movieService;

    @GetMapping("/movies")
    public List<Movie> get() {
        return _movieService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Movie movie) {
        _movieService.add(movie);
    }

    @PostMapping("/update")
    public void update(@RequestBody Movie movie) {
        _movieService.update(movie);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Movie movie) {
        _movieService.delete(movie);
    }

    @GetMapping("/movies/{movieId}")
    public Movie getById(@PathVariable int movieId) {
        return _movieService.getById(movieId);
    }
}
