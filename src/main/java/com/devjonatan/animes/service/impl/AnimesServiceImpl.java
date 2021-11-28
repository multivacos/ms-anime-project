package com.devjonatan.animes.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devjonatan.animes.entity.Anime;
import com.devjonatan.animes.repository.AnimesRepository;
import com.devjonatan.animes.service.AnimesService;

/**
 * @author Jonatan
 * @version 1.0 27.11.2021
 * Clase que implementa los metodos de logica de negocio de la interface de AnimesService
 */

@Service
public class AnimesServiceImpl implements AnimesService {
	/**
	 * Bean Repository de spring inyectado para ejecutar el CRUD
	 */
	@Autowired
	private AnimesRepository animesRepository;

	@Override
	public List<Anime> consultarAnimes() {
		List<Anime> animesDataSource = StreamSupport.stream(
				this.animesRepository.findAll().spliterator(), false)
				.collect(Collectors.toList());
		return animesDataSource;
	}

	@Override
	public Anime guardarAnime(Anime anime) {
		anime.setFechaCreacion(LocalDateTime.now());
		return this.animesRepository.save(anime);
	}

	@Override
	public Anime actualizarAnime(Anime anime) {
		return this.animesRepository.save(anime);
	}

	@Override
	public void eliminarAnime(Long id) {
		this.animesRepository.deleteById(id);
	}

}
