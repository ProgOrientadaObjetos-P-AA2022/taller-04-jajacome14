/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

/**
 *
 * @author DELL
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a = 1000;

        Cheque i = new Cheque(a);

        i.establecerComision();
        String d = "Josue";
        String z = "Banco de Loja";
        Cheque i2 = new Cheque(d, z);
        i2.establecerComision();

        System.out.printf("%s\n" + "------------------------------\n" + "%s\n",
                i, i2);
    }

}
