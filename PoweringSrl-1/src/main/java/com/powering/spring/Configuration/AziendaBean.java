package com.powering.spring.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.powering.spring.Entity.Automezzo;
import com.powering.spring.Entity.Filiale;

@Configuration

public class AziendaBean {
	@Bean("filiale")
    @Scope("prototype")
    public Filiale filiale() {
        return new Filiale();
    }
	
	@Bean("automezzo")
    @Scope("prototype")
    public Automezzo automezzo() {
        return new Automezzo();
    }
}
