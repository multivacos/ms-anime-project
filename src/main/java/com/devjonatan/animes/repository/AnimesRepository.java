package com.devjonatan.animes.repository;

import org.springframework.data.repository.CrudRepository;

import com.devjonatan.animes.entity.Anime;

/**
 * @author Jonatan
 * @version 1.0 27.11.2021
 * Interface que contiene el CRUD con spring JPA para la tabla de animes
 */
public interface AnimesRepository extends CrudRepository<Anime, Long> {

}
