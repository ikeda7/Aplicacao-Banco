/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

public class Cliente {
    
    //Atributos
    private String nome;
    private String sobrenome;
    private String cpf;
    
    //Construtores
    Cliente(){
    }
    
    Cliente(String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    //Métodos
    public void imprimir(){
        System.out.println("\nCliente: " + this.nome + " " + this.sobrenome +
                           "\nCPF: " + this.cpf);
    }
    
}
