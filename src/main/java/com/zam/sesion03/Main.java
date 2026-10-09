package com.zam.sesion03;

import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = List.of(
                new Auto("ABC-123", 3),
                new Moto("XYZ-789", 4),
                new Camion("TRK-456", 2)
        );

        BigDecimal totalRecaudado = BigDecimal.ZERO;

        System.out.println("placa | tipo | tarifa");
        for (Vehiculo vehiculo : vehiculos) {
            BigDecimal tarifa = vehiculo.calcularTarifa();
            System.out.printf(
                    Locale.ROOT,
                    "%s | %s | %.1f%n",
                    vehiculo.getPlaca(),
                    vehiculo.getTipo(),
                    tarifa
            );
            totalRecaudado = totalRecaudado.add(tarifa);
        }

        System.out.printf(Locale.ROOT, "Total recaudado: %.1f%n", totalRecaudado);
    }
}
