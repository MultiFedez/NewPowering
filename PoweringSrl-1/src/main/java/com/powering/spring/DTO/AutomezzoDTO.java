package com.powering.spring.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AutomezzoDTO {
	private Long id;
	private String targa;
	private String marca;
	private String modello;
}
