package Tarefa1;

import java.util.Scanner;

public class Exer6DistanEntrePontos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);			
		
		double x1, x2, y1, y2, d, r;
			
		System.out.println("Determine o valor de X1: ");
		x1 = ler.nextDouble();
		System.out.println("Determine o valor de x2: ");
		x2 = ler.nextDouble();
		System.out.println("Determine o valor de y1: ");
		y1 = ler.nextDouble();
		System.out.println("Determine o valor de y2: ");
		y2 = ler.nextDouble();
		
		r = ((x2-x1) * 2) + ((y2-y1) * 2);
	
		d = ((r * r) * 2);
		
		System.out.println("A distancia total entre os pontos estabeleciados �: " + d);
		
		

	}

}
