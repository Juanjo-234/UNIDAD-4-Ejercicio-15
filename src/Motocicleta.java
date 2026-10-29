public  class Motocicleta extends VehiculoCarrera{
    public Motocicleta(double velocidadActual, double combustible){
        super(velocidadActual, combustible);
    }


    @Override
    public void acelerar(int segundos) {
        double incremento  = segundos * 12.0;
        velocidadActual += incremento;
        combustible -= segundos * 0.7;
        if (combustible < 0) combustible = 0;
    }

    @Override
    public String obtenerDesempeno() {
        return "Motocicleta [Relación peso-potencia alta, ágil y ligera]\"";
    }


}
