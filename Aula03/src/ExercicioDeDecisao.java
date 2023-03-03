import java.util.Scanner;

public class ExercicioDeDecisao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double media, n1, n2;

        System.out.println("Ingresse as duas notas: ");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();

        media = (n1 + n2) / 2;

        if(media > 7){
            System.out.println("A media é " + media + ",aluno aprovado.");
        }
    }
}
