package com.powering.spring.To;

import com.powering.spring.Entity.Filiale;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AutomezzoTo {

	private String targa;
	
	private String marca;
	
	private String modello;
	
	private Filiale Filiale;
}
