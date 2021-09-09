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
		System.out.println("C�lculo da �rea de uma Casa!");
		System.out.println("-------------------------------");
		
		System.out.println("Deseja calcular a �rea Total da sua Casa?\n" +"S = Sim\n" +"N = N�o");
		respostaUsuario = leitor.next();
		System.out.println();
		
		if (respostaUsuario.equalsIgnoreCase("S")) {
			
			while (respostaUsuario.equalsIgnoreCase("S")) {
				System.out.println("Responda as perguntas abaixo para cada c�modo da sua casa!\n");
				
				System.out.println("Qual o nome do c�modo?");
				nomeComodo = leitor.next();
				
				System.out.println("Qual � a largura do c�modo?");
				largura = leitor.nextDouble();
				
				System.out.println("Qual � o comprimento do c�modo?");
				comprimento = leitor.nextDouble();
				
				areaComodo = comprimento * largura;
				areaTotal = areaTotal + areaComodo;
				
				System.out.println(nomeComodo +" tem " +areaComodo + " metros quadrados.\n");
				
				System.out.println("Deseja calcular mais c�modos?\n" +"S = Sim\n" +"N = N�o");
				respostaUsuario = leitor.next();
				System.out.println();
				
			}
			
			leitor.close();
			System.out.println("A �rea total da casa � " +areaTotal +" metros quadrados.");
			
		} else {
			leitor.close();
			System.out.println("Obrigado por usar nossa aplica��o!");
		}
	}

}
