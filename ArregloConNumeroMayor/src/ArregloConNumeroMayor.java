public class ArregloConNumeroMayor {
    public static void main(String[] args) {

        int[] listaNumeros = {14, 33, 15, 36, 78, 21, 43};
        int numeroMayor = 0;

        System.out.println("---- BIENVENIDO ----\n");
        System.out.println("Este programa determinara el número mas grande en el arreglo dado:\n");

        for(int i = 0; i < listaNumeros.length; i++){
            System.out.print("[" + listaNumeros[i] + "]");
        }

        for(int i = 0; i < listaNumeros.length-1; i++) {
            if (listaNumeros[i]  < listaNumeros[i + 1] && numeroMayor < listaNumeros[i + 1]) {
                numeroMayor = listaNumeros[i+1];
            }
        }
        System.out.println("\n\nEl elemento mayor en el arreglo dado es:\n");
        System.out.print("[" + numeroMayor + "]");
    }
}
