package com.devjonatan.animes.service;

import java.util.List;

import com.devjonatan.animes.entity.Anime;

/**
 * @author Jonatan
 * @version 1.0 27.11.2021
 * Interface que contiene los metodos de logica de negocio para los animes
 */
public interface AnimesService {
	/**
	 * Metodo que permite consultar un listado de animes
	 * @return listado de animes
	 */
	List<Anime> consultarAnimes();
	/**
	 * Metodo que permite guardar un anime
	 * @param anime {@link Anime} objeto anime a guardar
	 * @return listado de animes
	 */
	Anime guardarAnime(Anime anime);
	/**
	 * Metodo que permite actualizar un anime
	 * @param anime {@link Anime} objeto anime a actualizar
	 * @return anime actualizado
	 */
	Anime actualizarAnime(Anime anime);
	/**
	 * Metodo que permite actualizar un anime
	 * @param id {@link Long} objeto anime a eliminar
	 * @return anime eliminado
	 */
	void eliminarAnime(Long id);
}
