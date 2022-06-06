
package problema4;

public class Cheque {

    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comision;

    public Cheque(double c) {
        nombreCliente = "Jaime";
        nombreBanco = "Banco del Pacifico";
        valorCheque = c;

    }

    public Cheque(String c, String d) {
        nombreCliente = c;
        nombreBanco = d;
        valorCheque = 500;

    }

    public void establecerNombreCliente(String c) {
        nombreCliente = c;
    }

    public void establecerNombreBanco(String c) {
        nombreBanco = c;
    }

    public void establecerValorCheque(double c) {
        valorCheque = c;
    }

    public void establecerComision() {
        comision = valorCheque * ((valorCheque * 0.003) / 100);

    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenercomision() {
        return comision;
    }

    @Override
    public String toString() {
        String cadena = String.format("El nombre del cliente es %s\n"
                + "El nombre del banco es "
                + " %s\nEl valor del cheque es "
                + "%s\nEl valor de la comision es %s\n",
                obtenerNombreCliente(),
                obtenerNombreBanco(), obtenerValorCheque(),
                obtenercomision());
        return cadena;
    }
}
