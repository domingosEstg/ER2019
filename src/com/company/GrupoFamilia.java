package com.company;

public class GrupoFamilia extends Grupo {

    private int numeroMenores;
    private int precoMenor;
    private int numeroBebes;

    public GrupoFamilia(String nomeGrupo, int numeroPessoas, float precoPessoa, int numeroMenores, int precoMenor, int numeroBebes) {
        super(nomeGrupo, numeroPessoas, precoPessoa);
        this.numeroMenores = numeroMenores;
        this.precoMenor = precoMenor;
        this.numeroBebes = numeroBebes;
    }

    public int getNumeroMenores() {
        return numeroMenores;
    }

    public void setNumeroMenores(int numeroMenores) {
        this.numeroMenores = numeroMenores;
    }

    public int getPrecoMenor() {
        return precoMenor;
    }

    public void setPrecoMenor(int precoMenor) {
        this.precoMenor = precoMenor;
    }

    public int getNumeroBebes() {
        return numeroBebes;
    }

    public void setNumeroBebes(int numeroBebes) {
        this.numeroBebes = numeroBebes;
    }

    @Override
    public float getTotalPreco() {
        return numeroMenores * precoMenor + super.getPrecoPessoa();
    }

    @Override
    public int getTotalPessoa() {
        return numeroBebes + numeroMenores + getNumeroPessoas();
    }
}
