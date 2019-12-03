package main;
// Doel; While, itereren
// OPDRACHT 1 maak een lijst met nummers van 1 tm 100 en toon deze in de console onder elkaar
// OPRDACHT 2 Toon alleen de nummers die deelbaar door 2 EN 3 zijn
// OPDRACHT 3 Maak een while-loop die getallen filtert die een veelvoud zijn van je leeftijd tussen 100 en 500, en het aantal exemplaren ervan toont.

public class Main {
    public static void main(String[] args) {
        int[] nummers = {1,2,4,5,6,7,8,9,10};
        int index = 0;
        int teller = 0;
        int leeftijd = 29;

        //OPDRACHT #1; for loop
        // Toon alle nummers onder elkaar in de lijst 'nummers'
        for (index=0; index < nummers.length; index++) {
            System.out.println("Teller staat op #" + nummers[index]);
        }

        //OPDRACHT #2; IF STATEMENT, TOON ALLES DEELBAAR DOOR 2 EN 3
        for (index=0; index < nummers.length; index++) {
            if(nummers[index] % 2 == 0 && nummers[index] % 3 == 0  ) {
//          if(nummers[index] % 6 == 0  ) {
                System.out.println("Het even getal is: #" + nummers[index]);
            }
        }

        //OPDRACHT #3; TOON VEELVOUD VAN JE LEEFTIJD
        index = 0;
        while (index < 500){
            index = index + leeftijd;
            System.out.println("veelvoud van 29 = " + index);
            teller++;
        }
        System.out.println("Er zijn" + teller + "veelvouden van 29 getoond.");
    }
}
