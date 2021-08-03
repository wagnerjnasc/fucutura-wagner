package controle;

import entidade.Calculadora;

public class CalculadoraTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora c = new Calculadora();

		c.setOperandoEsquerdo(1);
		c.setOperandoDireito(5);
		System.out.println(c.toString());
		c.somar();

		Calculadora c1 = new Calculadora(5, 10.5);
		System.out.println(c1.toString());
		c1.somar();
		System.out.println(c1.somar(50, 10.5));
	}

}
