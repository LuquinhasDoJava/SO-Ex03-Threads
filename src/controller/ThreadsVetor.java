package controller;

public class ThreadsVetor extends Thread{
	
	private int []vet;
	private int valor;
	
	public ThreadsVetor(int []vet, int valor) {
		this.vet = vet;
		this.valor = valor;
	}
	@Override
	public void run() {
		int total = 0;
		long inicio = 0;
		if(valor % 2 == 0) {
			inicio = System.nanoTime();
			for (int i = 0; i<vet.length; i++){
			total += vet[i];
			}
		}else {
			inicio = System.nanoTime();
			for(int i:vet) {
				total += i;
			}
		}
		long fim = System.nanoTime();
		long temp = (fim - inicio);
		System.out.println(getId()+"# Valor total do vetor é:"+total+" e foram gastos 0.0000"+temp+" segundos.");
	}
}
