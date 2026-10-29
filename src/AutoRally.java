public class AutoRally extends VehiculoCarrera{
    public AutoRally(double velocidadActual, double combustible){
        super(velocidadActual, combustible);
    }


    @Override
    public void acelerar(int segundos) {
        double incremento  = segundos * 8.5;
        velocidadActual += incremento;
        combustible -= segundos * 1.2;
        if (combustible < 0) combustible = 0;
    }

    @Override
    public String obtenerDesempeno() {
        return "Auto de Rally [Tracción integral, versátil en tierra y asfalto]";
    }
}
