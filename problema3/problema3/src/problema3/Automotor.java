
package problema3;

public class Automotor {

    private String marca;
    private int añoF;
    private double valorVehiculo;
    private double valorMatricula;
    private int cedula;

    public Automotor(double c, int d) {
        marca = "Chevrolet";
        añoF = 2012;
        valorVehiculo = c;
        cedula = d;

    }

    public Automotor(String c, int d) {
        marca = c;
        añoF = d;
        valorVehiculo = 25000;
        cedula = 1150648574;

    }

    public void establecerMarca(String c) {
        marca = c;
    }

    public void establecerAñoFabricacion(int c) {
        añoF = c;
    }

    public void establecerValorVehiculo(double c) {
        valorVehiculo = c;
    }

    public void establecerCedula(int c) {
        cedula = c;
    }

    public void establecerValorMatricula() {
        valorMatricula = ((valorVehiculo * 0.002) / 100) * (2022 - añoF);

    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAñoFabricacion() {
        return añoF;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public int obtenerCedula() {
        return cedula;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("LA cedula del dueño es %s\nLa marca de vehiculo es "
                + " %s\nEl año de fabricacion es "
                + "%s\nEl valor del vehiculo es %s\nEl valor de la matricula es "
                + "%s\n",
                obtenerCedula(),
                obtenerMarca(), obtenerAñoFabricacion(),
                obtenerValorVehiculo(),
                obtenerValorMatricula());
        return cadena;
    }
}
