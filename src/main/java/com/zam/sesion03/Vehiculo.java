package com.zam.sesion03;

import java.math.BigDecimal;

public abstract class Vehiculo {
    private final String placa;
    private final int horas;

    protected Vehiculo(String placa, int horas) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("La placa es obligatoria.");
        }
        if (horas <= 0) {
            throw new IllegalArgumentException("Las horas deben ser mayores a 0.");
        }

        this.placa = placa;
        this.horas = horas;
    }

    public abstract BigDecimal calcularTarifa();

    public abstract String getTipo();

    public String getPlaca() {
        return placa;
    }

    public int getHoras() {
        return horas;
    }
}
