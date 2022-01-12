package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;
import entidades.enums.Cor;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Forma> list = new ArrayList<>();
		
		System.out.print("Digite o número de forma: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Dados da forma #"+i);
			System.out.print("Retangulo ou Circulo (r/c)? ");
			char a = sc.next().charAt(0);
			System.out.print("Cor (Preto/Azul/Vermelho): ");
			Cor cor = Cor.valueOf(sc.next().toUpperCase());
			if(a=='r') {
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				System.out.println("Altura: ");
				double altura = sc.nextDouble();
				list.add(new Retangulo(cor, largura, altura));
			}if(a=='c') {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				list.add(new Circulo(cor, raio));
			}		
		}
			
		System.out.println("AREAS DE FORMA");
		for (Forma forma: list) {
			System.out.println(forma.area());
		}
		
		
		
		
		sc.close();

	}

}
