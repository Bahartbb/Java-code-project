public class AutoMuster {

	String marke;
	String klasse;
	String lackfarbe;
	float preis; // in Euro
	int baujahr;
	int ps;
	int tueren; // Anzahl der Tueren
	int hoechstGeschwindigkeit; // in km/h
	int emission; // in Gramm CO2 pro Kilometer

	// Lösung:
	int maxPassagiere=5, actPassagiere=0, gesamtPassagiere=0;

	boolean gruenePlakette;
	boolean katalysator;
	boolean gueltigerTuev;

	public AutoMuster() {
		
	}

	// Lösung
	void einsteigen() {
		
		if (actPassagiere < maxPassagiere) {
			actPassagiere++;
			gesamtPassagiere++;
		}
		
	}

	void aussteigen() {
		
		if (actPassagiere > 0) {
			actPassagiere--;
		}
		
	}

	void befoerdertePassagiere() {
		System.out.println("Gesamt befördert: " + gesamtPassagiere
				+ " Passagiere");
	}

	void farbe() {
		switch (lackfarbe) {
		case "Bordeaux":
			System.out.println("Tolles rot!");
			break;

		case "Kobalt":
			System.out.println("Schönes Blau");
			break;

		default:
			System.out.println("Unbekannte Farbe");
			break;
		}
	}

	public static void main(final String arg[]) {
		
		AutoMuster audi = new AutoMuster();
		
		// ********** Aufgabe 1 **********

		// Beispiel: Das Auto hat einen gültigen TÜV
		if (audi.gueltigerTuev == true) { // gleichbedeutend mit: if(gueltigerTuev)
			System.out.println("Das Auto hat einen gültigen TÜV");
		} else {
			System.out.println("Das Auto hat keinen gültigen TÜV");
		}
		
		// Hier nur die if-Abfragen ohne Ausgaben
		// Da wir uns hier in der main Methode befinden (statischer Kontext), benötigen wir eine Instanz unserer Klasse,
		// (hier der "audi" vom Typ AutoMuster) um auf die Membervariablen der Klasse zugreifen zu können.
		
		// 1)	Die Marke ist Nissan.
		if(audi.marke.equals("Nissan")) {}
		
		// 2)	Die PS Zahl ist gerade.
		if(audi.ps % 2 == 0) {}
		
		// 3)	Das Auto hat die grüne Plakette aber kein ein gültiges TÜV Siegel.
		if(audi.gruenePlakette && ! audi.gueltigerTuev) {}
		
		// 4)	Die Anzahl der Türen beträgt 3 oder 5.
		if(audi.tueren == 3 || audi.tueren == 5) {}
		
		// 5)	Das Auto ist von der Klasse Kleinwagen, wurde nach 2008 gebaut und hat eine grüne Plakette.
		if(audi.klasse.equals("Kleinwagen") && audi.baujahr > 2008 && audi.gruenePlakette) {}
		
		// 6)	Das Auto hat mehr als 3 Türen und hat eine Höchstgeschwindigkeit von mindestens 250 km/h.
		if(audi.tueren > 3 && audi.hoechstGeschwindigkeit >= 250) {}
		
		// 7)	Das Baujahr ist 2004.
		if(audi.baujahr == 2004) {}
		
		// 8)	Die Höchstgeschwindigkeit ist mindestens 1.8 mal so hoch wie die PS Zahl.
		if(audi.hoechstGeschwindigkeit >= audi.ps * 1.8) {}
		
		// 9)	Das Auto kostet zwischen 15.000 und 25.000 € und ist ein Kleinwagen, der die Farbe rot oder grün hat oder es ist von der Marke VW und wurde vor 1978 gebaut.
		if(audi.preis >= 15000 && audi.preis <= 25000 && (audi.klasse.equals("Kleinwagen") && (audi.lackfarbe.equals("Rot") || audi.lackfarbe.equals("Grün"))) || (audi.marke.equals("VW") && audi.baujahr < 1975)) {}
		
		// 10)	Das Auto hat entweder einen Katalysator oder einen gültigen TÜV (aber nicht beides).
		if( (audi.katalysator && !audi.gueltigerTuev) || (!audi.katalysator && audi.gueltigerTuev) ) {}

		
		// ********** Aufgabe 2 **********
		// Siehe Folien
		
		// ********** Aufgabe 3 **********
		
		audi.einsteigen();
		audi.einsteigen();
		audi.einsteigen();
		audi.einsteigen();
		audi.einsteigen();
		audi.einsteigen();
		audi.einsteigen();
		audi.einsteigen();
		audi.einsteigen();
		audi.aussteigen();
		audi.aussteigen();
		audi.aussteigen();
		audi.aussteigen();
		audi.aussteigen();
		audi.aussteigen();
		audi.aussteigen();
		audi.aussteigen();
		audi.aussteigen();
		
		audi.einsteigen();
		audi.aussteigen();
		audi.einsteigen();
		audi.aussteigen();
		audi.einsteigen();
		audi.aussteigen();
		
		audi.lackfarbe = "Bordeaux";
		audi.farbe();
		audi.lackfarbe = "Kobalt";
		audi.farbe();
		audi.lackfarbe = "Grün";
		audi.farbe();
		
		audi.befoerdertePassagiere();
		
		/*
		 * Ausgabe: 
		 * 
		 * Das Auto hat keinen gültigen TÜV
		   Tolles rot!
		   Schönes Blau
		   Unbekannte Farbe
		   Gesamt befördert: 8 Passagiere
		 */
		 		
	}

}
