package test;

import domain.Cachorro;
import domain.Cliente;
import domain.PorteAnimal;
import domain.TipoTosa;

import java.time.LocalDate;

public class TesteCalcularPrecoBanho {
    public static void main(String[] args) {
        Cliente donaNina = new Cliente("JOHN DOO", "98366021009");
        LocalDate dataNascimentoNina = LocalDate.of(2000, 03, 03);
        Cachorro nina = new Cachorro("Nina", dataNascimentoNina, donaNina, PorteAnimal.M);

        System.out.println(nina.calcularPrecoBanho()); //preco banho cachorro M

    }
}
