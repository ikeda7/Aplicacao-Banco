/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

public class Gerente extends Funcionario{
    
    private String senha;
    private int numeroFuncionariosGerenciados;
    
    public Gerente(String nome, String cpf, String endereco, double salario, String senha, int numeroFunc){
        super(nome, cpf, endereco, salario);
        this.senha = senha;
        this.numeroFuncionariosGerenciados = numeroFunc;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumeroFuncionariosGerenciados() {
        return numeroFuncionariosGerenciados;
    }

    public void setNumeroFuncionariosGerenciados(int numeroFuncionariosGerenciados) {
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }
    
    public boolean autentica(String senha) {
        if (this.senha.equals(senha)) {
            System.out.println("Acesso Permitido!");
            return true;
        } 
        else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("N° de funcionários geranciados: " + this.numeroFuncionariosGerenciados);
    }
}
