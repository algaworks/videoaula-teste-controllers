package br.com.algaworks.filmes.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Filme {

	private Long codigo;
	private String titulo;
	private String descricao;
	
}
