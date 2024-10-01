/*
Zadanie 1.
Zadeklaruj tablicę 10 liczb rzeczywistych i wypełnij ją pierwiastkami jej indeksów.
*/

public class Zadanie2_1 {
    void ZadeklarujTablicePierwiastkow()
    {
        double[] tablica = new double[10];
        for (int i = 0; i < tablica.length; i++)
        {
            tablica[i] = Math.sqrt(i); // Math.sqrt() oblicza pierwiastek kwadratowy
            System.out.println(i + ". " + tablica[i]);
        }
    }
}
