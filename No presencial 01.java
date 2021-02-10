package es.ulpgc.eii.strings;
//Aitor Ventura Delgado
//12.02.2019

/*Construiremos un método al que se le pasan 2 strings, y nos devolverá una copia de la 
subristra de la primera string formada por los elementos de la segunda - con la condición
de que debe de empezar con el primer carácter de laprimera ristra*/

public class StringUtils {
    public static String span(String s1, String s2){
        String result = ""; //creamos la variable que acabaremos devolviendo, tipo String
        char ini = s1.charAt(0);    //el primer carácter será el primero de la primera String
        
        //En el caso de que no encuentre el primer carácter en la segunda ristra, devolveremos una cadena vacía
        if (s2.indexOf(ini) == -1){
            return "";
        }
        
        //En el caso de que encuentre el carácter en la segunda ristra:
        for (int i = 0; i < s1.length(); i++){  //recorremos el primer String
            if (s2.indexOf(s1.charAt(i)) == -1){    //si no se encuentra el carácter inicial en la segunda ristra
                return result;                      //devolvemos una cadena vacía
            } 
            for (int j = 0; j < s2.length(); j++){  //recorremos el segundo String
                if (s1.charAt(i) == s2.charAt(j)){  //si el carácter de la cadena s1 coincide con el de la cadena s2
                    result += s1.charAt(i);         //añadimos el carácter a la cadena resultante
                }
            }
            
        }
        return result;                              //devolvemos el resultado
    }
}