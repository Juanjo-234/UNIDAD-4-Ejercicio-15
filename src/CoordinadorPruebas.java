import java.util.List;

public class CoordinadorPruebas {
    public void ejecutarPruebasVelocidad(List<VehiculoCarrera> flota, int segundosPrueba) {
        System.out.println("==================================================");
        System.out.println("      INFORME DE PRUEBAS DE VELOCIDAD (PISTA)     ");
        System.out.println("==================================================");

        for (VehiculoCarrera vehiculo : flota) {
            System.out.println("• Tipo: " + vehiculo.getClass().getSimpleName());
            System.out.println("  Descripción: " + vehiculo.obtenerDesempeno());
            System.out.println("  Estado Inicial -> Velocidad: " + vehiculo.getVelocidadActual() + " km/h | Combustible: " + vehiculo.getCombustible() + " L");

            vehiculo.acelerar(segundosPrueba);

            System.out.println("  Estado Final   -> Velocidad: " + String.format("%.1f", vehiculo.getVelocidadActual()) + " km/h | Combustible: " + String.format("%.1f", vehiculo.getCombustible()) + " L");
            System.out.println("--------------------------------------------------");
        }
    }
}

