package com.powering.spring.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.powering.spring.DTO.AutomezzoDTO;
import com.powering.spring.Entity.Automezzo;
import com.powering.spring.Repository.AutomezzoRepository;
import com.powering.spring.Service.AutomezzoService;
import com.powering.spring.To.AutomezzoTo;
@Service
public class AutomezzoServiceImpl implements AutomezzoService{
	@Autowired 
	private AutomezzoRepository automezzoRepository;

	@Autowired @Qualifier("automezzo") private ObjectProvider<Automezzo> provider;
	
	@Override
	public Long createAutomezzo(AutomezzoTo a) {
		Automezzo a1 = provider.getObject().builder()
		.targa(a.getTarga())
		.marca(a.getMarca())
		.modello(a.getModello())
		.Filiale(a.getFiliale())
		.build();
		return automezzoRepository.save(a1).getId();
	}

	@Override
	public AutomezzoDTO getAutomezzoById(Long id) {
		return automezzoRepository.getAutomezzoById(id);
	}

	@Override
	public List<AutomezzoDTO> getAllAutomezzi() {
		return automezzoRepository.getAllAutomezzi();
	}

	@Override
	public Long deleteAutomezzo(Long id) {
		Automezzo a = automezzoRepository.findById(id).get();
		automezzoRepository.delete(a);
		return a.getId();
	}

	
}
