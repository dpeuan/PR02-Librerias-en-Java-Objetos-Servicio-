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
  
    //
    public static boolean estaVacio(String texto){
        boolean resultado = true;

        if (texto != null){
            resultado = false;
        }
        
        System.out.println(resultado);
        return resultado;
    }

    //
    public static boolean contieneSoloNumeros(String texto){
        boolean resultado = true;
        return resultado;
    }

    //
    public static boolean contieneSoloLetras(String texto){
        boolean resultado = true;
        return resultado;
    }

    //
    public static boolean esPasswordValido(String texto){
        boolean resultado = true;
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
