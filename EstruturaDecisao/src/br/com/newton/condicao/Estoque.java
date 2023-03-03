package br.com.newton.condicao;

import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int estoque;
        System.out.println("Ingresse a quantidade de estoque do produto: ");
        estoque = sc.nextInt();

        if(estoque >= 100){
            System.out.println("Produto com quantidade sufiente.");
        }
        else if (estoque < 100 && estoque > 50){
            System.out.println("Alerta: Avaliar possibilidade de novo pedido");
        }
        else{
            System.out.println("ATENÇÃO! Faça um novo pedido");
        }

    }
}
