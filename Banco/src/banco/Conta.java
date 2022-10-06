/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

public class Conta {
    
    //Atributos
    private int numero;
    private double saldo;
    private double limite;
    private Cliente titular;
    
    //Construtores
    Conta(){
    }
    
    Conta(int numero, double saldo, double limite, Cliente titular){
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.titular = titular;
    }

    //Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    //Métodos
    public boolean saca(double valor){
        if(this.saldo > valor){
            this.saldo = this.saldo - valor;
            return true;
        }
        else return false;
    }
    
    /*void saca(double valor){
        this.saldo = this.saldo - valor;
    }*/
    
    public void deposita(double valor){
        this.saldo = this.saldo + valor;
    }
    
    public boolean transfere(Conta destino, double valor){
        boolean retirou = this.saca(valor);
        if(retirou == true){
            destino.deposita(valor);
            return true;
        }
        else return false;
    }
    
    public void imprimir(){
        System.out.println("\nConta\nN° conta: " + this.numero +
                           "\nSaldo: " + this.saldo +
                           "\nLimite: " + this.limite);
        this.titular.imprimir();
    }
    
}

