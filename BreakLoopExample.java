public class BreakLoopExample {
    public static void main(String[] args) {
        boolean falloMotor = true;

        for (int i = 0; i < 10; i++) {
            if (falloMotor) {
                break; // Sale del bucle cuando se detecta el fallo.
            }
            System.out.println("Alarma " + i);
        }
    }
}
