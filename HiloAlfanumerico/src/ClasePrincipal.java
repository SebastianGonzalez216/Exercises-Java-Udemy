import com.sebastian.hilos.*;

public class ClasePrincipal {
    public synchronized static void main(String[] args) throws InterruptedException {
        Object lock = new Object(); // Objeto de bloqueo compartido

        AlfanumericoTarea tareaLetras = new AlfanumericoTarea(Tipo.LETRA, lock);
        Thread hiloLetras = new Thread(tareaLetras);

        AlfanumericoTarea tareaNumeros = new AlfanumericoTarea(Tipo.NUMERO, lock);
        Thread hiloNumeros = new Thread(tareaNumeros);

        hiloNumeros.start();
        hiloLetras.start();

        hiloNumeros.join();
        hiloLetras.join();
    }
}