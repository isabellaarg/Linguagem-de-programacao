package br.com.newton.condicao;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um numerto entre 1 e 4");
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("Voce escolheu 1");
                break;
            case 2:
                System.out.println("Voce escolheu 2");
                break;
            case 3:
                System.out.println("Voce escolheu 3");
                break;
            case 4:
                System.out.println("Voce escolheu 4");
                break;
            default:
                System.out.println("Numero invalido");
        }

    }


}
