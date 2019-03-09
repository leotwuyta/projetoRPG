package projetoRPG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// @Entity

public class Personagem {
	
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id; 
	private String nomePersonagem ;
	private Classe classe ;
	private String raca ;
	private String antecedentes ;
	private String tendencia ;
	private Integer experiencia;
	private Status status;
	private Equipamento equipamento;
		
	int rolarDado(int tipodado) {
		int resultado = 0 ;
		if (tipodado <= 1) {
			System.out.println("Dado invalido");
			
		}else {
			Random random = new Random ();
			resultado = random.nextInt(tipodado) + 1;
			System.out.printf("%d, ",resultado);	
			
		}
		return resultado ;
	}
	
	int rolarDadosComBonus(int quantidadeDados, int tipoDado, int bonusDado) {
		
		int soma = 0;
		
		if (quantidadeDados <= 0 || tipoDado <=0) {
			System.out.println("Dado invalido.");
			
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
	
	ArrayList rolarAtributos() {
		
		ArrayList<Integer> resultadoOrdenado = new ArrayList<Integer>();
		
		for (int atributo = 1; atributo <= 6; atributo++) {
		
			ArrayList<Integer> resultadoAtributo = new ArrayList<Integer>();
			
			for (int dadoDeAtributo = 1; dadoDeAtributo <= 4; dadoDeAtributo++) {

				resultadoAtributo.add(rolarDado(6)) ;
					
			}
			
			Collections.sort(resultadoAtributo);
            
			resultadoAtributo.remove(0);
			
			int soma = 0 ;
			for (Integer i : resultadoAtributo) {
				
				soma += i ;
			}
			
			if (soma < 8) {
				soma = 8 ;
			}
			
			resultadoOrdenado.add(soma) ;
			
		}
		Collections.sort(resultadoOrdenado);
        Collections.reverse(resultadoOrdenado);
		return resultadoOrdenado;
	}

}
