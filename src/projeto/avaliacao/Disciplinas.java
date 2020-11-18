package projeto.avaliacao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Disciplinas {

	protected String nomeAluno;
	protected String nomeDisciplina;
	protected BigDecimal media;
	List<Nota> notas;

	public Disciplinas() {
	}

	public Disciplinas(String nomeAluno, String nomeDisciplina, BigDecimal media, List<Nota> notas) {
		super();
		this.nomeAluno = nomeAluno;
		this.nomeDisciplina = nomeDisciplina;
		this.media = media;
		this.notas = notas;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public BigDecimal getMedia() {
		return media;
	}

	public void setMedia(BigDecimal media) {
		this.media = media;
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}


	

}
