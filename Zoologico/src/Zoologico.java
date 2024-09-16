import com.zoologico.animales.*;

public class Zoologico {
    public static void main(String[] args) {
        Mamifero mamiferos[] = new Mamifero[5];

        mamiferos[0] = new Tigre("Selva tropical", 1.1f, 2.5f, 220.5f, "Panthera tigris", 7.5f, 60, "Tigre de Bengala");
        mamiferos[1] = new Leon("Sabana africana", 1.2f, 2.4f, 190.0f, "Panthera leo", 6.0f, 80, 15, 114.0f);
        mamiferos[2] = new Guepardo("Sabana africana", 0.9f, 1.5f, 72.0f, "Acinonyx jubatus", 4.0f, 110);

        mamiferos[3] = new Lobo("Bosques templados", 0.85f, 1.6f, 45.0f, "Canis lupus", "Gris", 2.5f, 6, "Lobo gris");
        mamiferos[4] = new Perro("Entorno doméstico", 0.5f, 1.0f, 20.0f, "Canis lupus familiaris", "Marrón", 1.2f, 300);

        for(Mamifero listaMamiferos : mamiferos){
            System.out.println(listaMamiferos + "\n");
            System.out.println(listaMamiferos.comer());
            System.out.println(listaMamiferos.dormir());
            System.out.println(listaMamiferos.correr());
            System.out.println(listaMamiferos.comunicarse() + "\n");
        }
    }
}
