package com.powering.spring.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.powering.spring.ServiceImpl.FilialeServiceImpl;
import com.powering.spring.To.FilialeTo;

@Component
public class AziendaRunner implements ApplicationRunner {
	@Autowired FilialeServiceImpl filialeSI;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		//FilialeTo f1 = new FilialeTo("viale Magna Grecia", "Taranto" , "74100");
		//filialeSI.createFiliale(f1);
	}

}
