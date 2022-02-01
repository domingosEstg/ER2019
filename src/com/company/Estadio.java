package com.company;

import java.util.Map;

public class Estadio implements IReserva {
    private Map<Integer, Reserva> reservas;

    public Estadio(Map<Integer, Reserva> reservas) {
        this.reservas = reservas;
    }

    public Map<Integer, Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Map<Integer, Reserva> reservas) {
        this.reservas = reservas;
    }


    @Override
    public void criaReserva(Reserva r) throws ReservaException {
        if (this.reservas.containsKey(r.getNumeroReserva())) {
            throw new ReservaException("Reserva ja existe");
        } else {
            this.reservas.put(r.getNumeroReserva(), r);
        }
    }

    @Override
    public Reserva getMaiorGrupo() {
        Reserva reserva = null;

        for (Reserva r : reservas.values()) {
            if (reserva == null) {
                 reserva = r;
            } else {
                if(r.getTotalReserva() > reserva.getTotalReserva())reserva = r;
            }
        }
        return reserva;
    }

}
