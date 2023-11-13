import java.util.Scanner;

public class FabricaKiaPicanto implements FabricaDeCarros {
    @Override
    public Carro crearCarro(Scanner scanner) {
        String motor, transmision, sistemaAudioMarca, color, tipoRin;

        System.out.println("Selecciona el tipo de motor para el Kia Picanto (Convencional/Premium): ");
        if(scanner.nextLine().equalsIgnoreCase("Convencional")) {
            motor = "1.25L DOHC CVVT Dual 16 Válvulas";
            System.out.println("Has elegido el motor 1.25L DOHC CVVT Dual 16 Válvulas para tu Kia Picanto.");
        } else {
            motor = "1.25L Turbo";
            System.out.println("¡Excelente elección! Has optado por el motor 1.25L Turbo. Esto brindará a tu Kia Picanto una mayor potencia y rendimiento.");
        }

        System.out.println("Selecciona el tipo de transmisión (Manual/Automática): ");
        transmision = scanner.nextLine();
        System.out.println("Has seleccionado la transmisión " + transmision + " para tu Kia Picanto.");

        System.out.println("Selecciona el sistema de audio (Convencional/Premium): ");
        if(scanner.nextLine().equalsIgnoreCase("Convencional")) {
            System.out.println("Elige la marca del sistema de audio (Sony/Pioneer): ");
            sistemaAudioMarca = scanner.nextLine();
            System.out.println("Has seleccionado el sistema de audio " + sistemaAudioMarca + " convencional para tu Kia Picanto.");
        } else {
            System.out.println("Elige la marca del sistema de audio (Bose/Bang & Olufsen): ");
            sistemaAudioMarca = scanner.nextLine();
            System.out.println("¡Buena elección! Has seleccionado el sistema de audio premium " + sistemaAudioMarca + " para tu Kia Picanto.");
        }

        System.out.println("Elige un color para tu Kia Picanto (Blanco, Negro, Plata, Rojo): ");
        color = scanner.nextLine();
        System.out.println("Has elegido el color " + color + " para tu Kia Picanto.");

        System.out.println("Selecciona el tipo de rin (Convencional/Premium): ");
        if(scanner.nextLine().equalsIgnoreCase("Convencional")) {
            tipoRin = "15\" Aluminio";
            System.out.println("Has seleccionado rines de 15\" de aluminio para tu Kia Picanto.");
        } else {
            tipoRin = "16\" Aleación deportiva";
            System.out.println("¡Excelente! Has optado por rines de 16\" de aleación deportiva para tu Kia Picanto.");
        }

        return new KiaPicanto(motor, transmision, sistemaAudioMarca, color, tipoRin);
    }
}
