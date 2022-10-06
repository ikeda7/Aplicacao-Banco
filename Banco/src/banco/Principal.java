/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

public class Principal {
    public static void main(String[] args) {
        
        Banco banco1 = new Banco("FCT BANK");
        
        Cliente cliente1 = new Cliente("Luke", "Skywalker", "001");
        Conta conta1 = new Conta(111, 2000.0, 5000.0, cliente1);
        Cliente cliente2 = new Cliente("Mestre", "Yoda", "002");
        Conta conta2 = new Conta(222, 1000000.0, 2000000.0, cliente2);
        Cliente cliente3 = new Cliente("Obi-Wan", "Kenobi", "003");
        Conta conta3 = new Conta(333, 500000.0, 500000.0, cliente3);
        
        banco1.adicionarConta(conta1);
        banco1.adicionarConta(conta2);
        banco1.adicionarConta(conta3);
        banco1.imprimir();
        
        if(banco1.buscarConta(222)) System.out.println("Encontrou!");
        else System.out.println("Não encontrou!");
        
        banco1.excluirConta(222);
        banco1.imprimir();

    }
}

/*
        Gerente g1 = new Gerente("Anakin", "123", "Rua Tatooine N° 41", 2200.0, "vader", 12);
        g1.imprimir();
*/

/*
        Cliente c1 = new Cliente("Luke", "Skywalker", "001");
        Cliente c2 = new Cliente("Mestre", "Yoda", "002");
        Cliente c3 = new Cliente("Obi-Wan", "Kenobi", "003");
        Cliente c4 = new Cliente("Qui-Gon", "Jinn", "004");
        
        ArrayList<Cliente> clientes = new ArrayList();
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);

        for(Cliente c : clientes){
            c.imprimir();
        }
*/

/*
        Cliente cliente1 = new Cliente("Luke", "Skywalker", "001");
        cliente1.imprimir();
        
        Conta conta1 = new Conta(123, 2000.0, 5000.0, cliente1);
        conta1.imprimir();
        
*/

/*
        Conta minhaConta = new Conta();
        Cliente c = new Cliente();
        minhaConta.titular = c;
*/

/*
        Conta minhaConta;
        minhaConta = new Conta();
        
        minhaConta.dono = "Luke";
        minhaConta.saldo = 1000.0;
        
        boolean result = minhaConta.saca(2000);
        
        if(result) System.out.println("Saque realizado!");
        else System.out.println("Saque não realizado, falta de saldo!");
        
        minhaConta.deposita(500);
        
        System.out.println("Saldo atual: " + minhaConta.saldo);
*/

/*
        Conta c1 = new Conta();
        c1.dono = "Luke";
        c1.saldo = 227;
        
        Conta c2 = new Conta();
        c2.dono = "Luke";
        c2.saldo = 227;
*/