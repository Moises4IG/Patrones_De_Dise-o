public class KiaPicanto extends CarroTemplate implements Observable {
    private String motor, transmision, sistemaAudioMarca, color, tipoRin;

    public KiaPicanto(String motor, String transmision, String sistemaAudioMarca, String color, String tipoRin) {
        this.motor = motor;
        this.transmision = transmision;
        this.sistemaAudioMarca = sistemaAudioMarca;
        this.color = color;
        this.tipoRin = tipoRin;
    }

    @Override
    public void encender() {
        System.out.println("Kia Picanto encendido (Template Method).");
        System.out.println("Notificando a los observadores (Observer) sobre el encendido.");
        notificarObservadores("Kia Picanto encendido");
    }

    @Override
    public void acelerar() {
        System.out.println("Kia Picanto acelerando (Template Method).");
        System.out.println("Notificando a los observadores (Observer) sobre la aceleración.");
        notificarObservadores("Kia Picanto acelerando");
    }

    @Override
    public void apagar() {
        System.out.println("Kia Picanto apagado (Template Method).");
        System.out.println("Notificando a los observadores (Observer) sobre el apagado.");
        notificarObservadores("Kia Picanto apagado");
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Kia Picanto - Motor: " + motor + ", Transmisión: " + transmision + ", Sistema de Audio: " + sistemaAudioMarca + ", Color: " + color + ", Tipo de Rin: " + tipoRin);
    }
}
