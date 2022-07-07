package test;

import domain.Cachorro;
import domain.Cliente;
import domain.Gato;
import domain.PorteAnimal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import static domain.InputExceptions.inputInteiro;

public class Main {
    static ArrayList<Cliente> listaClientes = new ArrayList<>();
    static ArrayList<Cachorro> listaCachorros = new ArrayList<>();
    static ArrayList<Gato> listaGatos = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao sistema de gerenciamento do PetCenter");
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("[1] - cadastrar um cliente | [2] - cadastrar um pet");

        Scanner sc = new Scanner(System.in);
        int opcao = inputInteiro();
        if (opcao != 1 && opcao != 2){
            System.out.println("Apenas as opções 1 ou 2 são aceitas.");
        } else if (opcao == 1){
            System.out.println("Nome do cliente:");
            String nomeCliente = sc.next();
            System.out.println("Cpf do cliente:");
            String cpfCliente = sc.next();
            listaClientes.add(new Cliente(nomeCliente, cpfCliente));
            System.out.println(nomeCliente + " cadastrado(a) com sucesso!");
        } else if (opcao == 2){
            System.out.println("[1] - Cachorro | [2] - Gato");
            opcao = inputInteiro();
            if (opcao != 1 && opcao != 2) {
                System.out.println("Apenas as opções 1 ou 2 são aceitas.");
            } else if (opcao == 1){
                System.out.println("Nome do cachorro:");
                String nomeCachorro = sc.next();
                System.out.println("Dia nascimento:");
                int diaNascimento = sc.nextInt();
                System.out.println("Mês nascimento:");
                int mesNascimento = sc.nextInt();
                System.out.println("Ano nascimento:");
                int anoNascimento = sc.nextInt();
                LocalDate nascimentoCachorro = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
                System.out.println("Porte animal: [P] - pequeno | [M] - médio | [G] - grande");
                char porte = sc.next().toUpperCase().charAt(0);
                if (porte == 'P'){
                    listaCachorros.add(new Cachorro(nomeCachorro, nascimentoCachorro, PorteAnimal.P));
                } else if (porte == 'M'){
                    listaCachorros.add(new Cachorro(nomeCachorro, nascimentoCachorro, PorteAnimal.M));
                } else {
                    listaCachorros.add(new Cachorro(nomeCachorro, nascimentoCachorro, PorteAnimal.G));
                }
                System.out.println(nomeCachorro + " cadastrado(a) com sucesso!");
                System.out.println("--- Dados Cadastrados ---");
                System.out.println("Nome: " + nomeCachorro.toUpperCase());
                System.out.println("Nascimento: " + nascimentoCachorro);
                System.out.println("Porte: " + porte);
            } else {
                System.out.println("Nome do gato:");
                String nomeGato = sc.next();
                System.out.println("Dia nascimento:");
                int diaNascimento = sc.nextInt();
                System.out.println("Mês nascimento:");
                int mesNascimento = sc.nextInt();
                System.out.println("Ano nascimento:");
                int anoNascimento = sc.nextInt();
                LocalDate nascimentoGato = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
                System.out.println("Porte animal: [P] - pequeno | [M] - médio | [G] - grande");
                char porte = sc.next().toUpperCase().charAt(0);
                if (porte == 'P'){
                    listaGatos.add(new Gato(nomeGato, nascimentoGato, PorteAnimal.P));
                } else if (porte == 'M'){
                    listaGatos.add(new Gato(nomeGato, nascimentoGato, PorteAnimal.M));
                } else {
                    listaGatos.add(new Gato(nomeGato, nascimentoGato, PorteAnimal.G));
                }
                System.out.println(nomeGato + " cadastrado(a) com sucesso!");
                System.out.println("--- Dados Cadastrados ---");
                System.out.println("Nome: " + nomeGato.toUpperCase());
                System.out.println("Nascimento: " + nascimentoGato);
                System.out.println("Porte: " + porte);
            }
        }
    }
}


