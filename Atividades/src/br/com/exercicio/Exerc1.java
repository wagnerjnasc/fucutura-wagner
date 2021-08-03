package br.com.exercicio;

public class Exerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = "Wagner";
		int n1, n2, media ;
		n1 = 1;
		n2 = 1;
		media = (n1 + n2) / 2;
		
		if (media >= 7 && media <= 10) {
			 System.out.println(nome+ ", você foi APROVADO!");	 
			} 		
		if (media >= 3 && media <= 6.9) {
			 System.out.println(nome+ ", você está RECUPERAÇÃO!");	 
			} else {
			 System.out.println(nome+ ", você foi REPROVADO!");	 
			} 
	}

}
