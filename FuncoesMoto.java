package oo.composicao;

import java.util.stream.DoubleStream;

public class FuncoesMoto {

	Moto moto = new Moto();
	
	double distancia=0;
	
	void ligar(){
		moto.ligada = true;
	}
	
	void desligar(){
		moto.ligada = false;
	}
	
	double kmTotal(double num) {
		return moto.km += distancia;
	}
	
	double rodou(double num ) {
		 return num;
	}
	
	boolean estaLigada() {
		if(moto.ligada == true) {
			return true;
		}else
			return false;
	}
		
}
