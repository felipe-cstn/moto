package oo.composicao;


import java.util.Random;
import java.util.Scanner;
import java.util.stream.DoubleStream;

@SuppressWarnings("unused")
public class TesteMoto {

	public static void main(String[] args) {
		FuncoesMoto func = new FuncoesMoto();
		Random gerador = new Random();
		
		double num = gerador.nextDouble();
		
		func.ligar();
		
		System.out.println("Esta ligada? "+func.estaLigada());
		
		func.rodou(num);
		
		System.out.println("Você andou "  + num + " Km");                                                                                                    
		System.out.println(func.kmTotal(num));
	}

}
