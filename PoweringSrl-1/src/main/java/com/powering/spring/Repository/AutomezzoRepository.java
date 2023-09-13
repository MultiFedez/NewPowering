package com.powering.spring.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.powering.spring.DTO.AutomezzoDTO;
import com.powering.spring.Entity.Automezzo;

public interface AutomezzoRepository extends JpaRepository<Automezzo, Long>{
	
	@Query(value = "SELECT new com.powering.spring.DTO.AutomezzoDTO(a.id, a.targa, a.marca, a.modello) "
			+ "FROM Automezzo a "
			+ "WHERE a.id = :id")
	AutomezzoDTO getAutomezzoById(@Param("id")Long id);
	
	@Query(value = "SELECT new com.powering.spring.DTO.AutomezzoDTO(a.id, a.targa, a.marca, a.modello) "
			+ "FROM Automezzo a ")
	List<AutomezzoDTO> getAllAutomezzi();
	
}
