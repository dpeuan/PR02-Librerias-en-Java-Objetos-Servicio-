import java.time.LocalDate;

//import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        
        ValidadorFechas.esFechaFutura(LocalDate.of(2026, 6, 1));
        
        GeneradorCodigosAleatorios gen = new GeneradorCodigosAleatorios("ALE");

        // Generar códigos
        String codigo1 = gen.generarCodigo();
        String codigo2 = gen.generarCodigo();

        // Imprimir
        System.out.println("Código 1: " + codigo1);
        System.out.println("Código 2: " + codigo2);

        // Probar validación
        System.out.println("¿Es válido? " + gen.tieneFormatoValido(codigo1));
        System.out.println("¿Es válido 'ALE-1234'? " + gen.tieneFormatoValido("ALE-1234"));
        System.out.println("¿Es válido 'XYZ-123'? " + gen.tieneFormatoValido("XYZ-123"));
    }
}
