package domain;

public enum PorteAnimal {
    P(10, "pequeno"),
    M(20, "médio"),
    G(30, "grande");

    private int precoBase;
    private String nomePorte;

    PorteAnimal(int precoBase, String nomePorte) {
        this.precoBase = precoBase;
        this.nomePorte = nomePorte;
    }

    public int getPrecoBase() {
        return precoBase;
    }

    public String getNomePorte() {
        return nomePorte;
    }
}
