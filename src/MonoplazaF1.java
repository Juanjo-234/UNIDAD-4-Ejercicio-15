public class MonoplazaF1 extends VehiculoCarrera{
    public MonoplazaF1(double velocidadActual, double combustible){
        super(velocidadActual, combustible);
    }


    @Override
    public void acelerar(int segundos) {
        double incremento  = segundos * 15.0;
        velocidadActual += incremento;
        combustible -= segundos * 1.8;
        if (combustible < 0) combustible = 0;
    }

    @Override
    public String obtenerDesempeno() {
        return "\"Monoplaza F1 [Aerodinámica extrema, velocidad tope muy alta]\"";
    }
}
