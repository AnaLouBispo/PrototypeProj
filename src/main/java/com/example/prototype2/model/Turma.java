package com.example.prototype2.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class Turma {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeTurma;
	private Date anoLetivoTurma;
	private String periodoTurma;
	private int capacidadeMaximaTurma;
	@OneToMany
	private Docente idDocente;
	private String salaTurma;
	private List<Aluno> alunos;
	@OneToMany(mappedBy = "turma")
    private List<Belonging> turmaDisciplinas;  // Relacionamento com a tabela intermediária

}
