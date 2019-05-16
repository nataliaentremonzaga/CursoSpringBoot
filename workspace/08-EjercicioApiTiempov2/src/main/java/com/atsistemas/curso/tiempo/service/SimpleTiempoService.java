package com.atsistemas.curso.tiempo.service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atsistemas.curso.tiempo.bussiness.ClienteDarkSkyApi;
import com.atsistemas.curso.tiempo.bussiness.PrediccionFactory;
import com.atsistemas.curso.tiempo.dto.PrediccionDarkSkyResponse;
import com.atsistemas.curso.tiempo.dto.PrediccionResponse;
import com.atsistemas.curso.tiempo.dto.UbicacionRequest;
import com.atsistemas.curso.tiempo.entities.Prediccion;
import com.atsistemas.curso.tiempo.repository.PrediccionRepository;

@Service
public class SimpleTiempoService implements TiempoService {

	@Autowired
	private PrediccionRepository prediccionRepository;

	@Autowired
	private ClienteDarkSkyApi clienteDarkApi;

	@Autowired
	private PrediccionFactory prediccionFactory;

	@Override
	public PrediccionResponse obtenerPrediccionPorUbicacion(UbicacionRequest ubicacionRequest) {

		PrediccionDarkSkyResponse prediccionDarkSkyResponse = clienteDarkApi.obtenerPrediccion(ubicacionRequest);

		PrediccionResponse prediccionResponse = prediccionFactory.getInstanceFromPrediccionDarkSkyResponse(prediccionDarkSkyResponse);
		Prediccion prediccion = prediccionFactory.getInstanceFromPrediccionResponse(prediccionResponse);

		prediccionRepository.save(prediccion);

		return prediccionResponse;
	}

	@Override
	public Collection<PrediccionResponse> obtenerPrediccionResponse() {

		List<Prediccion> predicciones = prediccionRepository.findAll();

		return predicciones
				.parallelStream()
				.map(p -> prediccionFactory.getInstanceFromPrediccion(p)) //transformar, le damos un parametro de entrada y lo transforma en otra cosa
				.collect(Collectors.toList()); //devuelve una lista
	}

}
