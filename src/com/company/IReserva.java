package com.company;


public interface IReserva
{
    void criaReserva(Reserva r) throws ReservaException;
    Reserva getMaiorGrupo();
}