package aplicaçãobanco;

public class Conta {
    
    private int numero;
    String titular;
    double saldo;
    private double limite;
    
    public boolean sacar(double valor){
        if(this.saldo>valor){
            this.saldo = this.saldo - valor;
            return true;
        }else{
            return false;
        }
    }
    
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
    
    boolean transfere(Conta destino, double valor){
        boolean retirou = this.sacar(valor);
        if(retirou == true){
           destino.depositar(valor);
           return true;
        }else{
            return false;
        }
    }    
    
}
