/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import util.StandardniUlaz;
import zadatak1.Zadatak1;
import zadatak2.Zadatak2;

/**
 *
 * @author blejd
 */
public class Main {

    public static void main(String[] args) {
        int izbor;
        do {
            System.out.println("***** Izaberite neku od opcija *****");
            System.out.println("1. Zadatak 1");
            System.out.println("2. Zadatak 2");
            System.out.println("3. Kraj programa");
            System.out.println("Vas izbor: ");

            izbor = StandardniUlaz.iscitajBroj();

            switch (izbor) {
                case 1:
                    Zadatak1 zadatak1 = new Zadatak1();
                    zadatak1.uradiSe();
                    break;
                case 2:
                    Zadatak2 zadatak2 = new Zadatak2();
                    zadatak2.uradiSe();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Niste uneli neku od ponudjenih opcija!");
                    break;
            }
        } while (izbor != 3);
    }
}
