
package problema1;


public class problema1 {

    private String nombreEstudiante;
    private double calificacionMateria1;
    private double calificacionMateria2;
    private double calificacionMateria3;
    private double promCalificaciones;

    public problema1(double b, double c, double d) {
        nombreEstudiante = "Juan Pablo";
        calificacionMateria1 = b;
        calificacionMateria2 = c;
        calificacionMateria3 = d;

    }

    public problema1(String a, double b, double c, double d) {
        nombreEstudiante = a;
        calificacionMateria1 = b;
        calificacionMateria2 = c;
        calificacionMateria3 = d;

    }

    public void establecerNombreEstudiante(String c) {
        nombreEstudiante = c;
    }

    public void establecerCalifiacionMateria1(double c) {
        calificacionMateria1 = c;
    }

    public void establecerCalifiacionMateria2(double c) {
        calificacionMateria2 = c;
    }

    public void establecerCalifiacionMateria3(double c) {
        calificacionMateria3 = c;
    }

    public void establecerPromCalificaciones() {
        promCalificaciones = (calificacionMateria1 + calificacionMateria2
                + calificacionMateria3) / 3;

    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerCalifiacionMateria1() {
        return calificacionMateria1;
    }

    public double obtenerCalifiacionMateria2() {
        return calificacionMateria2;
    }

    public double obtenerCalifiacionMateria3() {
        return calificacionMateria3;
    }

    public double obtenerPromCalificaciones() {
        return promCalificaciones;
    }

    @Override
    public String toString() {
        String cadena = String.format("El nombre del estudiante %s\nLa "
                + "calificacion de "
                + "materia 1 es %s\nLa calificacion de materia 2 es "
                + "%s\nLa califiacion de materia 3 es %s\nEl promedio "
                + "final es de %s\n",
                obtenerNombreEstudiante(),
                obtenerCalifiacionMateria1(), obtenerCalifiacionMateria2(),
                obtenerCalifiacionMateria3(),
                obtenerPromCalificaciones());
        return cadena;
    }

}
