package com.zam.sesion03;

import java.math.BigDecimal;

public class Camion extends Vehiculo {
    private static final BigDecimal TARIFA_POR_HORA = new BigDecimal("5.00");
    private static final BigDecimal CARGO_FIJO = new BigDecimal("10.00");

    public Camion(String placa, int horas) {
        super(placa, horas);
    }

    @Override
    public BigDecimal calcularTarifa() {
        return TARIFA_POR_HORA
                .multiply(BigDecimal.valueOf(getHoras()))
                .add(CARGO_FIJO);
    }

    @Override
    public String getTipo() {
        return "Camión";
    }
}
