/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testatp;

/**
 *
 * @author User
 */
public class Concursados {

    public String nome;
    public double salario;
    public float tempo;
    public int tipo;

    public Concursados(String nome, double salario, float tempo, int tipo) {
        this.nome = nome;
        this.salario = salario;
        this.tempo = tempo;
        this.tipo = tipo;
    }
    public void imprimeConcursados(){
        
        System.out.println("====== Concursados ======");
        System.out.println("Nome:" + this.nome);
        System.out.println("Salario:" + this.salario);
        System.out.println("Concursado:" + this.tipo);
        System.out.println("Tempo:" + this.tempo);
                
    }
    
   

 }
