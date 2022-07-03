package test;

import domain.Cachorro;
import domain.Cliente;
import domain.PorteAnimal;
import domain.TipoTosa;

import java.time.LocalDate;

public class TesteCalcularPrecoTosa {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Daniel", "05478659049");
        Cachorro cachorroP = new Cachorro("Maia", LocalDate.of(2000, 03, 03), cliente, PorteAnimal.P);

        double tosaTesouraCachorroP = cachorroP.calcularPrecoTosa(TipoTosa.TESOURA);
        System.out.println("Preco tosa na tesoura para um cachorro pequeno: R$" + tosaTesouraCachorroP); //calcular preco de tosa para cachorroP

        // --- o calculo é feito com base na soma entre preco base tipo de tosa + preco base porte do animal ---
        System.out.println("Preco base tosa " + TipoTosa.TESOURA.getNomeTosa() + ": R$" + TipoTosa.TESOURA.getPrecoBase());
        System.out.println("Preco base porte " + PorteAnimal.P.getNomePorte() + ": R$" + PorteAnimal.P.getPrecoBase());

    }
}
