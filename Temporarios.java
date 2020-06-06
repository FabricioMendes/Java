/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testatp;

/**
 *
 * @author Fabricio de Souza Mendes 06/06/2020
 */
public class Temporarios {

    public String nome;
    public double salario;
    public float tempo;
    public int tipo;

    public Temporarios(String nome, double salario, float tempo, int tipo) {
        this.nome = nome;
        this.salario = salario;
        this.tempo = tempo;
        this.tipo = tipo;
    }

    public void imprimeTemporarios() {

        System.out.println("====== Temporários ======");
        System.out.println("Nome:" + this.nome);
        System.out.println("Salario:" + this.salario);
        System.out.println("Concursado:" + this.tipo);
        System.out.println("Tempo:" + this.tempo);
    }
}
