package test;

import domain.Cachorro;
import domain.Cliente;
import domain.PorteAnimal;

import java.time.LocalDate;

public class TestCalcularIdade {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Daniel", "05478659049");
        Cachorro cachorroP = new Cachorro("Maia", LocalDate.of(2000, 03, 03), cliente, PorteAnimal.P);
        Cachorro cachorroG = new Cachorro("Rex", LocalDate.of(2012, 06, 03), cliente, PorteAnimal.G);
        Cachorro cachorroM = new Cachorro("Toto", LocalDate.of(2022, 03, 03), cliente, PorteAnimal.M);

        cliente.adicionarAnimal(cachorroP);
        cliente.adicionarAnimal(cachorroG);
        cliente.adicionarAnimal(cachorroM);


/* FAZER AS EXCEPTIONS COM LISTA DE ANIMAIS*/
        System.out.println("teste");
        System.out.println(cachorroP.calcularIdade());

        cliente.listarAnimaisCliente();

    }
}
