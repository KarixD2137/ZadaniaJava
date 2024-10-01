import java.util.Scanner;

public class Zadanie1_4 {

    char[] alfabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    int znajdzPozycjeWAlfabecie(char litera)
    {
        for (int i = 0; i < alfabet.length; i++) {
            if(litera == alfabet[i])
            {
                return i;
            }
        }
        return -1;
    }

    String zaszyfrujSzyfremCezara(int przesuniecie)
    {
        Scanner scanner = new Scanner(System.in);
        String wpisanyTekst = scanner.nextLine();
        String zaszyfrowanyTekst = "";
        for (int i = 0; i < wpisanyTekst.length(); i++)
        {
            if(znajdzPozycjeWAlfabecie(wpisanyTekst.charAt(i)) == -1)
            {
                zaszyfrowanyTekst += '?';
            }
            else
            {
                int pozycjaWAlfabecie = znajdzPozycjeWAlfabecie(wpisanyTekst.charAt(i));
                int nowaPozycjaWAlfabecie = (pozycjaWAlfabecie + przesuniecie) % alfabet.length;
                zaszyfrowanyTekst += alfabet[nowaPozycjaWAlfabecie];
            }
        }
        return zaszyfrowanyTekst;
    }
}
