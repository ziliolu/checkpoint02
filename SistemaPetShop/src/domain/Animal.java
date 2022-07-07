package domain;

import java.time.LocalDate;
import java.time.Period;

public abstract class Animal {
    private String nome;
    private LocalDate dataNascimento;
    private Cliente dono;
    protected PorteAnimal porte;

    public Animal(String nome, LocalDate dataNascimento, Cliente dono, PorteAnimal porte) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.dono = dono;
        this.porte = porte;
    }

    public Animal(String nome, LocalDate dataNascimento, PorteAnimal porte) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.porte = porte;
    }

    public double calcularPrecoBanho() {
        return 0;
    }

    public Integer calcularIdade() {
        LocalDate today = LocalDate.now();
        return Period.between(dataNascimento, today).getYears();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public PorteAnimal getPorte() {
        return porte;
    }

    public void setPorte(PorteAnimal porte) {
        this.porte = porte;
    }
}
