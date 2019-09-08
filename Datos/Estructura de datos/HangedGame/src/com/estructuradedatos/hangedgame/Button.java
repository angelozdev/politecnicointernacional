/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estructuradedatos.hangedgame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

/**
 *
 * @author ANGELO
 */
public class Button {
    //char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private int numberAttemps;
    private int numberRight;
    private int numberWrong;
    private byte position;
    private String wordConverted;
    private String[] words = {"react","compiler", "variable", "constant", "javascript", "angular", "algorithm", "conditional", "array", "loop", "function", "class", "bootstrap", "materialize", "foundation"};
    private char[] characters;
    private String wordFinded[];
    
      
    public void findWord(JToggleButton button, char letter, JLabel n){    
        numberWrong = numberAttemps - numberRight;
        StringBuilder sb = new StringBuilder();
        button.setEnabled(false);
        boolean win = false;
        
        for (int i1 = 0; i1 < characters.length; i1++){
            
            if(characters[i1] == letter){ 
                numberRight++;  
                position = (byte) i1;
                //System.out.println(letter + " está en la position " + position);
                
                wordFinded[i1] = letter + " ";
                
                sb.append(wordFinded[i1]);
                numberAttemps++;                                    
                
            }else{
                sb.append(wordFinded[i1]);
            } 
            
        }  
        wordConverted = sb.toString();
        n.setText("" + wordConverted.toUpperCase());
        numberAttemps--;  
        
        for (String wordFinded1 : wordFinded) {
            if (wordFinded1.equals("_ ")) {
                win = false;
                break;
            }
            win = true;  
        }
        if (win) {
            JOptionPane.showMessageDialog(null, "Felicidades, has ganado!");
        }
    }
    

    
    public void showWord(JLabel n){

        StringBuilder sb = new StringBuilder();
        wordFinded = new String[characters.length];
        
        for (int i1 = 0; i1 < characters.length; i1++) {
            
            //System.out.print("["+ i1 +"]" + characters[i1] + " "); 
                      
            wordFinded[i1] = "_ "; 
            
            sb.append(wordFinded[i1]);
        }
        
        System.out.println("");
        wordConverted = sb.toString();
        n.setText("" + wordConverted);        
    }
    
    
    

    //GETTERS Y SETTERS
    
    public String[] getWordFinded() {
        return wordFinded;
    }
    
    public void setWordFinded(String[] wordFinded) {
        this.wordFinded = wordFinded;
    }

    public char[] getCharacters() {
        return characters;
    }
    
    public void setCharacters(char[] characters) {
        this.characters = characters;
    }

    public String[] getWords() {
        return words;
    }
    
    public void setWords(String[] words) {
        this.words = words;
    }

    public byte getPosition() {
        return position;
    }

    public void setPosition(byte position) {
        this.position = position;
    }

    public String getWordConverted() {
        return wordConverted;
    }
    
    public void setWordConverted(String wordConverted) {    
        this.wordConverted = wordConverted;
    }

    public int getNumberAttemps() {
        return numberAttemps;
    }

    public void setNumberAttemps(byte numberAttemps) {
        this.numberAttemps = numberAttemps;
    }

    public int getNumberRight() {
        return numberRight;
    }

    public void setNumberRight(byte numberRight) {
        this.numberRight = numberRight;
    }

    public int getNumberWrong() {
        return numberWrong;
    }

    public void setNumberWrong(byte numberWrong) {
        this.numberWrong = numberWrong;
    }

    
}