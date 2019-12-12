/**
 * Doel; print de de console het volgende;
 * Het is een prachtige dag
 *
 * (LET OP DE SPATIES!)
 */
package week1.dag2.deel2;
public class FilterenAntwoord {
    public static void main(String[] args) {
        String[] woordenlijst = {"Vandaag ", "is ", "een ", "mooie ", "dag"};
        String zin = "";

        for(String i: woordenlijst) {
            //Pas hier code aan
            if (i == "Vandaag") {
                zin += "Het";
            } else if (i == "mooie") {
                zin += "prachtige";
            } else {
                zin += i;
            }
        }
        System.out.println(zin);
    }
}
