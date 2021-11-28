/**
 * 
 */
package com.devjonatan.animes.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Jonatan
 * @version 1.0 27.11.2021
 * Clase que representa entidades de animes
 */

@Data
@Entity
@Table(name = "anime")
public class Anime {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "anio")
	private int anio;
	
	@Column(name = "fecha_creacion")
	private LocalDateTime fechaCreacion;
}
