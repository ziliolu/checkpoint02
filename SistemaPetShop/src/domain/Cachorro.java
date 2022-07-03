package domain;

import java.time.LocalDate;

public class Cachorro extends Animal{

    public Cachorro(String nome, LocalDate dataNascimento, Cliente dono, PorteAnimal porte) {
        super(nome, dataNascimento, dono, porte);
    }

    @Override
    public double calcularPrecoBanho() {
        double precoFixoBanho = 20D;
        return precoFixoBanho + this.porte.getPrecoBase();
    }

    public double calcularPrecoTosa(TipoTosa tipoTosa) {
        return tipoTosa.getPrecoBase() + this.porte.getPrecoBase();
    }
}
