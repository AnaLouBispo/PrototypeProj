package com.example.prototype2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // -> Definir classe
@NoArgsConstructor // -> Construtor
@Data // -> Para get and setters
@Getter
@Setter
public class Institution {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nameInstitution;
	private String cnpjInstitution;
	private String unitInstitution;
 
}
