package br.com.letscode.java.estruturascondicionais;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota = scan.nextDouble();
        String graduacao;


        // if - else if - else
        if(nota >= 80){
            graduacao = "A";
        }else if(nota < 80 && nota >= 70){
            graduacao = "B";
        }else if(nota < 70 && nota >= 60){
            graduacao = "C";
        }else if(nota < 60 && nota >= 0){
            graduacao = "D";
        }else{
            graduacao = "";
        }

        switch (graduacao){
            case "A":
            case "B":
                System.out.println("Aluno Aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Aluno Reprovado");
                break;
            default:
                System.out.println("Graduação Inválida");
        }
    }
}
