public abstract class VehiculoCarrera {
    protected double velocidadActual;
    protected  double combustible;

    public VehiculoCarrera(double velocidadActual, double combustible){
        this.velocidadActual = velocidadActual;
        this.combustible = combustible;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public double getCombustible() {
        return combustible;
    }

    public abstract void acelerar(int segundos);
    public abstract String obtenerDesempeno();
}
