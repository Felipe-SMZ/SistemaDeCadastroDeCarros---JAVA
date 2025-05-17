package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Carro;

public class Project {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Marca: ");
		String marca = sc.nextLine();
		System.out.print("Modelo: ");
		String modelo = sc.nextLine();
		System.out.print("Ano: ");
		int ano = sc.nextInt();
		System.out.print("Velocidade: ");
		double velocidade = 0;
		System.out.print(velocidade);
		Carro car = new Carro(marca, modelo, ano, velocidade);
		System.out.println("Km/h Acelerando... " + car.acelerar() + "Km/h");
		System.out.print("Acelere mais quantos Km/h: ");
		double acelerar = sc.nextDouble();
		System.out.println("... Acelerando ... " + car.acelerar(acelerar) + "Km/h");

		sc.close();

	}

}
