package br.com.letscode.java.operadoresbooleanostabelaverdade;

public class Main {
    public static void main(String[] args) {
        // write your code here
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println(vamosAPraia);

        // Tabela Verdade

        /* Operador && (AND - E)
        1. true && true = true
        2. true && false = false
        3. false && true = false

        /* Operador || (OR - OU)
        1. true || true = true
        2. true || false = true
        3. false || true = true
        4. false || false = false */

        // Operador ternário
        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);
    }
}
