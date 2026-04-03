public class ValidadorStrings {
    //REVISADO Y FUNCIONANDO
    public static boolean superaTamanioMaximo(String texto, int tamanioMaximo){
        boolean resultado = true;
        int longitud = texto.toCharArray().length;

        if (tamanioMaximo >= longitud){
            resultado = false;
        }
        return resultado;
    }

    //REVISADO Y FUNCIONANDO
    public static boolean careceTamanioMinimo(String texto, int tamanioMinimo){
        boolean resultado = true;
        int longitud = texto.toCharArray().length;

        if (tamanioMinimo <= longitud){
            resultado = false;
        }
        System.out.println(resultado);
        return resultado;
    }
  
    //REVISADO Y FUNCIONANDO
    //DA TRUE SI EL TEXTO TIENE NADA, ESPACIOS O ENTERS
    public static boolean estaVacio(String texto){
        boolean resultado = false;

        if ((texto == null)||(texto.isBlank())){
            resultado = true;
        }
        
        return resultado;
    }

    //REVISADO Y FUNCIONANDO
    //VERIFICA QUE EL TEXTO INGRESADO SEAN SOLO NUMEROS, DA TRUE SI CUMPLE
    public static boolean contieneSoloNumeros(String texto){
        boolean resultado = texto.matches("\\d+");
        
        return resultado;
    }

    //REVISADO Y FUNCIONANDO
    //VERIFICA QUE EL TEXTO INGRESADO SEAN SOLO LETRAS, DA TRUE SI CUMPLE
    public static boolean contieneSoloLetras(String texto){

        boolean resultado = texto.matches("^\\p{L}+$");
         
        return resultado;
    }

    //AUYN NO ESTA LISTO
    
    //VERIFICA QUE LA CONTRASEÑA CUMPLA CON ENTRE 8 Y 12 CARACTERES, AL MENOS UN NUMERO, 
    // UNA LETRA MINUSCULA, UNA MAYUSCULA Y UN CARACTER ESPECIAL
    public static boolean esPasswordValido(String texto){
       
        boolean resultado = texto.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*?&])$");
        //int longitud = texto.length();
    
       
        System.out.println(resultado);
        return resultado;
    }

    //
    public static boolean esPalindromo(String texto){
        boolean resultado = true;
        return resultado;
    }

    //
    public static boolean esFechaValida(String texto){
        boolean resultado = true;
        return resultado;
    }
}
