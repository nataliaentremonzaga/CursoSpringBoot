package com.atsitemas.curso.tiempo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.atsitemas.curso.tiempo.entities.Prediccion;

public interface PrediccionRepository extends MongoRepository<Prediccion, Long>{

}
