package test;

import domain.Cachorro;
import domain.Cliente;
import domain.PorteAnimal;

import java.time.LocalDate;

public class TesteCalcularPrecoBanho {
    public static void main(String[] args) {
        Cliente donaNina = new Cliente();
        LocalDate dataNascimentoNina = LocalDate.of(2000, 03, 03);
        Cachorro nina = new Cachorro("Nina", dataNascimentoNina, donaNina, PorteAnimal.M);

        System.out.println(nina.calcularPrecoBanho()); //preco banho cachorro M
        System.out.println("teste");

    }
}
