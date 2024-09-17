/*
Zadanie 9.
Zadeklaruj tablicę 10 liczb rzeczywistych i wypełnij ją pierwiastkami jej indeksów.
*/

public class Zadanie9 {
    void ZadeklarujTablicePierwiastkow()
    {
        double[] tablica = new double[10];
        for (int i = 0; i < tablica.length; i++)
        {
            tablica[i] = Math.sqrt(i);
            System.out.println(i + ". " + tablica[i]);
        }
    }
}
