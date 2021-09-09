package areaCasa;

import java.util.Scanner;

public class AreaCasa {

	public static void main(String[] args) {
		
		String nomeComodo;
		double largura;
		double comprimento;
		double areaComodo;
		double areaTotal = 0;
		String respostaUsuario;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("-------------------------------");
		System.out.println("Cálculo da Área de uma Casa!");
		System.out.println("-------------------------------");
		
		System.out.println("Deseja calcular a Área Total da sua Casa?\n" +"S = Sim\n" +"N = Não");
		respostaUsuario = leitor.next();
		System.out.println();
		
		if (respostaUsuario.equalsIgnoreCase("S")) {
			
			while (respostaUsuario.equalsIgnoreCase("S")) {
				System.out.println("Responda as perguntas abaixo para cada cômodo da sua casa!\n");
				
				System.out.println("Qual o nome do cômodo?");
				nomeComodo = leitor.next();
				
				System.out.println("Qual é a largura do cômodo?");
				largura = leitor.nextDouble();
				
				System.out.println("Qual é o comprimento do cômodo?");
				comprimento = leitor.nextDouble();
				
				areaComodo = comprimento * largura;
				areaTotal = areaTotal + areaComodo;
				
				System.out.println(nomeComodo +" tem " +areaComodo + " metros quadrados.\n");
				
				System.out.println("Deseja calcular mais cômodos?\n" +"S = Sim\n" +"N = Não");
				respostaUsuario = leitor.next();
				System.out.println();
				
			}
			
			leitor.close();
			System.out.println("A área total da casa é " +areaTotal +" metros quadrados.");
			
		} else {
			leitor.close();
			System.out.println("Obrigado por usar nossa aplicação!");
		}
	}

}
