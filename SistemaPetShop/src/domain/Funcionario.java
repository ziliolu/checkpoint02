package domain;

public class Funcionario {
    private String nome;
    private String cpf;
    private Double salario;
    private Double percComissao;
    private PetShop petShop;

    public Funcionario(String nome, String cpf, Double salario, PetShop petShop) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.petShop = petShop;
        this.percComissao = 0D;
    }

    public Double calcularComissao(Double valorTotalVendas) {
        return valorTotalVendas * (percComissao / 100);
    }

    public Double calcularSalarioBase(Double valorTotalVendas) {
        return salario + calcularComissao(valorTotalVendas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getPercComissao() {
        return percComissao;
    }

    public void setPercComissao(Double percComissao) {
        this.percComissao = percComissao;
    }

    public PetShop getPetShop() {
        return petShop;
    }

    public void setPetShop(PetShop petShop) {
        this.petShop = petShop;
    }
}
