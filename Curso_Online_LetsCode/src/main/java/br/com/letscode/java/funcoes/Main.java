package br.com.letscode.java.funcoes;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
//        saudacao(nome);

        int a = Integer.parseInt(JOptionPane.showInputDialog("1º Valor"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("2º Valor"));
        int som = soma(a, b);
        int sub = subtracao(a, b);
        int mult = multiplicacao(a, b);
        double div = divisao(a, b);

        impressao(a, b, som, sub, mult, div);
    }

    private static void impressao(int a, int b, int som, int sub, int mult, double div) {
        System.out.println(a + " + " + b + " = " + som);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " * " + b + " = " + mult);
        System.out.println(a + " / " + b + " = " + div);
    }

    private static double divisao(int a, int b) {
        double res = (double) a / b;
        return res;
    }

    private static int multiplicacao(int a, int b) {
        int res =  a * b;
        return res;
    }

    private static int subtracao(int a, int b) {
        int res =  a - b;
        return res;
    }

    private static int soma(int a, int b) {
        int res =  a + b;
        return res;
    }

//    public static void saudacao(String nome){
//        System.out.println("Hello, " + nome);
//    }
}
