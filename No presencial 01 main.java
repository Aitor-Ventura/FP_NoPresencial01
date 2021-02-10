import es.ulpgc.eii.strings.StringUtils;

public class Main {
    /**
     * Prueba el método StringUtils.span
     * @param input - ristra de búsqueda
     * @param code  - patrón de confrontación
     * @param expected - resultado esperado
     */
    static void test(String input, String code, String expected) {
    	// Se informa del caso que se está probando
    	System.out.println("probando: span(\"" + input + "\", \"" + code + "\")");
    	
        // Llamada al método a probar
        String result = StringUtils.span(input, code);
        
        // Comprobación de los resultados
        if (!result.equals(expected)) {
            System.out.print(">> Resultado erróneo, deberia ser: \"" + expected + "\"");
            System.out.println(" y es: \"" + result + "\"");
        } else {
            System.out.println(">> Resultado correcto: \"" + result + "\"");
        }        
    }

    /**
     * @param args
     */
    /**
     * Invoca a test para realizar múltiples pruebas de StringUtils.span
     * @param args
     */
    public static void main(String[] args) {
        test("01234abcde", "0123456789", "01234");
        test("01234abcde", "abcdefghijklmnñopqrstuvwxyz", "");
        test("12893871236", "0123456789", "12893871236");
    }

}
