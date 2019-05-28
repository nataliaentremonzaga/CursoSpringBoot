package com.atsitemas.curso.tiempo.repository.copy;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.atsitemas.curso.tiempo.entities.Prediccion;

public interface PrediccionRepository extends MongoRepository<Prediccion, Long>{

}
