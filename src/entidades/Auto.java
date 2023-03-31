package entidades;

public class Auto extends Vehiculo {

    public Auto() {
        super();
    }

    public Auto(String marca, String patente, String combustible) {
        super(marca, patente, combustible);
    }
    
    @Override
    public double calcularCostoDeCombustible(double d) {
        return d*(7/100);
    }

    @Override
    public double costoPeaje() {
        return 200;
    }
}
