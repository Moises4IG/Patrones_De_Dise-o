import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            final String PASSWORD_CORRECTA = "FULL";
            int intentos = 0;
            final int MAX_INTENTOS = 3;
            boolean accesoConcedido = false;

            System.out.println("[ProxySeguridad] Por favor, introduce la contraseña para acceder al sistema de fabricación de carros:");
            System.out.println("[ProxySeguridad] La contraseña está relacionada con el acrónimo de la Universidad Los Liberadores.");

            while (intentos < MAX_INTENTOS) {
                String passwordIntroducida = scanner.nextLine();
                if (passwordIntroducida.equalsIgnoreCase(PASSWORD_CORRECTA)) {
                    accesoConcedido = true;
                    break;
                } else {
                    intentos++;
                    if (intentos < MAX_INTENTOS) {
                        System.out.println("[ProxySeguridad] Contraseña incorrecta. Intentos restantes: " + (MAX_INTENTOS - intentos));
                    }
                }
            }

            if (!accesoConcedido) {
                System.out.println("[ProxySeguridad] Acceso denegado. Se han superado los intentos permitidos.");
                return;
            }

            System.out.println("Implementación del patrón Método Factory para crear carros.");
            FabricaDeCarros fabrica = null;
            String eleccion;

            while (true) {
                System.out.println("¿Qué carro deseas fabricar? (KiaPicanto o FerrariSF90XXStradale)");
                eleccion = scanner.nextLine();

                if (eleccion.equalsIgnoreCase("KiaPicanto")) {
                    fabrica = new FabricaKiaPicanto();
                    break;
                } else if (eleccion.equalsIgnoreCase("FerrariSF90XXStradale")) {
                    fabrica = new FabricaFerrariSF90XXStradale();
                    break;
                } else {
                    System.out.println("Modelo de auto no disponible. Inténtalo de nuevo.");
                }
            }

            System.out.println("Implementación del patrón Proxy para controlar el acceso a las acciones del carro.");
            Carro carro = new ProxyCarro(fabrica.crearCarro(scanner), PASSWORD_CORRECTA);
            carro.mostrarDetalles();

            String accion;
            do {
                System.out.println("Utilizando el patrón Template Method para operar el carro.");
                System.out.println("¿Qué deseas hacer? (encender, acelerar, apagar)");
                accion = scanner.nextLine();
                ((ProxyCarro) carro).realizarAccion(accion, PASSWORD_CORRECTA);

                if (accion.equalsIgnoreCase("encender") || accion.equalsIgnoreCase("acelerar") || accion.equalsIgnoreCase("apagar")) {
                    System.out.println("Notificando a los observadores (patrón Observer) sobre la acción realizada.");
                }
            } while (!accion.equalsIgnoreCase("apagar"));

        } finally {
            scanner.close();
        }
    }
}
