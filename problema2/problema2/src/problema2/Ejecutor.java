
package problema2;

public class Ejecutor {

    public static void main(String[] args) {

        double a = 120.00;
        int c = 1102158463;
        Instituto i = new Instituto(a, c);
        i.establecerSueldoTotal();
        String d = "Miguel";
        String z = "Ramirez";
        Instituto i2 = new Instituto(d, z);
        i2.establecerSueldoTotal();
         System.out.printf("%s\n" + "------------------------------\n" + "%s\n",
                i, i2);
        
    }

}
