/*

Escreva um programa em JAVA que solicite ao usuário o seu peso(aqui entenda massa) em Kg (int) 
e a sua altura em metros (Double). Com estes dados calcule o IMC – Índice de Massa Corporal. 
Seguindo a seguinte fórmula.
IMC = massa / (altura * altura )
Mostre o resultado em uma mensagem. 

*/


import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class exercicio9ComArredondamento {

    public static void main(String[] args) {
	       int massa;
		   double altura,imc;		   
		   massa = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua massa em Kg:"));
		   altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura em metros:"));
		   imc = massa / (altura * altura ); 
		   
		   DecimalFormat aproximador = new DecimalFormat( " 0.00 " );
		   
		   
		   JOptionPane.showMessageDialog(null,"Seu IMC é: " + aproximador.format(imc));
    }

}
