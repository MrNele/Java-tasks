/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak1;

import util.StandardniUlaz;

/**
 *
 * @author blejd
 */
public class Zadatak1 {

    public void uradiSe() {
        System.out.println("Broj elemenata koje zelite da unesete: ");
        int broj = StandardniUlaz.iscitajBroj();
        int brojac = 0;
        int suma = 0;
        if (broj < 1) {
            System.out.println("Niste uneli pozitivan ceo broj!");
        } else {
            int[] niz = new int[broj];
            System.out.println("Unesite elemente niza kao celobrojne vrednosti. Svaki nepravilan unos bice prihvacen kao vrednost -1.");
            for (int i = 0; i < broj; i++) {
                System.out.println("Unesite " + (i + 1) + ". element niza:");
                niz[i] = StandardniUlaz.iscitajBroj();
                if (niz[i] % 3 == 0) {
                    brojac++;
                }
                suma = suma + niz[i];
            }
            double srvr = (double) suma / broj;
            System.out.println("Ukupan broj unetih brojeva je " + broj + ". Broj unetih brojeva koji su deljivi sa 3 je " + brojac + ", a srednja vrednost je " + srvr);
        }
    }
}
