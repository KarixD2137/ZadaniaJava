/*
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

Zadanie 9.
Zadeklaruj tablicę 10 liczb rzeczywistych i wypełnij ją pierwiastkami jej indeksów.

Zadanie 10.
Zadeklaruj tablicę 40-elementową i wstaw do niej kolejne liczby ciągu Fibonacciego. Ciąg
Fibonacciego to ciąg, w którym każda kolejna liczba jest równa sumie dwóch poprzednich.
Wczytaj liczbę i sprawdź, która liczba Fibonacciego jest najbliższa wczytanej liczbie.
Zadanie wykonaj z wykorzystaniem algorytmu wyszukiwania binarnego.

Zadanie 11.
Zadeklaruj tablicę z liczbami całkowitymi i wstaw do niej 100 liczb losowych z zakresu od 1 do 100.
Zadeklaruj dwie kolekcje i wypełnij je wartościami z tablicy. Do jednej wstaw liczby parzyste,
a do drugiej nieparzyste. Podaj, ile różnych liczb wylosowano.

Zadanie 12.
Wykorzystaj tablicę z zadania 3. z wylosowanymi wartościami. Posortuj tablicę. Znajdź medianę
(wartość środkową tablicy), dominantę (wartość najczęściej występującą w tablicy) i wartość średnią
wartości zapisanych w tablicy.

Zadanie 13.
Wygeneruj tablicę liczb pierwszych mniejszych od 1000. Wykorzystaj do tego sito Eratostenesa.
Wypisz wszystkie liczby pierwsze z zakresu od x do y, gdzie x0 i x,y <1000.
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wybierz zadanie");
        System.out.println("========");
        System.out.println("1 - Liczby dwucyfrowe dodatnie parzyste");
        System.out.println("2 - Czy tekst jest palindromem");
        //System.out.println("3 - Najbliższa liczba palindromiczna");
        //System.out.println("4 - Czy teksty są dla siebie anagramami");
        System.out.println();
        System.out.println("9 - Pierwiastki indeksów tablicy");
        System.out.println("========");


        Scanner scanner = new Scanner(System.in);
        int numerZadania = scanner.nextInt();
        switch (numerZadania) {
            case 1:
                Zadanie1 zadanie1 = new Zadanie1();
                zadanie1.wypiszDwucyfroweDodatnieParzyste();
                break;
            case 2:
                Zadanie2 zadanie2 = new Zadanie2();
                System.out.println(zadanie2.czyPalindrom());
                break;
            case 9:
                Zadanie9 zadanie9 = new Zadanie9();
                zadanie9.ZadeklarujTablicePierwiastkow();
                break;
        }
    }
}