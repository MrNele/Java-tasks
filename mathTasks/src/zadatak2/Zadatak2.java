/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak2;

import util.StandardniUlaz;

/**
 *
 * @author blejd
 */
public class Zadatak2 {

    int[] nizA;
    int[] nizB;
    int[] nizC;
    int brojac = 0;

    public void uradiSe() {

        int izbor;
        do {
            System.out.println("*** Izaberite neku od opcija za zadatak 1 ***");
            System.out.println("1. Napuni niz A");
            System.out.println("2. Napuni niz B");
            System.out.println("3. Prikazi niz A");
            System.out.println("4. Prikazi niz B");
            System.out.println("5. Formiraj niz C");
            System.out.println("6. Prikazi niz C");
            System.out.println("7. Kraj");
            System.out.println("Vas izbor: ");
            izbor = StandardniUlaz.iscitajBroj();

            switch (izbor) {
                case 1:
                    System.out.println("Broj elemenata koje zelite da unesete za niz A: ");
                    int a = StandardniUlaz.iscitajBroj();
                    if (a < 1) {
                        System.out.println("Niste uneli pozitivan ceo broj!");
                    } else {
                        nizA = new int[a];
                        System.out.println("Unesite elemente niza kao celobrojne vrednosti. Svaki nepravilan unos bice prihvacen kao vrednost -1.");
                        for (int i = 0; i < nizA.length; i++) {
                            System.out.println("Unesite " + (i + 1) + ". element niza A:");
                            nizA[i] = StandardniUlaz.iscitajBroj();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Broj celih brojeva koje zelite da unesete za niz B: ");
                    int b = StandardniUlaz.iscitajBroj();
                    if (b < 1) {
                        System.out.println("Niste uneli pozitivan ceo broj!");
                    } else {
                        nizB = new int[b];
                        System.out.println("Unesite elemente niza kao celobrojne vrednosti. Svaki nepravilan unos bice prihvacen kao vrednost -1.");
                        for (int i = 0; i < nizB.length; i++) {
                            System.out.println("Unesite " + (i + 1) + ". element niza B:");
                            nizB[i] = StandardniUlaz.iscitajBroj();
                        }
                    }
                    break;
                case 3:
                    if (nizA == null) {
                        System.out.println("Niste napunili niz A!");
                    } else {
                        System.out.println("Niz A: ");
                        for (int i = 0; i < nizA.length; i++) {
                            System.out.print(nizA[i] + " ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    if (nizB == null) {
                        System.out.println("Niste napunili niz B!");
                    } else {
                        System.out.println("Niz B: ");
                        for (int i = 0; i < nizB.length; i++) {
                            System.out.print(nizB[i] + " ");
                        }
                        System.out.println("");
                    }
                    break;
                case 5:
                    if (nizC != null) {
                        System.out.println("Niz C je vec formiran!");
                    } else {
                        if (nizA == null) {
                            System.out.println("Niste napunili niz A!");
                        } else {
                            if (nizB == null) {
                                System.out.println("Niste napunili niz B!");
                            } else {
                                int c = nizA.length + nizB.length;
                                nizC = new int[c];
                                for (int i = 0; i < nizA.length; i++) {
                                    boolean signal = false; // element ne postoji u unija nizu.
                                    for (int j = 0; j < brojac; j++) {
                                        if (nizA[i] == nizC[j]) {
                                            signal = true;
                                            break;
                                        }
                                    }
                                    if (signal == false) {
                                        nizC[brojac] = nizA[i];
                                        brojac++;
                                    }
                                }
                                for (int i = 0; i < nizB.length; i++) {
                                    boolean signal = false; // element ne postoji u unija nizu.
                                    for (int j = 0; j < brojac; j++) {
                                        if (nizB[i] == nizC[j]) {
                                            signal = true;
                                            break;
                                        }
                                    }
                                    if (signal == false) {
                                        nizC[brojac] = nizB[i];
                                        brojac++;
                                    }
                                }
                                System.out.println("Niz C uspesno formiran!");
                            }
                        }
                    }
                    break;
                case 6:
                    if (nizC == null) {
                        System.out.println("Nije formiran niz C!");
                    } else {
                        System.out.println("Elementi niza C: ");
                        for (int i = 0; i < brojac; i++) {
                            System.out.print(nizC[i] + " ");
                        }
                        System.out.println("");
                    }
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Niste uneli neku od ponudjenih opcija!");
                    break;
            }

        } while (izbor != 7);
    }
}
