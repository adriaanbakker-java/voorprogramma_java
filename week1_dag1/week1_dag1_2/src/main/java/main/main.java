package main;


// Simpel voorbeeld van een klasse en objecten van die klasse
// Uitleggen hoe het voorbeeld werkt
// Wat is de fout in het programma? Los deze op
// Maak een object aan met je eigen naam, adres en leeftijd en druk dit ook af
// Voeg email adres toe aan de klasse en aan de constructor
// Vul deze nu ook in in de main aan de aanroep van de constructor

public class main {

	public static void main(String[] args) {
		Persoon persoon1 = new Persoon("Adriaan Bakker", "Grote Vaart 4, Zwanenburg", "1234AA", 45);
		Persoon persoon2 = new Persoon("Leon Pocornie", "Wamelstraat 899, Amsterdam", "4321XY", 19);

		System.out.println(" Persoon 1:" + persoon1.Naam + " leeftijd:" + persoon1.leeftijd);
		System.out.println(" Persoon 2:" + persoon2.Naam + " leeftijd:" + persoon2.leeftijd);
		
		System.out.println( persoon2.Naam + " wordt een jaartje ouder");
		
		persoon2.leeftijd++;
		
		System.out.println( " Persoon 2:" + persoon1.Naam + " leeftijd:" + persoon2.leeftijd);
	}

}
