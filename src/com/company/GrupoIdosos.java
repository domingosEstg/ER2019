package com.company;

public class GrupoIdosos extends Grupo{

    private int numeroIdosos;
    private float precoIdoses;

    public GrupoIdosos(String nomeGrupo, int numeroPessoas, float precoPessoa, int numeroIdosos, float precoIdoses) {
        super(nomeGrupo, numeroPessoas, precoPessoa);
        this.numeroIdosos = numeroIdosos;
        this.precoIdoses = precoIdoses;
    }

    public int getNumeroIdosos() {
        return numeroIdosos;
    }

    public void setNumeroIdosos(int numeroIdosos) {
        this.numeroIdosos = numeroIdosos;
    }

    public float getPrecoIdoses() {
        return precoIdoses;
    }

    public void setPrecoIdoses(float precoIdoses) {
        this.precoIdoses = precoIdoses;
    }

    @Override
    public float getTotalPreco() {
        return numeroIdosos * precoIdoses +  super.getPrecoPessoa();
    }

    @Override
    public int getTotalPessoa() {
        return numeroIdosos+getNumeroPessoas();
    }
}
