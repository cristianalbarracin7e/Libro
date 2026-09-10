public class App {
    public static void main(String[] Args) {
        Libro l1 = new Libro("cien años de soledad","Gabriel garcia", true);
        Libro l2 = new Libro("la metamorfosis", "Frank Kafka", true);
        System.out.println("--- Información inicial ---");
        l1.mostrarInfo();
        System.out.println();
        l2.mostrarInfo();
        System.out.println("=== PRUEBA DE VALIDACIÓN DE TÍTULO VACÍO ===");
        l1.setTitulo(""); 
        System.out.println("Título actual tras intento fallido: " + l1.getTitulo());
        System.out.println("-----------------------------------");
        System.out.println("\n--- Probando Préstamo ---");
        l1.prestar();
        l2.prestar();
        System.out.println("\n--- Probando Devolución ---");
        l2.devolver();
        System.out.println("\n--- Información final ---");
        l1.mostrarInfo();
        l2.mostrarInfo();
    }
}
