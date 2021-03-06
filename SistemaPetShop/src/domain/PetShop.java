package domain;

public class PetShop {
    private String nome;
    private String cnpj;
    private String cidade;
    private String telefone;
    private String horarioAbertura;
    private String horarioFechamento;

    public PetShop(String nome, String cnpj, String cidade) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.cidade = cidade;
    }

    public void exibirHorarioAtendimento() {
        System.out.println(String.format("Atende das %s às %s", horarioAbertura, horarioFechamento));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getHorarioAbertura() {
        return horarioAbertura;
    }

    public void setHorarioAbertura(String horarioAbertura) {
        this.horarioAbertura = horarioAbertura;
    }

    public String getHorarioFechamento() {
        return horarioFechamento;
    }

    public void setHorarioFechamento(String horarioFechamento) {
        this.horarioFechamento = horarioFechamento;
    }
}
