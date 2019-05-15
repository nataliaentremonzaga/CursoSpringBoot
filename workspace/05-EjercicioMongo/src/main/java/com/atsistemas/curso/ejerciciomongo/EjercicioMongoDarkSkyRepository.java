package com.atsistemas.curso.ejerciciomongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EjercicioMongoDarkSkyRepository extends MongoRepository<EjercicioMongoDarkSky, Long>{ // T tipo de la entidad, ID tipo de la clave primaria

	EjercicioMongoDarkSky findBySummary(String summary);
	EjercicioMongoDarkSky findByIcon(String icon);
	EjercicioMongoDarkSky findByTemperature(Long temperature);

}
