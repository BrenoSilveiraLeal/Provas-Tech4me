package Classes;

import java.time.LocalDate;

public class Status {
    private LocalDate datadaLocacao;
    private String CPF;
    private String codigoLivro;
    private LocalDate datadaDevolucao;
    private String statusdeDevolucao;

    public Status(LocalDate datadaLocacao, String CPF, String codigoLivro, LocalDate datadaDevolucao, String statusdeDevolucao) {
        this.datadaLocacao = datadaLocacao;
        this.CPF = CPF;
        this.codigoLivro = codigoLivro;
        this.datadaDevolucao = datadaDevolucao;
        this.statusdeDevolucao = statusdeDevolucao;
    }

    public LocalDate getDatadaLocacao() {
        return datadaLocacao;
    }

    public void setDatadaLocacao(LocalDate datadaLocacao) {
        this.datadaLocacao = datadaLocacao;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public String getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(String codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public LocalDate getDatadaDevolucao() {
        return datadaDevolucao;
    }

    public void setDatadaDevolucao(LocalDate datadaDevolucao) {
        this.datadaDevolucao = datadaDevolucao;
    }

    public String getStatusdeDevolucao() {
        return statusdeDevolucao;
    }

    public void setStatusdeDevolucao(String statusdeDevolucao) {
        this.statusdeDevolucao = statusdeDevolucao;
    }

    @Override
    public String toString() {
        return "Status [CPF=" + CPF + ", codigoLivro=" + codigoLivro + ", datadaDevolucao=" + datadaDevolucao
                + ", datadaLocacao=" + datadaLocacao + ", statusdeDevolucao=" + statusdeDevolucao + "]";
    }
}

