/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;

public class Banco {
    
    private String nome;
    private ArrayList<Conta> contas;
    
    Banco(String nome){
        this.nome = nome;
        this.contas = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }
    
    public void adicionarConta(Conta conta){
        this.contas.add(conta);
    }
    
    public void excluirConta(int numero){
        for(Conta conta : this.contas){
            if(conta.getNumero() == numero){
                this.contas.remove(conta);
                break;
            }
        }
    }
    
    public boolean buscarConta(int numero){
        for(Conta conta : this.contas){
            if(conta.getNumero() == numero) return true;
        }
        return false;
    }
    
    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        for(Conta conta : this.contas){
            conta.imprimir();
        }
    }
    
}
