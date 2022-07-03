package domain;

import java.time.LocalDate;

public class Cachorro extends Animal{

    public Cachorro(String nome, LocalDate dataNascimento, Cliente dono, PorteAnimal porte) {
        super(nome, dataNascimento, dono, porte);
    }

    @Override
    public double calcularPrecoBanho() {
        double precoFixoBanho = 20D;
        if (super.porte == PorteAnimal.P) {
            return precoFixoBanho + PorteAnimal.P.getVALUE();
        } else if (super.porte == PorteAnimal.M) {
            return precoFixoBanho + PorteAnimal.M.getVALUE();
        } else { //se o animal for grande
            return precoFixoBanho + PorteAnimal.G.getVALUE();
        }
    }
}
