package com.ku.MovieDb.DataAccess.Concrete;

import com.ku.MovieDb.DataAccess.Abstract.IMovieDal;
import com.ku.MovieDb.Entities.Movie;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateMovieDal implements IMovieDal {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Movie> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Movie> movies = session.createQuery("from Movie", Movie.class).getResultList();
        return movies;
    }

    @Override
    @Transactional
    public void add(Movie movie) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(movie);
    }

    @Override
    @Transactional
    public void delete(Movie movie) {
        Session session = entityManager.unwrap(Session.class);
        Movie movieDeleted = session.get(Movie.class, movie.movie_id);
        session.delete(movieDeleted);
    }

    @Override
    @Transactional
    public void update(Movie movie) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(movie);
    }

    @Override
    @Transactional
    public Movie getById(int movieId) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Movie.class, movieId);
    }
}
