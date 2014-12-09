/*
 * Created by: Felipe Rodrigues
 * http://www.tupinikimtecnologia.com.br
 */
package gerador;

import java.util.Random;

/**
 *
 * @author felipe
 */
public class Gerador {
    private final String[] caracteres = {
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
        "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
    };
    private int qtCaracteres;
    private String senha ="";
    
    public Gerador(int tamanho){
        this.qtCaracteres = tamanho;
    }
    
    public Gerador(){ }
    
    public String gerarSenha(){
        Random rand = new Random();
        for(int i=0; i<qtCaracteres; i++){
            senha += caracteres[rand.nextInt(caracteres.length)];
        }
        return senha;
    }

    public int getQtCaracteres() {
        return qtCaracteres;
    }

    public void setQtCaracteres(int qtCaracteres) {
        this.qtCaracteres = qtCaracteres;
    }

    public String getSenha() {
        return senha;
    }
        

}
