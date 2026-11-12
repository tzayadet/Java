public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException exception) {
            System.out.println("Error: no se puede dividir por cero.");
        }
    }
}
