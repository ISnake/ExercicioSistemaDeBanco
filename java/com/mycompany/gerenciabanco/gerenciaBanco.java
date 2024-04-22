/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gerenciabanco;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author allan
 */
public class gerenciaBanco {
    
    static Scanner input = new Scanner(System.in);
    static ArrayList<Conta> contasBancarias;
    
    public static void main(String[] args) {
        contasBancarias = new ArrayList<Conta>();
        operacoes();
    }
    
    public static void operacoes(){                
            System.out.println("1.Criar Conta");
            System.out.println("2.Depositar");
            System.out.println("3.Sacar");
            System.out.println("4.Saldo");
            System.out.println("5.Listar");
            System.out.println("6.Sair");
            
            int operacao = input.nextInt();
            
            switch(operacao) {
                case 1:
                    criarConta();
                    break;
                case 2:
                    depositar();
                    break;
                case 3:
                    sacar();
                    break;
                case 4:
                    saldo();
                    break;
                case 5:
                    listarContas();
                    break;
                case 6:
                    System.out.println("Fim da operação");
                    System.exit(0);
                    
                default:
                    System.out.println("Opção inválida.");
                    operacoes();
                    break;
            }
    }
    
    public static void criarConta() {
        
        System.out.println("\nNome: ");
        String nome = input.next();
        
        System.out.println("\nSobrenome: ");
        String sobrenome = input.next();
        
        System.out.println("\nCPF: ");
        String cpf = input.next();
        
        System.out.println("\nEmail: ");
        String email = input.next();
        
        Pessoa pessoa = new Pessoa(nome, sobrenome, cpf, email);
        
        Conta conta = new Conta(pessoa);
        
        contasBancarias.add(conta);
        System.out.println("Sua conta foi criada com sucesso!");
        
        operacoes();
    }
    
    private static Conta encontrarConta(int numeroConta) {
        Conta conta = null;
        if(contasBancarias.size() > 0) {
            for(Conta c: contasBancarias) {
                if (c.getNumeroConta() == numeroConta);
                conta = c;
                
            }
        }
        return conta;
    }
    
    public static void depositar() {
        System.out.println("Número da conta: ");
        int numeroConta = input.nextInt();
        
        Conta conta = encontrarConta(numeroConta);
        if(conta != null) {
            System.out.println("Qual valor deseja depositar?");
            Double valorDeposito = input.nextDouble();
            conta.depositar(valorDeposito);
            System.out.println("Valor depositado com sucesso!");
        }else {
            System.out.println("Conta não encontrada!");
        }
        operacoes();
    }
    
    public static void sacar() {
        System.out.println("Número da conta: ");
                int numeroConta = input.nextInt();
        
        Conta conta = encontrarConta(numeroConta);
        if(conta != null) {
            System.out.println("Qual valor deseja sacar?");
            Double valorSaque = input.nextDouble();
            conta.sacar(valorSaque);
            //System.out.println("Valor sacado com sucesso!");
        }else {
            System.out.println("Conta não encontrada!");
        }
        operacoes();
        
    }
    
    public static void saldo() {
        System.out.println("Número da conta: ");
        int numeroConta = input.nextInt();
        if(contasBancarias.size() > 0) {
            for(Conta conta: contasBancarias) {
                System.out.println("\nSeu saldo é de: " + conta.getSaldo());
            }
        } else {
            System.out.println("Não há contas cadastradas.");
        }
        operacoes();
    }

    
    public static void listarContas() {
        if(contasBancarias.size() > 0) {
            for(Conta conta: contasBancarias) {
                System.out.println(conta);
            }
        } else {
            System.out.println("Não há contas cadastradas.");
        }
        operacoes();
    }
}