import java.util.Scanner;

public class Inverte{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String a = sc.next();//String que vai inverter

        int tamanhoString = a.length();//armazena tamanho String

        char[] tempArray = new char[tamanhoString]; //Array que armazena o array temporariamente
        char [] ArrayFinal = new char [tamanhoString];

        for (int i=0;i<tamanhoString; i++){
            tempArray[i] = a.charAt(i); //aqui armazena a string num array (pega cada letra e coloca em cada posicao do array)

        }

        for (int j=0; j<tamanhoString; j++){ //aqui pega o array de cima e armazena num novo array ao contrario (pega a ultima letra e vai armazenando sucessivamente)
            ArrayFinal[j] = tempArray[tamanhoString-1-j]; 
        }
        String reversa = new String (ArrayFinal); 
        System.out.println(reversa);

        sc.close();
        } 
    }