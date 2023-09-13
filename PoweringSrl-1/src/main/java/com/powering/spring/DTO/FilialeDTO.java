package com.powering.spring.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilialeDTO {
	private Long id;
	private String indirizzo;
	private String citta;
	private String cap;
}
