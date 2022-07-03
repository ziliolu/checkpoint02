package domain;

public enum PorteAnimal {
    P(10),
    M(20),
    G(30);

    private int VALUE;

    PorteAnimal(int VALUE) {
        this.VALUE = VALUE;
    }

    public int getVALUE() {
        return VALUE;
    }
}
