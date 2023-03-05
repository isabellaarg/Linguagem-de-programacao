package br.com.newton.main;

import br.com.newton.agenda.Contato;

import java.util.Scanner;

public class Telefone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Contato novoContato = new Contato();

        System.out.println("Ingresse um nome para o contato ");
        String nome1 = sc.nextLine();

        System.out.println("Ingresse o numero de telefone valido ");
        String tlf1 = sc.next();

        if(tlf1.length() == 9){
        }
        else {
            System.out.println("Telefone invalido");
        }
    }
}
