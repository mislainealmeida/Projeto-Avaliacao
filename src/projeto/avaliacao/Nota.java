package projeto.avaliacao;

import java.math.BigDecimal;

public  class Nota{
	
	private TipoAvaliacoes tipoAvaliacoes; 
	private BigDecimal nota;
	
	
	public Nota() {	}
	
	public Nota(TipoAvaliacoes tipoAvaliacoes, BigDecimal nota) {
		super();
		this.tipoAvaliacoes = tipoAvaliacoes;
		this.nota = nota;
	}
	public TipoAvaliacoes getTipoAvaliacoes() {
		return tipoAvaliacoes;
	}
	public void setTipoNota(TipoAvaliacoes tipoAvaliacoes) {
		this.tipoAvaliacoes =tipoAvaliacoes;
	}
	public BigDecimal getNota() {
		return nota;
	}
	public void setNota(BigDecimal nota) {
		this.nota = nota;
	} 
	
	
	

}
