package projeto.avaliacao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CienciasExatas extends Disciplinas {
	
	private int penalidades;
	


	public CienciasExatas() {}

	public CienciasExatas(String nomeAluno, String nomeDisciplina, BigDecimal media, List<Nota> notas) {
		super(nomeAluno, nomeDisciplina, media, notas);
		
	}

	public CienciasExatas(int penalidades) {
		super();
		this.penalidades = penalidades;
	}
	
	

	public int getPenalidades() {
		return penalidades;
	}

	public void setPenalidades(int penalidades) {
		this.penalidades = penalidades;
	}

	public BigDecimal calcularMedia() {
		BigDecimal mediaT = BigDecimal.ZERO;

		for (Nota nota : notas) {

			mediaT = notas.stream().map(Nota::getNota).reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
		}

		return mediaT;

	}
		
	public BigDecimal calcularnegativos(int penalidades) {
		BigDecimal valor= new BigDecimal(0.5);
		BigDecimal negativos = valor.multiply(new BigDecimal (penalidades));;
		return negativos;
	}
	
	public BigDecimal calcularMediaFinal(BigDecimal mediaT, BigDecimal negativos) {
		BigDecimal mediaFinal = BigDecimal.ZERO;
		mediaFinal = mediaT.subtract(negativos);

		return mediaFinal;

	}

public void calcularAprovacao(BigDecimal mediaFinal) {
		
		BigDecimal aprovado= new BigDecimal (70);

		if(mediaFinal.compareTo(aprovado)>=69) {
			System.out.println("ALUNO REPROVADO");
		} else {
			System.out.println("ALUNO APROVADO");
		}
	}
	
	
}