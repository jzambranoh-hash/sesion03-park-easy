package com.zam.sesion03;

import java.math.BigDecimal;

public class Moto extends Vehiculo {
    private static final BigDecimal TARIFA_POR_HORA = new BigDecimal("1.50");

    public Moto(String placa, int horas) {
        super(placa, horas);
    }

    @Override
    public BigDecimal calcularTarifa() {
        return TARIFA_POR_HORA.multiply(BigDecimal.valueOf(getHoras()));
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
}
