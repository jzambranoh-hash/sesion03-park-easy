package com.zam.sesion03;

import java.math.BigDecimal;

public class Auto extends Vehiculo {
    private static final BigDecimal TARIFA_POR_HORA = new BigDecimal("3.00");

    public Auto(String placa, int horas) {
        super(placa, horas);
    }

    @Override
    public BigDecimal calcularTarifa() {
        return TARIFA_POR_HORA.multiply(BigDecimal.valueOf(getHoras()));
    }

    @Override
    public String getTipo() {
        return "Auto";
    }
}
