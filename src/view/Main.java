package view;

import java.util.Random;

import controller.ThreadsVetor;


public class Main {

	public static void main(String[] args) {
		
		int [] vetor = new int [1000];
		Random random = new Random(); 
		
		for(int x = 0; x<vetor.length; x++) {
				vetor[x] = random.nextInt(1, 101);
			}
		ThreadsVetor thread01 = new ThreadsVetor(vetor,1);
		ThreadsVetor thread02 = new ThreadsVetor(vetor,2);
		thread01.start();
		thread02.start();
	}

}
