//Aluno: José Moraes
//Data: 14/03/2024
/*. Escreva um algoritmo que leia 3 números a partir do teclado.
O algoritmo deve apresentar:
a. O maior número.
b. O menor número.
c. A média aritmética dos três números*/



import java.util.Scanner;

public class EX1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        float media;

        System.out.println("DIZ QUAL NUMERO É MAIOR E QUAL A MEDIA ENTRE ELES");
        System.out.print("Digite o primeiro numero: ");//pede o primeiro numero
        num1 = scanner.nextInt(); //lê o primeiro numero
        System.out.print("Digite o segundo numero: ");//pede o segundo numero
        num2 = scanner.nextInt(); //lê o segundo numero
        media = (num1 + num2) / 2f; //calcula a media entre eles
        if(num1 > num2){
            System.out.println("O primeiro numero é o maior!");//imprime caso o primeiro numero seja maior
        }
        else{
            System.out.println("O segundo numero é o maior!");//imprime caso o segundo numero seja maior
        }
        System.out.printf("A media entre os numeros é de %.2f",media); //imprime a media

        scanner.close();
        }

}