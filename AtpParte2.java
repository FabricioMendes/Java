/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testatp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class AtpParte2 {

    public static ArrayList<Concursados> Concursados;
    public static ArrayList<Temporarios> Temporarios;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de Colaboradores:");
        int num = teclado.nextInt();
        teclado.nextLine();
        int cont = 0;

        Concursados = new ArrayList<>();
        Temporarios = new ArrayList<>();

        while (cont < num) {

            System.out.println("Qual é o nome do Colaborador?");

            String nome = teclado.nextLine();

            System.out.println("Qual é o salário do Colaborador?");

            double salario = teclado.nextDouble();

            System.out.println("É concursado ou temporário?");
            System.out.println("[1] Concursado");
            System.out.println("[2] Temporario");
            int tipo = teclado.nextInt();
            teclado.nextLine();

            if (tipo == 1) {

                System.out.println("Informe a Quantidade de tempo Trabalhado pelo Estado");
                int tempo = teclado.nextInt();
                teclado.nextLine();

                Concursados funcionario = new Concursados(nome, salario, tipo, tempo);

                Concursados.add(funcionario);
            } else {

                System.out.println("Informe a Quantidade de tempo Trabalhado");
                int tempo = teclado.nextInt();
                teclado.nextLine();

                Temporarios funcionario = new Temporarios(nome, salario, tempo, tempo);

                Temporarios.add(funcionario);
            }
            cont++;

        }

        Concursados.forEach((funcionario) -> {
            funcionario.imprimeConcursados();
        });
        Temporarios.forEach((funcionario) -> {
            funcionario.imprimeTemporarios();
        });
    }
}
