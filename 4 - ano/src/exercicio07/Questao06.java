package exercicio07;

import java.util.Scanner;

public class Questao06 {
	/*O valor pago por um Hotel para seus porteiros � de R$ 12,25 por hora de trabalho. Fa�a um
	programa que pergunte ao usu�rio quantas horas ele trabalhou e imprima na tela o valor
	do sal�rio a ser recebido por ele.*/
	public static void main(String[] args) {
		
		double numeroEscolhido;
		double multiplicador = 0;
		
		Scanner input = new Scanner(System.in);
		Calculo calc = new Calculo();
		
		System.out.println("Fale a quantidade de horas que voc� deseja trabalhar: ");
		numeroEscolhido = input.nextDouble();
		
		System.out.println("Seu salario �: " + Calculo.multiplicarNumero(numeroEscolhido, multiplicador));
		
	}

}
