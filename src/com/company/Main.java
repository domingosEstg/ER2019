package com.company;

import java.util.Date;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Grupo grupo1 = new GrupoFamilia("Grupo1",20,20,10,10,20);
        Grupo grupo2 = new Grupo("Grupo2",12312,12312); 
        Grupo grupo3 = new GrupoIdosos("Grupo3",12312,12312,233,23); 
        
        IReserva iReserva = new Estadio(new HashMap<Integer,Reserva>());

        Reserva reserva = new Reserva(1, new Date());
        try {
            reserva.acrecentarGrupo(grupo1);
            reserva.acrecentarGrupo(grupo2);
            reserva.acrecentarGrupo(grupo3);
            iReserva.criaReserva(reserva);
        } catch (ReservaException e) {
            e.printStackTrace();
        }
        
        
        Reserva maiorReserva = iReserva.getMaiorGrupo();
        
        System.out.println("Numero da reserva " + maiorReserva.getNumeroReserva());
        System.out.println("Data da resersa " + maiorReserva.getDateReserva().toString());
        System.out.println("Total de Pessoas da reserva" + maiorReserva.getTotalReserva());
        for (Grupo g:maiorReserva.getGrupos().values()) {
            System.out.println("Nome do Grupo" + g.getNomeGrupo());
            System.out.println("Total de pessoas do grupo" + g.getTotalPessoa());
        }

	// write your code here
    }
}
