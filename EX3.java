// bhaskara x= b²-4.a.c / x = (-b ± √Δ) / (2a)
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        double numA,numB,numC,res,delta,x1,x2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("EQUAÇÃO DE 2 GRAU");
        System.out.print("Digite o numero A: ");
        numA = scanner.nextDouble();
        System.out.print("Digite o numero B: ");
        numB = scanner.nextDouble();
        System.out.print("Digite o numero C: ");
        numC = scanner.nextDouble();

        delta = (numB * numB) - 4*numA * numC;

        if(numA == 0 && numB == 0 && numC != 0){
        System.out.print("Coeficientes informados incorretamente.");
        }

        else if(numA == 0 && numB !=0 ) {
            System.out.println("Esse é uma equaçao de primeiro grau");
            x1 = -numC / numB;
            System.out.printf("Resulatado: %.2f",x1);
        }
        else if (delta < 0){
            System.out.print("Esta equaçao nao possui raizes reais.");
        }
        else if(delta == 0){
            System.out.print("Esta equação possui duas raízes reais iguais.\n");
            x1 = -numB / (2 * numA);
            System.out.printf("A raiz da equaçao e x = %f",x1);

        }


        else {
            x1 = (-numB + Math.sqrt (delta)) / (2*numA);
            x2 = (-numB - Math.sqrt (delta)) / (2*numA);

            System.out.printf("As raizes da equaçao sao x1= %f e x2= %f ",x1,x2);

        }
    }



    }