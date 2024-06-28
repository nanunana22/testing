//Erstellen Sie ein neues Java-Projekt und implementieren Sie die folgenden Methoden und testen Sie sie:

//Schreibe einen Test für eine Methode, die die Summe von zwei ganzen Zahlen berechnet.

//Schreiben Sie einen Test für eine Methode, die prüft, ob eine gegebene Zahl gerade ist.

//4 Schreiben Sie einen Test für eine Methode, die das Produkt zweier ganzer Zahlen errechnet.

//Schreiben Sie einen Test für eine Methode, die eine gegebene Zeichenkette in Großbuchstaben umwandelt.

//Schreibe einen Test für eine Methode, die prüft, ob eine gegebene Zahl positiv ist.

//Bitte posten Sie den Link zu einem GitHub Repo, in dem Sie diese Testfälle zusammen implementiert haben.
//Antwort hier eingeben

//Wenn Sie diese Aufgabe bereits früher gelöst haben, können Sie die Bonusaufgabe auf der nächsten Seite bearbeiten.



package org.example;

public class FirstTest {
    public static void main(String[] args) {
    }
    public static int addition(int a, int b) {
        return a + b;
    }
    public static boolean is_even(int n) {
        return n % 2 == 0;
    }
    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static String toUpperCase(String s) {
        return s.toUpperCase();
    }
}
