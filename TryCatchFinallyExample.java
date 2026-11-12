public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException exception) {
            System.out.println("La operación no se pudo completar.");
        } finally {
            System.out.println("El bloque finally se ejecuta siempre.");
        }
    }
}
