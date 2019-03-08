package projetoRPG;

import java.util.Random;

public class Constituicao extends Atributo {

	
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
	
}
