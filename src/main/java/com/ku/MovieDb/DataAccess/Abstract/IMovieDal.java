package com.ku.MovieDb.DataAccess.Abstract;

import com.ku.MovieDb.Entities.Movie;

import java.util.List;

public interface IMovieDal {

    List<Movie> getAll();
    void add(Movie movie);
    void delete(Movie movie);
    void update(Movie movie);
    Movie getById(int movieId);
}
