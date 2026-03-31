public abstract class GeneradorCodigos {

    protected String prefijo;

    public GeneradorCodigos(String prefijo) {
        this.prefijo = prefijo;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }


//metodos estaticos (por codificar)

    public static boolean tieneFormatoValido(String codigo){
        return true;
    }

    public static String generarCodigo(){
        return "codigo";
    }
    
}

