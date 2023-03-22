package com.kike.imagenes.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;



import com.kike.imagenes.dto.LugarDTO;
import com.kike.imagenes.entities.ImagenesEntity;
import com.kike.imagenes.entities.LugarEntity;



public interface ImagenesRepository extends CrudRepository<ImagenesEntity,Integer>{

	
//	@Query(value="select new com.kike.imagenes.dto.LugarDTO (v.id,v.titulo,v.precio,iv.imagenes) "
//	+ "FROM com.kike.imagenes.entities.LugarEntity l "
//	+ "INNER JOIN com.kike.imagenes.entities.ImagenesEntity i "
//	+ "ON l.idLugar = i.lugar.idLugar "
//	+ "WHERE v.tipoNegocio LIKE CONCAT('%',:tipoNegocio,'%') "
//	+ "AND v.localidad LIKE CONCAT('%',:localidad,'%') "
//	+ "AND v.precio >= :precio "
//	+ "AND v.metrosCuadrados >= :metrosCuadrados "
//	+ "AND v.numHabitaciones >= :numHabitaciones "
//	+ "AND v.numBanos >= :numBanos "
//	+ "AND v.aireAcondicionado LIKE CONCAT('%',:aireAcondicionado,'%') "
//	+ "AND v.terraza LIKE CONCAT('%',:terraza,'%') "
//	+ "AND v.jardin LIKE CONCAT('%',:jardin,'%') "
//	+ "AND v.piscina LIKE CONCAT('%',:piscina,'%') "
//	+ "AND v.activo = 1 ")
//Iterable<LugarDTO>buscarLugarPorID(
//	@Param("tipoNegocio") String tipoNegocio,
//	@Param("localidad") String localidad,
//	@Param("precio") Integer precio,
//	@Param("metrosCuadrados") Integer metrosCuadrados,
//	@Param("numHabitaciones") Integer numHabitaciones,
//	@Param("numBanos") Integer numBanos,
//	@Param("aireAcondicionado") String aireAcondicionado,
//	@Param("terraza") String terraza,
//	@Param("jardin") String jardin,
//	@Param("piscina") String piscina);
}


