package com.powering.spring.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.powering.spring.DTO.FilialeDTO;
import com.powering.spring.To.FilialeTo;
@Service
public interface FilialeService {
	Long createFiliale(FilialeTo f);
	
	FilialeDTO getFilialeById(Long id);
	
	List<FilialeDTO> getAllFiliali();
	
	Long deleteFiliale(Long id);
}
