/*
 Lê os dados de n (entre 1 e 100) funcionários fornecidos pela entrada padrão (teclado). 
Calcula o valor mensal recebido por cada funcionário. 
Imprime na saída padrão (tela) a relação de n funcionários com os correspondentes valores
mensais recebidos, apresentando primeiramente todos os concursados e, em seguida, os temporários. 
Para cada funcionário, devem ser fornecidos os seguintes dados:  
Código: um valor inteiro (int). 
Tipo: o valor (int) 1 para funcionário concursado ou o valor 2 para funcionário temporário. 
Salário-base: um valor real (double). 
Tempo: um valor inteiro (int) correspondente ao número de anos de contratação para funcionário 
concursado ou ao número de meses do período de contrato para um funcionário temporário.
 */
package testatp;

import java.util.Scanner;

/**
 *
 * @author Fabricio de Souza Mendes 03/06/2020
 */
public class TestAtp {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de Colaboradores:");
        int num = teclado.nextInt();teclado.nextLine();

        String[] lNome = new String[num];
        double[] lSalario = new double[num];
        int[] lTipo = new int[num];
        int[] lTempo = new int[num];

        int cont = 0;
        
        while (cont < num) {

            System.out.println("Qual é o nome do Colaborador?");

            lNome[cont] = teclado.nextLine();

            System.out.println("Qual é o salário do Colaborador?");

            lSalario[cont] = teclado.nextDouble();

            System.out.println("É concursado ou temporário?");
            System.out.println("[1] Concursado");
            System.out.println("[2] Temporario");
            lTipo[cont] = teclado.nextInt();teclado.nextLine();

            if (lTipo[cont] == 1) {

                System.out.println("Informe a Quantidade de tempo Trabalhado pelo Estado");
                lTempo[cont] = teclado.nextInt();teclado.nextLine();

            } 
             else {

                System.out.println("Informe a Quantidade de tempo Trabalhado");
                lTempo[cont] = teclado.nextInt();teclado.nextLine();

            }
            cont++;

        }

        for (int i = 0; i < num; i++) {
            if (lTipo[i] == 1) {

                System.out.println("====== Concursados ======");
                System.out.println("Nome:" + lNome[i]);
                System.out.println("Salario:" + lSalario[i]);
                System.out.println("Concursado:" + lTipo[i]);
                System.out.println("Tempo:" + lTempo[i]);
            }

        }
        for (int i = 0; i < num; i++) {

            if (lTipo[i] == 2) {

                System.out.println("====== Temporários ======");
                System.out.println("Nome:" + lNome[i]);
                System.out.println("Salario:" + lSalario[i]);
                System.out.println("Temporário:" + lTipo[i]);
                System.out.println("Tempo:" + lTempo[i]);
            }
        }
    }
}
