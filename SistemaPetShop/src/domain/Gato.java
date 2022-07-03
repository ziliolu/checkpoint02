package domain;

import java.time.LocalDate;

public class Gato extends Animal{

    public Gato(String nome, LocalDate dataNascimento, Cliente dono, PorteAnimal porte) {
        super(nome, dataNascimento, dono, porte);
    }

    @Override
    public double calcularPrecoBanho() {
        double precoFixoBanho = 10D;
        return precoFixoBanho + this.porte.getPrecoBase();
    }
}
