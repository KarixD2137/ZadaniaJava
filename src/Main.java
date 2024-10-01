/*
===================
   ZESTAW ZADAŃ 1
===================
Zadanie 1.
Wypisz na ekranie wszystkie liczby dodatnie dwucyfrowe parzyste. Liczby oddziel znakiem spacji.

Zadanie 2.
Wczytaj słowo z klawiatury i sprawdź, czy jest palindromem, czyli czytane od początku do końca i od końca do
początku ma takie samo brzmienie.

Zadanie 3.
Znajdź dla danej liczby najbliższą jej liczbę palindromiczną (czytana od początku jest taka sama jak czytana
od końca). Dla liczby 1015 najbliższą liczbą palindromiczną jest liczba 1001.

Zadanie 4.
Wczytaj słowo z klawiatury i zaszyfruj je szyfrem Cezara z kluczem 3. Szyfr Cezara polega na przesunięciu
każdej litery alfabetu w prawo o klucz.

Zadanie 5.
Wczytaj dwa słowa i sprawdź, czy są one dla siebie anagramami, czyli składają się z tych samych liter w
takiej samej liczbie.

Zadanie 6.
Napisz program obliczający sumę silni cyfr z liczby.

Zadanie 7.
Sprawdź, czy liczba jest liczbą pierwszą, czyli ma dokładnie dwa dzielniki: 1 i samą siebie.

Zadanie 8.
Wygeneruj hasło losowe. Długość hasła powinna wynosić 20 znaków, a ponadto powinno zawierać liczby,
wielkie i małe litery oraz znaki specjalne.



===================
   ZESTAW ZADAŃ 2
===================

Zadanie 1.
Zadeklaruj tablicę 10 liczb rzeczywistych i wypełnij ją pierwiastkami jej indeksów.

Zadanie 2.
Zadeklaruj tablicę 40-elementową i wstaw do niej kolejne liczby ciągu Fibonacciego. Ciąg
Fibonacciego to ciąg, w którym każda kolejna liczba jest równa sumie dwóch poprzednich.
Wczytaj liczbę i sprawdź, która liczba Fibonacciego jest najbliższa wczytanej liczbie.
Zadanie wykonaj z wykorzystaniem algorytmu wyszukiwania binarnego.

Zadanie 3.
Zadeklaruj tablicę z liczbami całkowitymi i wstaw do niej 100 liczb losowych z zakresu od 1 do 100.
Zadeklaruj dwie kolekcje i wypełnij je wartościami z tablicy. Do jednej wstaw liczby parzyste,
a do drugiej nieparzyste. Podaj, ile różnych liczb wylosowano.

Zadanie 4.
Wykorzystaj tablicę z zadania 3. z wylosowanymi wartościami. Posortuj tablicę. Znajdź medianę
(wartość środkową tablicy), dominantę (wartość najczęściej występującą w tablicy) i wartość średnią
wartości zapisanych w tablicy.

Zadanie 5.
Wygeneruj tablicę liczb pierwszych mniejszych od 1000. Wykorzystaj do tego sito Eratostenesa.
Wypisz wszystkie liczby pierwsze z zakresu od x do y, gdzie x0 i x,y <1000.
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerZestawu;
        int numerZadania;

        System.out.println("Wybierz zestaw zadań");
        System.out.println("========================================");
        System.out.println("1 - Podstawy programowania w Javie");
        System.out.println("2 - Tablice i kolekcje");
        System.out.println("========================================");

        numerZestawu = scanner.nextInt();
        System.out.println();
        switch (numerZestawu)
        {

            // ===================
            //   ZESTAW ZADAŃ 1
            //===================

            case 1:
                System.out.println("Wybierz zadanie");
                System.out.println("========================================");
                System.out.println("1 - Liczby dwucyfrowe dodatnie parzyste");
                System.out.println("2 - Czy tekst jest palindromem");
                System.out.println("3 - Najbliższa liczba palindromiczna");
                System.out.println("4 - Szyfr Cezara");
                System.out.println("8 - Losowe hasło");
                System.out.println("========================================");


                numerZadania = scanner.nextInt();
                System.out.println();
                switch (numerZadania) {
                    case 1:
                        Zadanie1_1 zadanie1_1 = new Zadanie1_1();
                        zadanie1_1.wypiszDwucyfroweDodatnieParzyste();
                        break;
                    case 2:
                        Zadanie1_2 zadanie1_2 = new Zadanie1_2();
                        System.out.println(zadanie1_2.czyPalindrom());
                        break;
                    case 3:
                        Zadanie1_3 zadanie1_3 = new Zadanie1_3();
                        System.out.println(zadanie1_3.znajdzNajblizszaLiczbePalindromiczna());
                        break;
                    case 4:
                        Zadanie1_4 zadanie1_4 = new Zadanie1_4();
                        System.out.println(zadanie1_4.zaszyfrujSzyfremCezara(3));
                        break;
                    case 8:
                        Zadanie1_8 zadanie1_8 = new Zadanie1_8();
                        System.out.println(zadanie1_8.wygenerujHaslo(20));
                        break;
                }
                break;



            // ===================
            //   ZESTAW ZADAŃ 2
            //===================
            case 2:
                System.out.println("Wybierz zadanie");
                System.out.println("========================================");
                System.out.println("1 - Pierwiastki indeksów tablicy");
                System.out.println("========================================");


                numerZadania = scanner.nextInt();
                System.out.println();
                switch (numerZadania) {
                    case 1:
                        Zadanie2_1 zadanie2_1 = new Zadanie2_1();
                        zadanie2_1.ZadeklarujTablicePierwiastkow();
                        break;
                    case 2:
                        break;
                }
                break;
        }
    }
}