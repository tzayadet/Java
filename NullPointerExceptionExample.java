public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String texto = null;
        try {
            int longitud = texto.length();
            System.out.println("Longitud: " + longitud);
        } catch (NullPointerException exception) {
            System.out.println("Error: el objeto es nulo.");
        }
    }
}
