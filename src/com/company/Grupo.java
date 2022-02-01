package com.company;

public class Grupo {

    private String nomeGrupo;
    private int numeroPessoas;
    private float precoPessoa;

    public Grupo(String nomeGrupo, int numeroPessoas, float precoPessoa) {
        this.nomeGrupo = nomeGrupo;
        this.numeroPessoas = numeroPessoas;
        this.precoPessoa = precoPessoa;
    }

    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public void setNomeGrupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    public float getPrecoPessoa() {
        return precoPessoa;
    }

    public void setPrecoPessoa(float precoPessoa) {
        this.precoPessoa = precoPessoa;
    }

    public float getTotalPreco(){
        return numeroPessoas*precoPessoa;
    }

    public  int getTotalPessoa(){
        return numeroPessoas;
    }
}
