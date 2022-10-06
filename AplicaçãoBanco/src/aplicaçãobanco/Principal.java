/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicaçãobanco;

/**
 *
 * @author lukin
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        
        c1.titular = "Ikeda";
        c1.saldo = 1000.0;
        
        boolean result = c1.sacar(200);
        
        if(result) System.out.println("Saque realizado!\nSeu novo saldo: " + c1.saldo);
        else System.out.println("Saque nao concluido. Falta de saldo.");
    }
}
