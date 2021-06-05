/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q6;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author mauri.ferrandin
 */
public class ObtemTxtURL {

    public static String getTxt(String str) {
        try {
            URL url = new URL(str);
            Scanner s = new Scanner(url.openStream());
            // obtem cada caracter da url usando a classe scanner - isto pode ser implementado também usando BufferedReader
            String ret = "";            
            while ( s.hasNext()){
                ret = ret + s.next() + "\n";
            }
            return ret;
        } catch (IOException ex) {
            ex.printStackTrace(); // apenas mostra o trace da exceção se ela ocorrer.
        }
        return null;
    }

}