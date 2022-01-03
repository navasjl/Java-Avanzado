package sesion21;

import java.util.*;

public class Util {

    /**
     * Esta funcion convierte la cadena que recibe como ArrayList de Integer de forma que si recibe una cadena del tipo
     * "[1,5,8,7,8] devuelve una ArrayList de 5 elementos donde cada elemento es el Integer que representa al caracter.
     * Si no recibe una cadena de ese tipo o la cadena no es de enteros, lanzara Excepcion
     *
     * @param cadena                Cadena de tipo String con formato predeterminado
     * @return ArrayList<Integer>   Array de Integer que representan los caracteres dentro del parámetro String
     * @throws Exception            Si no se recibe una cadena del tipo especificado o la cadena no es de enteros
     */
    public static ArrayList<Integer> stringToArray(String cadena) throws Exception{

        ArrayList<Integer> arrayInt= new ArrayList<>();
        Character firstChar= cadena.charAt(0), lastChar=cadena.charAt(cadena.length()-1);
        char secondChar=cadena.charAt(1);
        Character charPermitido;

        int contCaracteres=0, posEnArray=0,nextInt;
        String charToString;

        //Forzamos para que primer caracter sea '[', segundo sea un int y ultimo sea ']'
        if(!firstChar.equals('[') || !lastChar.equals(']') || !Character.isDigit(secondChar))
            throw new Exception();

        while(!cadena.isBlank()) {

            contCaracteres++;
            charPermitido=cadena.charAt(contCaracteres);

            //solo si es un numero lo anadimos al array
            if(Character.isDigit(charPermitido))
            {

                charToString=String.valueOf(charPermitido);//hay que convertirlo a String
                nextInt=Integer.parseInt(charToString);//parseInt solo convierte a int desde String
                arrayInt.add(posEnArray,nextInt);
                posEnArray++;

                //despues de numero siempre viene coma y despues siempre viene espacio salvo
                //que sea el ultimo entero antes del ']'
                if(cadena.charAt(contCaracteres+1)==']')
                    return arrayInt;
                else {
                    if(cadena.charAt(contCaracteres+1)!=',' && cadena.charAt(contCaracteres+2)!=' ')
                        throw new Exception();
                }
            }

            else if(charPermitido==',') {


                //despues de coma siempre viene espacio y un numero
                if(cadena.charAt(contCaracteres+1)!=' ' && !Character.isDigit(cadena.charAt(contCaracteres+2)))
                    throw new Exception();
            }

            else if(charPermitido==' ') {

                //despues de espacio siempre viene un numero y coma
                if( !Character.isDigit(cadena.charAt(contCaracteres+1)) && cadena.charAt(contCaracteres+2)!=',')
                    throw new Exception();
            }
        }

        return arrayInt;
    }
}