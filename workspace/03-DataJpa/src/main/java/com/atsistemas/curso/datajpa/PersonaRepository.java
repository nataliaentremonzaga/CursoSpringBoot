package com.atsistemas.curso.datajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonaRepository extends JpaRepository<Persona, Long>{ // T tipo de la entidad, ID tipo de la clave primaria

	List<Persona> findByNombre(String nombre);
	
	//@Query("select p form Persona p where p.nombre = ?1") //lenguaje Jpql nos permite hacer consultas basadas en tipo Java
	@Query(nativeQuery = true, value= "select * from personas where nombre = ?1") // Consulta normal de sql
	List<Persona> buscarPorNombre(String nombre);
}
