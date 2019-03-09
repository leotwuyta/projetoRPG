package projetoRPG;

import java.util.Random;

@Entity

public class Personagem {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id; 
	private String nomePersonagem ;
	private Classe classe ;
	private String raca ;
	private String antecedentes ;
	private String tendencia ;
	private int experiencia;
	private Status status;
	private Equipamento equipamento;
	
	
	int rolardado(int tipodado) {
		
		if (tipodado <= 1) {
			System.out.println("Dado(s) invalidos");
			
		}else {
			Random random = new Random ();
			int dado = random.nextInt(tipodado) + 1;
			System.out.printf("%d, ",dado);			
		}
		
	}
	
	int rolarDados(int quantidadeDados, int tipoDado, int bonusDado) {
		int soma = 0;
		if (quantidadeDados <= 0 || tipoDado <=0) {
			System.out.println("Dafo invalido.");
			
		}else {
			
			Random random = new Random();
			for (int contador = 1; contador <= quantidadeDados; contador++) {
				int dados = random.nextInt(quantidadeDados) + 1;
				System.out.printf("%d, ",dados);
				soma += dados;
			}
			System.out.println(soma);
		}
		return soma;
	}
	
	int rolarAtributos() {
		Random rand = new Random();
		
		int soma = 0;
		
		for (int contador1 = 1;) 
	}

}
