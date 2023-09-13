package com.powering.spring.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.powering.spring.DTO.FilialeDTO;
import com.powering.spring.Entity.Filiale;

public interface FilialeRepository extends JpaRepository<Filiale, Long>{
	@Query(value = "SELECT new com.powering.spring.DTO.FilialeDTO(f.id, f.indirizzo, f.citta, f.cap) "
			+ "FROM Filiale f "
			+ "WHERE f.id = :id")
	FilialeDTO getFilialeById(@Param("id")Long id);
	
	@Query(value = "SELECT new com.powering.spring.DTO.FilialeDTO(f.id, f.indirizzo, f.citta, f.cap) "
			+ "FROM Filiale f ")
	List<FilialeDTO> getAllFiliali();
}
