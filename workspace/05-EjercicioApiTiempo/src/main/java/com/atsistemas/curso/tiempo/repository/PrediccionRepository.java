package com.atsistemas.curso.tiempo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.atsistemas.curso.tiempo.entities.Prediccion;

public interface PrediccionRepository extends MongoRepository<Prediccion, Long> {

}
