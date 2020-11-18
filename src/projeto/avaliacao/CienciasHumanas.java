package projeto.avaliacao;

import java.math.BigDecimal;
import java.util.Map;

public class CienciasHumanas extends Disciplinas {

	private int bonus;

	public CienciasHumanas() {
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public BigDecimal calcularMedia() {
		BigDecimal mediaT = BigDecimal.ZERO;

		for (Nota nota : notas) {

			mediaT = notas.stream().map(Nota::getNota).reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
		}

		return mediaT;

	}

	public BigDecimal calcularBonusTotal(int bonus, BigDecimal mediaT) {

		BigDecimal bonusTotal = mediaT.divide(new BigDecimal(bonus));
		return bonusTotal;

	}

	public BigDecimal calcularMediaFinal(BigDecimal mediaT, BigDecimal bonusTotal) {
		BigDecimal mediaFinal = BigDecimal.ZERO;
		mediaFinal = mediaT.add(bonusTotal);

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