package projeto.avaliacao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Teste {

	public static void main(String[] args) {

		CienciasHumanas cienciasHumanas = new CienciasHumanas();
		System.out.println("***CIÊNCIAS HUMANAS*** ");
		System.out.println("--Valores-- ");
		System.out.println("Redação: 20  ");
		System.out.println("Prova: 70 ");
		System.out.println("Exercícios: 10 ");
		System.out.println("Bonus: 10% da nota total ");		
		System.out.println();

		cienciasHumanas.setNomeAluno("Mislaine");
		cienciasHumanas.setNomeDisciplina("Português");
		System.out.println(cienciasHumanas.getNomeAluno());
		System.out.println(cienciasHumanas.getNomeDisciplina());
		

		List<Nota> notas = new ArrayList<Nota>();
		notas.add(new Nota(TipoAvaliacoes.REDACAO, new BigDecimal(20)));
		notas.add(new Nota(TipoAvaliacoes.PROVA, new BigDecimal(50)));
		notas.add(new Nota(TipoAvaliacoes.EXERCICIOS, new BigDecimal(20)));
		cienciasHumanas.setNotas(notas);
		cienciasHumanas.setBonus(10);
		System.out.println();
		System.out.println("Bonus: " + cienciasHumanas.calcularBonusTotal(cienciasHumanas.getBonus(), cienciasHumanas.calcularMedia()));
		System.out.println("Media: " + cienciasHumanas.calcularMedia());
		System.out.println("Media Final: " + cienciasHumanas.calcularMediaFinal(cienciasHumanas.calcularMedia(), cienciasHumanas.calcularBonusTotal(cienciasHumanas.getBonus(), cienciasHumanas.calcularMedia())));
		cienciasHumanas.calcularAprovacao(cienciasHumanas.calcularMediaFinal(cienciasHumanas.calcularMedia(), cienciasHumanas.calcularBonusTotal(cienciasHumanas.getBonus(), cienciasHumanas.calcularMedia())));
		System.out.println("-----------------------------");

		CienciasExatas cienciasExatas = new CienciasExatas();
		System.out.println("***CIÊNCIAS EXATAS*** ");
		System.out.println("---Valores--- ");
		System.out.println("Prova 1: 50 ");
		System.out.println("Prova 2: 40 ");
		System.out.println("Exercícios: 10 ");
		System.out.println("Nagativo: Cada negativo equivale 0,5 pontos");
		System.out.println();

		cienciasExatas.setNomeAluno("Mislaine");
		cienciasExatas.setNomeDisciplina("Matemática");
		System.out.println(cienciasExatas.getNomeAluno());
		System.out.println(cienciasExatas.getNomeDisciplina());
		
		
		List<Nota> notas1 = new ArrayList<Nota>();
		notas1.add(new Nota(TipoAvaliacoes.PROVA, new BigDecimal(50)));
		notas1.add(new Nota(TipoAvaliacoes.PROVA, new BigDecimal(30)));
		notas1.add(new Nota(TipoAvaliacoes.EXERCICIOS, new BigDecimal(05)));
		cienciasExatas.setNotas(notas1);
		cienciasExatas.setPenalidades(1);
		System.out.println();
		System.out.println("Negativos: " + cienciasExatas.calcularnegativos(cienciasExatas.getPenalidades()));
		System.out.println("Media: " + cienciasExatas.calcularMedia());
		System.out.println("Media Final: " + cienciasExatas.calcularMediaFinal(cienciasExatas.calcularMedia(), cienciasExatas.calcularnegativos(cienciasExatas.getPenalidades())));
		cienciasExatas.calcularAprovacao(cienciasExatas.calcularMediaFinal(cienciasExatas.calcularMedia(), cienciasExatas.calcularnegativos(cienciasExatas.getPenalidades())));
		System.out.println("-----------------------------");

		CienciasBiologicas cienciasBiologicas = new CienciasBiologicas();
		System.out.println("***CIÊNCIAS BIOLOGICAS*** ");
		System.out.println("--Valores-- ");
		System.out.println("Prova 1: 40 ");
		System.out.println("Prova 2: 40 ");
		System.out.println("Trabalho: 10 ");
		System.out.println("Exercícios: 10 ");
		System.out.println("Nagativo: Cada negativo equivale 0,5 pontos");
		System.out.println("Bonus: 10% da nota total ");
		System.out.println();

		cienciasBiologicas.setNomeAluno("Mislaine");
		cienciasBiologicas.setNomeDisciplina("Biologia");
		System.out.println(cienciasBiologicas.getNomeAluno());
		System.out.println(cienciasBiologicas.getNomeDisciplina());
		System.out.println();
		
		List<Nota> notas2 = new ArrayList<Nota>();
		notas2.add(new Nota(TipoAvaliacoes.PROVA, new BigDecimal(50)));
		notas2.add(new Nota(TipoAvaliacoes.PROVA, new BigDecimal(30)));
		notas2.add(new Nota(TipoAvaliacoes.EXERCICIOS, new BigDecimal(05)));
		notas2.add(new Nota(TipoAvaliacoes.TRABALHO, new BigDecimal(05)));
		cienciasBiologicas.setNotas(notas2);
		cienciasBiologicas.setPenalidades(1);
		cienciasBiologicas.setBonus(10);
		
		System.out.println("Negativos: " + cienciasBiologicas.calcularnegativos(cienciasBiologicas.getPenalidades()));
		System.out.println("Media: " + cienciasBiologicas.calcularMedia()); 
		System.out.println("Bonus: " + cienciasBiologicas.calcularBonusTotal(cienciasBiologicas.getBonus(), cienciasBiologicas.calcularMedia()));		
		System.out.println("Media Final: " + cienciasBiologicas.calcularMediaFinal(cienciasBiologicas.calcularMedia(), cienciasBiologicas.calcularBonusTotal(cienciasBiologicas.getBonus(), cienciasBiologicas.calcularMedia()), cienciasBiologicas.calcularnegativos(cienciasBiologicas.getPenalidades())));
		cienciasBiologicas.calcularAprovacao(cienciasBiologicas.calcularMediaFinal(cienciasBiologicas.calcularMedia(), cienciasBiologicas.calcularBonusTotal(cienciasBiologicas.getBonus(), cienciasBiologicas.calcularMedia()), cienciasBiologicas.calcularnegativos(cienciasBiologicas.getPenalidades())));
		System.out.println("-----------------------------");
		

	}
}