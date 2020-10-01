/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author blejd
 */
public class StandardniUlaz {
    
    public static int iscitajBroj(){
        try {
            Scanner skener = new Scanner(System.in);
            return skener.nextInt();
        } catch (InputMismatchException e) {
            return -1;
        }
        
    } 
    
}
