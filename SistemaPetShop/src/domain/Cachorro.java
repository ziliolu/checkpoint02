package domain;

import java.time.LocalDate;

public class Cachorro extends Animal{

    String racaCachorro;
    double precoFixoBanho;

    public Cachorro(String nome, LocalDate dataNascimento, Cliente dono, PorteAnimal porte) {
        super(nome, dataNascimento, dono, porte);
        precoFixoBanho = 20D;
    }

    //exemplo sobrecarga
    public Cachorro(String nome, LocalDate dataNascimento, Cliente dono, PorteAnimal porte, String racaCachorro) {
        super(nome, dataNascimento, dono, porte);
        this.racaCachorro = racaCachorro;
        precoFixoBanho = 20D;
    }

    @Override
    public double calcularPrecoBanho() {
        return this.precoFixoBanho + this.porte.getPrecoBase();
    }

    public double calcularPrecoTosa(TipoTosa tipoTosa) {
        return tipoTosa.getPrecoBase() + this.porte.getPrecoBase();
    }
}
