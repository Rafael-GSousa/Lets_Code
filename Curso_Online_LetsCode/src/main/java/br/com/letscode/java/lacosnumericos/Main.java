package br.com.letscode.java.lacosnumericos;

public class Main {
    public static void main(String[] args) {
        //1 2 3 4 5 6 7 8 9 10

//        for(int i = 1; i <= 10; i++){
//            System.out.println(i + " ");
//        }
//
//        for (int i = 1; i <= 2; i++){
//            for(int j = 1; j < 11; j++){
//                int res = j * i;
//                System.out.println(i + " x " + j + " = " + res);
//            }
//        }

        for (int i = 1; i < 11; i++){
            for(int j = i; j <= i; j++){
                for(int k = i; k <= i; k++){
                    int res = j * i * k;
                    System.out.println(i + " x " + j + " x " + k + " = " + res);
                }
            }
        }
    }
}
