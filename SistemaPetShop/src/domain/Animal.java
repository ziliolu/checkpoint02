package domain;

import java.time.LocalDate;

public abstract class Animal {
    private String nome;
    private LocalDate dataNascimento;
    private Cliente dono;
    protected PorteAnimal porte;

    //falta adicionar cliente no construtor


    public Animal(String nome, LocalDate dataNascimento, Cliente dono, PorteAnimal porte) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.dono = dono;
        this.porte = porte;
    }

    public double calcularPrecoBanho() {
        return 0;
    }


}
