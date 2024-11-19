/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20241911_4id_wang_minuscoloapp;

import java.util.Scanner;

public class minuscolo {
    // Inizio : Dichiarazione degli attributi.
    private String InputUtente;
    private static final int GRANDEZZA = 30;
    private char[] minuscolo = new char[GRANDEZZA];
    // Fine : Dichiarazione degli attributi.
    
    // Inizio : Creazione del metodo per la richiesta dell'input dell'utente e la sua assegnazione in una stringa.
    public void Scan (){
        Scanner myScan = new Scanner(System.in);
        System.out.print("inserire la parola/frase : ");
        InputUtente = myScan.next();
    }
    // Fine : Creazione del metodo per la richiesta dell'input dell'utente e la sua assegnazione in una stringa.
    
    // Inizio : Creazione del metodo per la trasformare la sringa inserita dall'utente in una array di caratteri.
    public void TrasformazioneStringAchar(){
        for (int i = 0 ; i< InputUtente.length(); i++){
            minuscolo[i] = InputUtente.charAt(i);
        }
    }
    // Fine : Creazione del metodo per la trasformare la sringa inserita dall'utente in una array di caratteri.
    
    // Inizio : Creazione del metodo per la trasformazione dell'array di caratteri tutti i carratteri in minuscolo.
    public void TrasformazioneMin(){
        for (int i = 0; i < InputUtente.length(); i++ ){
            minuscolo[i]= Character.toLowerCase(minuscolo[i]);
        }
    }
    // Fine : reazione del metodo per la trasformazione dell'array di caratteri tutti i carratteri in minuscolo.
    
    
    // Inizio : Creazione del metodo per la stampa dell'array.
    public void StampaArrayChar(){
        System.out.print ("La parola in minuscolo (array) : ");
        for (int i = 0; i < minuscolo.length; i++ ){
            System.out.print(minuscolo[i]);
        }
    }
    // Fine : Creazione del metodo per la stampa dell'array.
    
    // Inizio : Creazione del metodo per la stampa dell'oggetto con il passaggio dell'attributo char.
    public void StampaOggettoString(){
        String ParolaMinuscolo = new String(minuscolo); // istanzazione di un oggetto ti tipo stringa 
        System.out.print("\nla parola in minuscolo (oggetto) : ");
        System.out.print(ParolaMinuscolo);
        System.out.print("\n");
    }
    // Fine : Creazione del metodo per la stampa dell'oggetto con il passaggio dell'attributo char.
    
}
