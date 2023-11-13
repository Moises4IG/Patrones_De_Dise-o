import java.util.ArrayList;
import java.util.List;

public interface Observable {
    List<Observador> observadores = new ArrayList<>();

    default void añadirObservador(Observador observador) {
        observadores.add(observador);
    }

    default void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    default void notificarObservadores(String mensaje) {
        for (Observador observador : observadores) {
            observador.notificar(mensaje);
        }
    }
}
