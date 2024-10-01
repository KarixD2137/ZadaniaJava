/*
Zadanie 2.
Wczytaj słowo z klawiatury i sprawdź, czy jest palindromem, czyli czytane od początku do końca i od końca do
początku ma takie samo brzmienie.
*/

import java.util.Scanner;

public class Zadanie1_2
{
    boolean czyPalindrom()
    {
        Scanner scanner = new Scanner(System.in);
        String wpisanyTekst = scanner.nextLine();
        // scanner.nextLine() - Wczytuje tekst z klawiatury (nie wartość liczbową)
        // Nazwa typu String - z dużej litery


        for (int i = 0; i < wpisanyTekst.length()/2; i++) {
            // String.charAt(pozycja) - zwraca znak w tekście na podanej pozycji
            if(wpisanyTekst.charAt(i) != wpisanyTekst.charAt(wpisanyTekst.length() - i - 1))
            {
                return false;
            }
        }
        return true;
    }
}
