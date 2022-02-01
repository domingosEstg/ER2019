package com.company;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Reserva {

    private int numeroReserva;
    private Date dateReserva;
    private Map<String,Grupo> grupos;

    public Reserva(int numeroReserva, Date dateReserva) {
        this.numeroReserva = numeroReserva;
        this.dateReserva = dateReserva;
        this.grupos = new HashMap<>();
    }

    public Date getDateReserva() {
        return dateReserva;
    }

    public void setDateReserva(Date dateReserva) {
        this.dateReserva = dateReserva;
    }

    public Map<String, Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(Map<String, Grupo> grupos) {
        this.grupos = grupos;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }


    public void acrecentarGrupo(Grupo g) throws ReservaException{
        if(this.grupos.containsKey(g.getNomeGrupo())){
            throw new ReservaException("GRupo ja existe");
        }else{
            this.grupos.put(g.getNomeGrupo(),g);
        }
    }

    public int getTotalReserva(){
        int count =0 ;
        for ( Grupo g: grupos.values()) {
            count += g.getTotalPessoa();
        }
        return count;
    }

    public int getTotalReserva1(){
        int count =0 ;
        for ( Grupo g: grupos.values()) {
            if( g instanceof  GrupoIdosos){
                count += g.getNumeroPessoas() + ((GrupoIdosos) g).getNumeroIdosos();
            }else if(g instanceof GrupoFamilia){
                count += g.getNumeroPessoas() + ((GrupoFamilia) g).getNumeroMenores() + ((GrupoFamilia) g).getNumeroBebes();
            }else{
                count += g.getNumeroPessoas();
            }
        }
        return count;
    }

    public int reservaFila(int N){
        int count =0;
        for ( Grupo g: grupos.values()) {
            if( g instanceof  GrupoIdosos){
                count += g.getNumeroPessoas() + ((GrupoIdosos) g).getNumeroIdosos();
            }else if(g instanceof GrupoFamilia){
                count += g.getNumeroPessoas() + ((GrupoFamilia) g).getNumeroMenores();
            }else{
                count += g.getNumeroPessoas();
            }
        }
        return N - count;
    }


}
