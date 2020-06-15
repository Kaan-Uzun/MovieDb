package com.ku.MovieDb.Business.Concrete;

import com.ku.MovieDb.Business.Abstract.IMovieService;
import com.ku.MovieDb.DataAccess.Abstract.IMovieDal;
import com.ku.MovieDb.Entities.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieManager implements IMovieService {

    @Autowired
    private IMovieDal _movieDal;

    @Override
    public List<Movie> getAll() {
        return _movieDal.getAll();
    }

    @Override
    @Transactional
    public void add(Movie movie) {
        _movieDal.add(movie);
    }

    @Override
    @Transactional
    public void delete(Movie movie) {
        _movieDal.delete(movie);
    }

    @Override
    @Transactional
    public void update(Movie movie) {
        _movieDal.update(movie);
    }

    @Override
    @Transactional
    public Movie getById(int movieId) {
        return _movieDal.getById(movieId);
    }
}
