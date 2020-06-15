package com.ku.MovieDb.Entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    @Column(name = "movie_id")
    public int movie_id;
    @Column(name = "movie_name")
    public String movie_name;
    @Column(name = "category")
    public String category;
    @Column(name = "release_year")
    public int release_year;
    @Column(name = "rating")
    public double rating;
}
