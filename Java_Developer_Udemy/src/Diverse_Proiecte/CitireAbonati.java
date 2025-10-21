package Diverse_Proiecte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CitireAbonati {
    public static void main(String[] args) {
        String caleFisier = "C:\\Users\\george.florescu\\OneDrive - Vodafone Group\\Desktop\\FlowOne_RNs\\R25_PC_Batch_File\\comenzi.csv"; // setează calea completă dacă e nevoie
        String linie;
        String separator = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(caleFisier))) {
            boolean estePrimaLinie = true;

            while ((linie = br.readLine()) != null) {
                // Dacă linia e goală (doar spații sau complet vidă), oprim citirea
                if (linie.trim().isEmpty()) {
                    System.out.println("S-a întâlnit un rând gol. Citirea s-a oprit.");
                    break;
                }

                // Ignorăm linia de antet (prima linie)
                if (estePrimaLinie) {
                    System.out.println("Antet: " + linie);
                    estePrimaLinie = false;
                    continue;
                }

                // Împărțim câmpurile după separator
                String[] campuri = linie.split(separator);

                if (campuri.length >= 2) {
                    String msisdn = campuri[0].trim();
                    String imsi = campuri[1].trim();

                    System.out.println(msisdn + " , " + imsi);
                } else {
                    System.out.println("Linie invalidă: " + linie);
                }
            }
        } catch (IOException e) {
            System.err.println("Eroare la citirea fișierului: " + e.getMessage());
        }
    }
}
