package Tarefa1;

import java.util.Scanner;

public class Exer5Media {

	public static void main(String[] args) {		
		Scanner ler = new Scanner(System.in);		
		
		double p1, p2, p3, media;		

		System.out.println("Nota 1� Semestre ");
		p1 = ler.nextDouble();
		System.out.println("Nota 1� Semestre ");
		p2 = ler.nextDouble();
		System.out.println("Nota 1� Semestre ");
		p3 = ler.nextDouble();

		p1 = p1 * 2;
		p2 = p2 * 3;
		p3 = p3 * 5;

		media = (p1 + p2 + p3) /3;

		System.out.println("A m�dia final do aluno � " + (media));

	}

}
