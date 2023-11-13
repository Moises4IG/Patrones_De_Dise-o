public class FerrariSF90XXStradale extends CarroTemplate implements Observable {
    private String motor, modoManejo, ruedasMarca, color, tipoFrenos;

    public FerrariSF90XXStradale(String motor, String modoManejo, String ruedasMarca, String color, String tipoFrenos) {
        this.motor = motor;
        this.modoManejo = modoManejo;
        this.ruedasMarca = ruedasMarca;
        this.color = color;
        this.tipoFrenos = tipoFrenos;
    }

    @Override
    public void encender() {
        System.out.println("Ferrari SF90 XX Stradale encendido (Template Method).");
        System.out.println("Notificando a los observadores (patrón Observer) sobre el encendido.");
        notificarObservadores("Ferrari SF90 XX Stradale encendido");
    }

    @Override
    public void acelerar() {
        System.out.println("Ferrari SF90 XX Stradale acelerando (Template Method).");
        notificarObservadores("Ferrari SF90 XX Stradale acelerando");
    }

    @Override
    public void apagar() {
        System.out.println("Ferrari SF90 XX Stradale apagado (Template Method).");
        notificarObservadores("Ferrari SF90 XX Stradale apagado");
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Ferrari SF90 XX Stradale - Motor: " + motor + ", Modo de Manejo: " + modoManejo + ", Ruedas: " + ruedasMarca + ", Color: " + color + ", Frenos: " + tipoFrenos);
    }
}
