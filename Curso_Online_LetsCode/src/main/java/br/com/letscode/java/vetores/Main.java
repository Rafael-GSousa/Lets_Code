package br.com.letscode.java.vetores;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//
//        int[] numero = new int[(int)(Math.random()*4+1)];
//        int[] numero2 = new int[4];
//        numero2[0] = 1;
//        numero2[1] = 3;
//        numero2[2] = 5;
//        numero2[3] = 7;
////        System.out.println("[" + numero2[0] + ", " + numero2[1] + ", " + numero2[2] + ", " + numero2[3] + "]");
////        System.out.print("[");
////        System.out.print(numero2[0] + numero2[1] + numero2[2] + numero2[3]);
////        System.out.println("]");
//        for (int num : numero2) {
//            System.out.print(num + " ");
//        }
//
////        for (int i = 0; i < 1; i++){
////            System.out.print(Arrays.toString(numero));
////        }
//        System.out.print("\n");
//        for(int i = 0; i < numero.length; i++){
//            numero[i] = (int) (Math.random() * 10 + 1);
//            System.out.print(numero[i] + " ");
//        }
//
//        System.out.print("\n" + Arrays.toString(numero));
//
//        System.out.print("\n");
//
//        for(int i = 0; i < numero.length; i++){
//            numero[i] = (int) Math.pow(numero[i], 2);
//            System.out.print(numero[i] + " ");
//        }
//
//        System.out.println("\n" + Arrays.toString(numero));
//
//        String[] letras = {"A", "B", "C", "D", "E"};
//        for( String letter : letras){
//            System.out.print(letter + " ");
//        }
//        System.out.println(" ===> " + Arrays.toString(letras));

        int[] numeros = {9, 10, 12, 25, 2};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for(int i =0; i < numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
            if(numeros[i] < menor){
                menor = numeros[i];
            }
            media += numeros[i];
        }
        System.out.println(maior);
        System.out.println(menor);
        System.out.println(media / numeros.length);

    }
}
