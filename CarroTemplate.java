public abstract class CarroTemplate implements Carro {

    public final void operarCarro() {
        encender();
        acelerar();
        apagar();
    }

    @Override
    public abstract void encender();

    @Override
    public abstract void acelerar();

    @Override
    public abstract void apagar();

    public abstract void mostrarDetalles();
}
