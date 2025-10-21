package Diverse_Proiecte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CititorMSISDN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu calea completă către fișierul CSV: ");
        String filePath = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                // Ignoră prima linie (header)
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] valori = line.split(",");
                if (valori.length > 0) {
                    String msisdn = valori[0].trim();
                    System.out.println("MSISDN: " + msisdn);
                }
            }
        } catch (IOException e) {
            System.err.println("Eroare la citirea fișierului: " + e.getMessage());
        }
    }
}

