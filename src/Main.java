//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

        CoordinadorPruebas coordinador = new CoordinadorPruebas();

        List<VehiculoCarrera> flotaVehiculos = List.of(new MonoplazaF1(50.0, 100.0), new AutoRally(30.0, 80.0), new Motocicleta(20.0, 50.0));

        coordinador.ejecutarPruebasVelocidad(flotaVehiculos, 5);
}
