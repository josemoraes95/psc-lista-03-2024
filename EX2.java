//Aluno: José Moraes
//Data: 16/03/2024
/*2. Escreva o algoritmo de uma máquina de venda automática de salgadinhos, doces,
sucos e refrigerantes. O algoritmo deve calcular o menor número de notas que deve
ser dado de troco para um pagamento efetuado.
O algoritmo deve ler o valor da compra e o valor pago. Se o valor pago for menor que
o valor da compra, a máquina deve apresentar uma mensagem, informando que a
quantia paga é insuficiente para realizar a compra. A máquina aceita apenas notas de
R$ 50,00, R$ 20,00, R$ 10,00, R$ 5,00, R$ 2,00 e R$ 1,00.*/

import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int precoProduto,pagamento,troco;
        int nota50,nota20,nota10,nota5,nota2,nota1;

        System.out.println("MAQUINA DE VENDAS");
        System.out.println("ATENÇÃO! A maquina aceita somente notas de 1,2,5,10,20 e 50 reais");
        System.out.print("Qual o valor do produto que esta comprando: ");
        precoProduto = scanner.nextInt();
        System.out.print("Quanto dinheiro voce coloca na maquina: ");
        pagamento = scanner.nextInt();
        troco = pagamento - precoProduto;
            if (pagamento < precoProduto ){
                System.out.println("VALOR INSUFICIENTE!");

            }
            else{

                nota50 = troco/50;
                troco %= 50;

                nota20 = troco/20;
                troco %= 20;

                nota10 = troco/10;
                troco %= 10;

                nota5 = troco/5;
                troco %= 5;

                nota2 = troco/2;
                troco %= 2;

                nota1 = troco;

                System.out.printf("Notas de 50 = %d\n",nota50);
                System.out.printf("Notas de 20 = %d\n",nota20);
                System.out.printf("Notas de 10 = %d\n",nota10);
                System.out.printf("Notas de 5 = %d\n",nota5);
                System.out.printf("Notas de 2 = %d\n",nota2);
                System.out.printf("Notas de 1 = %d",nota1);
            }
        }
}