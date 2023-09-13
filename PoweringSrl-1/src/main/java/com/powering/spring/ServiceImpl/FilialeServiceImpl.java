package com.powering.spring.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.powering.spring.DTO.FilialeDTO;
import com.powering.spring.Entity.Automezzo;
import com.powering.spring.Entity.Filiale;
import com.powering.spring.Repository.FilialeRepository;
import com.powering.spring.Service.FilialeService;
import com.powering.spring.To.FilialeTo;
@Service
public class FilialeServiceImpl implements FilialeService {

	@Autowired
	private FilialeRepository filialeRepository;

	@Autowired @Qualifier("filiale") private ObjectProvider<Filiale> provider;
	
	@Override
	public Long createFiliale(FilialeTo f) {
		Filiale f1 = provider.getObject().builder()
		.indirizzo(f.getIndirizzo())
		.citta(f.getCitta())
		.cap(f.getCap())
		.build();
		return filialeRepository.save(f1).getId();
	}
	
	@Override
	public FilialeDTO getFilialeById(Long id) {
		return filialeRepository.getFilialeById(id);
	}

	@Override
	public List<FilialeDTO> getAllFiliali() {
		return filialeRepository.getAllFiliali();
	}

	@Override
	public Long deleteFiliale(Long id) {
		Filiale f = filialeRepository.findById(id).get();
		filialeRepository.delete(f);
		return f.getId();	
	}
	
}
