package com.sebastian.hilos;

public class AlfanumericoTarea implements Runnable {
    private static boolean numeroTurno = true;
    private Tipo tipo;
    private final Object lock;

    public AlfanumericoTarea(Tipo tipo, Object lock) {
        this.tipo = tipo;
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            generarMuestra();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void generarMuestra() throws InterruptedException {
        synchronized (lock) {
            if (tipo.equals(Tipo.NUMERO)) {
                while (!numeroTurno) {
                    lock.wait();
                }
                for (int i = 1; i <= 9; i++) {
                    System.out.print(i + " ");
                    Thread.sleep(500);
                }
                numeroTurno = false;
                lock.notifyAll();

            } else if (tipo.equals(Tipo.LETRA)) {
                while (numeroTurno) {
                    lock.wait();
                }
                for (char c = 'A'; c <= 'Z'; c++) {
                    System.out.print(c + " ");
                    Thread.sleep(500);
                }
                numeroTurno = true;
                lock.notifyAll();
            }
            System.out.println();
        }
    }
}