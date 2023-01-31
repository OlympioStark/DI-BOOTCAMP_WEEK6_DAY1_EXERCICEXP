package Exercices;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		
		System.out.println("Veuillez entrer le décalage horaire entre votre domicile et votre destination" +
	"\n (Entrez une valeur négative si la destination est en retard sur le domicile)");
		
		Scanner scanner = new Scanner(System.in);
		int decalageHoraire = scanner.nextInt();
		
		int heureDestinationNuit = decalageHoraire < 0 ? 24 + decalageHoraire : decalageHoraire;
		int heureDestinationJournee = 12 + decalageHoraire;
		
		System.out.println("Il sera " + heureDestinationJournee + "H à la destination lorsqu'il sera 12h au domicile " +
                "et il sera " + heureDestinationNuit + "H à la destination lorsqu'il sera 00H au domicile");

	}

}
