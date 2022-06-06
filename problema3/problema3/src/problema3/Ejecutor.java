
package problema3;

public class Ejecutor {

    public static void main(String[] args) {

        double a = 14000;
        int c = 1102158463;
        Automotor i = new Automotor(a, c);
        i.establecerValorMatricula();
        String d = "Ford";
        int z = 2015;
        Automotor i2 = new Automotor(d, z);
        i2.establecerValorMatricula();
        System.out.printf("%s\n" + "------------------------------\n" + "%s\n",
                i, i2);
    }

}
