import java.util.Scanner;

public class FabricaFerrariSF90XXStradale implements FabricaDeCarros {
    @Override
    public Carro crearCarro(Scanner scanner) {
        String motor, modoManejo, ruedasMarca, color, tipoFrenos;

        System.out.println("Selecciona el tipo de motor del Ferrari SF90 XX Stradale (Convencional/Premium): ");
        if (scanner.nextLine().equalsIgnoreCase("Convencional")) {
            motor = "V8";
            System.out.println("Has elegido el motor V8 convencional para tu Ferrari.");
        } else {
            motor = "Híbrido";
            System.out.println("¡Excelente elección! Has optado por el motor Híbrido. Esto brindará a tu Ferrari una combinación de potencia y eficiencia.");
        }

        System.out.println("Selecciona el modo de manejo (Convencional/Premium): ");
        if (scanner.nextLine().equalsIgnoreCase("Convencional")) {
            modoManejo = "Carretera";
            System.out.println("Has seleccionado el modo de manejo para Carretera. Ideal para un paseo suave y relajante.");
        } else {
            modoManejo = "Pista";
            System.out.println("¡Impresionante! Has elegido el modo de manejo Premium. Tu Ferrari estará en modo Pista, preparado para dar lo mejor en el circuito.");
        }

        System.out.println("Selecciona el tipo de ruedas (Convencional/Premium): ");
        if (scanner.nextLine().equalsIgnoreCase("Convencional")) {
            System.out.println("Elige la marca de ruedas (Michelin/Pirelli): ");
            ruedasMarca = scanner.nextLine();
            System.out.println("Has seleccionado las ruedas " + ruedasMarca + " convencionales.");
        } else {
            System.out.println("Elige la marca de ruedas (Bridgestone/Goodyear): ");
            ruedasMarca = scanner.nextLine();
            System.out.println("¡Buena elección! Has seleccionado las ruedas premium de marca " + ruedasMarca + ".");
        }

        System.out.println("Elige un color para tu Ferrari SF90 XX Stradale (Rojo, Negro, Amarillo, Blanco): ");
        color = scanner.nextLine();
        System.out.println("Has elegido el color " + color + " para tu Ferrari. Definitivamente destacará en la carretera.");

        System.out.println("Selecciona el tipo de frenos (Convencional/Premium): ");
        if (scanner.nextLine().equalsIgnoreCase("Convencional")) {
            tipoFrenos = "Disco estándar";
            System.out.println("Has seleccionado frenos de disco estándar. Confiables y eficientes.");
        } else {
            tipoFrenos = "Disco ventilado cerámico";
            System.out.println("¡Excelente! Has optado por frenos de disco ventilado cerámico. Estos ofrecen una mayor resistencia al calor y un mejor rendimiento en condiciones extremas.");
        }

        return new FerrariSF90XXStradale(motor, modoManejo, ruedasMarca, color, tipoFrenos);
    }
}
