package com.ku.MovieDb.Business.Abstract;

import com.ku.MovieDb.Entities.Movie;

import java.util.List;

public interface IMovieService {

    List<Movie> getAll();
    void add(Movie movie);
    void delete(Movie movie);
    void update(Movie movie);
    Movie getById(int movieId);
}
