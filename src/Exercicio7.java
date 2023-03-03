/*

Escreva um programa em JAVA que solicite ao usuário um nome, 
armazene em uma variável e depois mostre o nome digitado em uma mensagem. 

*/


import javax.swing.JOptionPane;

public class Exercicio7 {

    public static void main(String[] args) {
	   String nome;		   
	   nome = JOptionPane.showInputDialog("Digite um nome:");
	   JOptionPane.showMessageDialog(null,nome);
    }

}
