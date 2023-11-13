public class ProxyCarro implements Carro {
    private Carro carroReal;
    private String passwordCorrecta;

    public ProxyCarro(Carro carro, String passwordCorrecta) {
        this.carroReal = carro;
        this.passwordCorrecta = passwordCorrecta;
    }

    private boolean verificarAcceso(String passwordIntroducida) {
        return this.passwordCorrecta.equals(passwordIntroducida);
    }

    public void realizarAccion(String accion, String passwordIntroducida) {
        if (verificarAcceso(passwordIntroducida)) {
            switch (accion.toLowerCase()) {
                case "encender":
                    carroReal.encender();
                    break;
                case "acelerar":
                    carroReal.acelerar();
                    break;
                case "apagar":
                    carroReal.apagar();
                    break;
                default:
                    System.out.println("Acción no reconocida.");
                    break;
            }
        } else {
            System.out.println("Acceso denegado. Contraseña incorrecta.");
        }
    }

    @Override
    public void encender() {}

    @Override
    public void acelerar() {}

    @Override
    public void apagar() {}

    @Override
    public void mostrarDetalles() {
        carroReal.mostrarDetalles();
    }
}
