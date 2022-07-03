package domain;

public enum TipoTosa {

    HIGIENICA(10, "higiênica"),
    MAQUINA(20, "máquina"),
    TESOURA(25, "tesoura");

    //definicao dos valores base para cada tipo de tosa
    private int precoBase;
    private String nomeTosa;

    TipoTosa(int precoBase, String descricaoTosa) {
        this.precoBase = precoBase;
        this.nomeTosa = descricaoTosa;
    }

    public int getPrecoBase() {
        return precoBase;
    }

    public String getNomeTosa() {
        return nomeTosa;
    }
}
