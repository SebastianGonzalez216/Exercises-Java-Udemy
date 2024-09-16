import com.sebas.patrones.abstractfactory.fabricas.FabricaDeGalletas;
import com.sebas.patrones.abstractfactory.fabricas.FabricaGalletasChispas;
import com.sebas.patrones.abstractfactory.fabricas.FabricaGalletasRellenas;
import com.sebas.patrones.singleton.ConexionBD;

public class EjemplosMain {
    public static void main(String[] args) {

        /* --- Singleton ---

        for(int i =0; i < 10; i++) {
            System.out.println(ConexionBD.getInstance());
        }
        */

        // --- Abstract Factory ---

        FabricaGalletasChispas fabricaChispas = new FabricaGalletasChispas();
        FabricaGalletasRellenas fabricaRellenas = new FabricaGalletasRellenas();
        int opc = 2;

        switch(opc){
            case 1:
                FabricaDeGalletas.crearFabricaDeGalletas(fabricaChispas);

                break;
            case 2:
                FabricaDeGalletas.crearFabricaDeGalletas(fabricaRellenas);

                break;

            default:
                throw new IllegalStateException("Unexpected value: " + opc);
        }

    }
}
