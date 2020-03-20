/*
Adona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados pelos números 0a9.

Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N representando o 
número de estudantes que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes.
Para cada registro de aluguel, informar o nome e email do estudante, bem como qual dos quartos ele escolheu (de 0 a 9).
Suponha quesejaescolhidoumquartovago.Aofinal,seuprogramadeveimprimir um relatório de todas ocupações do pensionato, 
por ordem de quarto, conformeexemplo.
*/
package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Quarto;

public class Programa {

	public static void main(String[] args) 
	{
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Quarto[] vetor = new Quarto[10];
		
		System.out.print("Digite a quantidade de quartos: ");
		int n = sc.nextInt();
		
		for(int i = 0;i < n; i++) 
		{
			sc.nextLine();
			System.out.printf ("Cadastro# "+ i+"\n");
			
			System.out.print("Nome:");
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Numero do Quarto: ");
			int numeroQuarto = sc.nextInt();
					
			vetor[numeroQuarto]	= new Quarto(nome, email, numeroQuarto);
		}

		System.out.println("Registro dos Quartos: ");
		for(int i = 0; i < vetor.length; i++)
		{
			if(vetor[i] != null) 
			{
				System.out.printf("# "+vetor[i].getQuarto()+": " + vetor[i].getNome()+", "+vetor[i].getEmail()+"\n");
			}
		}		
		sc.close();
		
	}

}
