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

    public abstract boolean tieneFormatoValido(String codigo);

    public abstract String generarCodigo();
    
}

