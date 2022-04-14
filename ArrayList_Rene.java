/*  ArrayList Übung
*   Autor: Rene Hütter
*   Datum: 14.04.2022
*   Version: 01.0
* */

import java.util.*;

public class ArrayList_Rene {

    public static void main (String[] args) {

        ArrayList<String> nameList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Namen Eingeben:");
            String userName = scanner.nextLine();
            char firstLetter = userName.charAt(0);

            // vergleicht ob User eingabe gleich "Fertig" ist, wird die Liste ausgeben
            if (userName.equals("FERTIG"))
            {
                for (String s : nameList)
                {
                    System.out.println(s);
                }
                break;
            }
            // Überprüft, ob der erste Buchstabe ein Großbuchstabe ist
            else if (Character.isUpperCase(firstLetter))
            {
                // fügt name zur liste
                nameList.add(userName);
            }
            else
            {
                System.out.println("Falsche Eingabe");
            }
        }
    }
}
