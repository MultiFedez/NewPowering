package com.powering.spring.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.powering.spring.DTO.AutomezzoDTO;
import com.powering.spring.To.AutomezzoTo;
@Service
public interface AutomezzoService {
	Long createAutomezzo(AutomezzoTo a); 
	
	AutomezzoDTO getAutomezzoById(Long id);
	
	List<AutomezzoDTO> getAllAutomezzi();
	
	Long deleteAutomezzo(Long id);

}
