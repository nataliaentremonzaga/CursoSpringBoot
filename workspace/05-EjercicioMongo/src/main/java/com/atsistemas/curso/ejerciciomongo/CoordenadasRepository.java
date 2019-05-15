package com.atsistemas.curso.ejerciciomongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CoordenadasRepository extends MongoRepository<Coordenadas, String>{ // T tipo de la entidad, ID tipo de la clave primaria

	EjercicioMongoDarkSky findByLatitude(Double latitude);
	EjercicioMongoDarkSky findByLongitude(Double longitude);

}
