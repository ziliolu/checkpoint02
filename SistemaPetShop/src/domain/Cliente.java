package domain;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<Animal> listaAnimais;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void listarAnimaisCliente() {
        String idade;
        System.out.println(String.format("Pet's cadastrados para o Cliente: %s", this.nome));
        for ( Animal animal: listaAnimais ) {

            idade = animal.calcularIdade() == 0 ? "Filhote" : animal.calcularIdade().toString();

            System.out.println(String.format("%s - idade: %s", animal.getNome(), idade));
        }
    }

    public void adicionarAnimal(Animal animal) {
        this.listaAnimais.add(animal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
