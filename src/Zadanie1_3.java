/*
Zadanie 3.
Znajdź dla danej liczby najbliższą jej liczbę palindromiczną (czytana od początku jest taka sama jak czytana
od końca). Dla liczby 1015 najbliższą liczbą palindromiczną jest liczba 1001.
 */

import java.util.Scanner;

public class Zadanie1_3 {
    boolean czyPalindrom(int liczba)
    {
        String wpisanyTekst = Integer.toString(liczba);
        for (int i = 0; i < wpisanyTekst.length()/2; i++) {
            // String.charAt(pozycja) - zwraca znak w tekście na podanej pozycji
            if(wpisanyTekst.charAt(i) != wpisanyTekst.charAt(wpisanyTekst.length() - i - 1))
            {
                return false;
            }
        }
        return true;
    }

    int znajdzNajblizszaLiczbePalindromiczna()
    {
        Scanner scanner = new Scanner(System.in);
        String wpisanyTekst = scanner.nextLine();

        int gornyZakres = Integer.parseInt(wpisanyTekst);
        int dolnyZakres = Integer.parseInt(wpisanyTekst);
        while(true)
        {
            gornyZakres++;
            dolnyZakres--;

            if(czyPalindrom(gornyZakres))
            {
                return gornyZakres;
            }
            else if(czyPalindrom(dolnyZakres))
            {
                return dolnyZakres;
            }
        }
    }
}
