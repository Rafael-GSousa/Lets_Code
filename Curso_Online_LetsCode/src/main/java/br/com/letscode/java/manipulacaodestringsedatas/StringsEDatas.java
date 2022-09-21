package br.com.letscode.java.manipulacaodestringsedatas;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class StringsEDatas {
    public static void main(String[] args) {
        // Olá, {nome}! Hoje é {dia-da-semana}, BOM DIA!

        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
//        nome = nome.replaceAll("\\s+",""); //para não contar os espaços em branco
//        System.out.println("Seu nome da forma que você digitou ==> " + nome);
//        System.out.println("Seu nome todo em letra maiúscula ==> " + nome.toUpperCase());
//        System.out.println("Seu nome todo em letra minúscula ==> " + nome.toLowerCase());
//        System.out.println("Quantas letras tem seu nome ==> " + nome.length());
//        System.out.println(nome.equals(nome.toLowerCase()));
//        System.out.println(nome.equals(nome.toUpperCase()));
//        System.out.println(nome.equalsIgnoreCase(nome.toLowerCase()) + "e " + nome.equalsIgnoreCase(nome.toUpperCase()));

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        LocalDateTime agora = LocalDateTime.now();
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        int diaDoMes = hoje.getDayOfMonth();
        String mes = hoje.getMonth().getDisplayName(TextStyle.FULL, brasil);
        int ano = hoje.getYear();
        String saudacao;
        StringBuffer mensagem = new StringBuffer();
        mensagem.append("Olá, " + nome + "! Hoje é " + diaDaSemana + ", " + diaDoMes + " de " + mes + " de " + ano + ". ");

        if(agora.getHour() >= 0 && agora.getHour() < 12){
            mensagem.append(("Bom dia").toUpperCase());
            saudacao = "Bom dia!";
        }else if(agora.getHour() >= 12 && agora.getHour() < 18){
            mensagem.append(("Boa Tarde").toUpperCase());
            saudacao = "Boa tarde!";
        }else {
            mensagem.append(("Boa Noite").toUpperCase());
            saudacao = "Boa noite!";
        };
        mensagem.append("!");

        System.out.println(mensagem);
        System.out.printf("Olá, %s! Hoje é %s, %d de %s de %d. %s%n", nome, diaDaSemana, diaDoMes, mes, ano, saudacao.toUpperCase());


        System.out.println(agora.getHour() + ":" + agora.getMinute() + ":" + agora.getSecond());




    }
}