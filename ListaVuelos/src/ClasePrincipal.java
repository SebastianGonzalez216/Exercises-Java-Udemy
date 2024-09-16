import com.sebas.vuelos.Vuelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ClasePrincipal {
    public static void main(String[] args) throws ParseException {

        Date fecha = new Date();
        SimpleDateFormat fechaFormateada = new SimpleDateFormat("EEE dd MMM yyyy HH:mm", new Locale("es", "ES"));;

        String fechaHoraEntrada1 = "Lun 29 Ago 2021 05:39";
        String fechaHoraEntrada2 = "Lun 31 Ago 2021 04:45";
        String fechaHoraEntrada3 = "Lun 30 Ago 2021 16:00";
        String fechaHoraEntrada4 = "Lun 29 Ago 2021 13:22";
        String fechaHoraEntrada5 = "Lun 31 Ago 2021 14:05";
        String fechaHoraEntrada6 = "Lun 31 Ago 2021 05:20";
        String fechaHoraEntrada7 = "Lun 30 Ago 2021 08:45";
        String fechaHoraEntrada8 = "Lun 29 Ago 2021 07:41";
        String fechaHoraEntrada9 = "Lun 30 Ago 2021 10:35";
        String fechaHoraEntrada10 = "Lun 29 Ago 2021 09:14";
        String fechaHoraEntrada11 = "Lun 31 Ago 2021 08:33";
        String fechaHoraEntrada12 = "Lun 31 Ago 2021 15:15";
        String fechaHoraEntrada13 = "Lun 30 Ago 2021 08:14";
        String fechaHoraEntrada14 = "Lun 29 Ago 2021 22:53";
        String fechaHoraEntrada15 = "Lun 31 Ago 2021 09:57";
        String fechaHoraEntrada16 = "Lun 31 Ago 2021 04:00";
        String fechaHoraEntrada17 = "Lun 29 Ago 2021 07:45";
        String fechaHoraEntrada18 = "Lun 30 Ago 2021 07:12";
        String fechaHoraEntrada19 = "Lun 29 Ago 2021 18:29";
        String fechaHoraEntrada20 = "Lun 30 Ago 2021 15:45";

        Date fecha1 = fechaFormateada.parse(fechaHoraEntrada1);
        Date fecha2 = fechaFormateada.parse(fechaHoraEntrada2);
        Date fecha3 = fechaFormateada.parse(fechaHoraEntrada3);
        Date fecha4 = fechaFormateada.parse(fechaHoraEntrada4);
        Date fecha5 = fechaFormateada.parse(fechaHoraEntrada5);
        Date fecha6 = fechaFormateada.parse(fechaHoraEntrada6);
        Date fecha7 = fechaFormateada.parse(fechaHoraEntrada7);
        Date fecha8 = fechaFormateada.parse(fechaHoraEntrada8);
        Date fecha9 = fechaFormateada.parse(fechaHoraEntrada9);
        Date fecha10 = fechaFormateada.parse(fechaHoraEntrada10);
        Date fecha11 = fechaFormateada.parse(fechaHoraEntrada11);
        Date fecha12 = fechaFormateada.parse(fechaHoraEntrada12);
        Date fecha13 = fechaFormateada.parse(fechaHoraEntrada13);
        Date fecha14 = fechaFormateada.parse(fechaHoraEntrada14);
        Date fecha15 = fechaFormateada.parse(fechaHoraEntrada15);
        Date fecha16 = fechaFormateada.parse(fechaHoraEntrada16);
        Date fecha17 = fechaFormateada.parse(fechaHoraEntrada17);
        Date fecha18 = fechaFormateada.parse(fechaHoraEntrada18);
        Date fecha19 = fechaFormateada.parse(fechaHoraEntrada19);
        Date fecha20 = fechaFormateada.parse(fechaHoraEntrada20);


        List<Vuelo> listaVuelos = new ArrayList<>();

        listaVuelos.add(new Vuelo("AAL 933", "New York", "Santiago", fecha1, 62));
        listaVuelos.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", fecha2, 47));
        listaVuelos.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", fecha3, 52));
        listaVuelos.add(new Vuelo("DAL 147", "Atlanta", "Santiago", fecha4, 59));
        listaVuelos.add(new Vuelo("AVA 241", "Bogota", "Santiago", fecha5, 25));
        listaVuelos.add(new Vuelo("AMX 10", "Mexico City", "Santiago", fecha6, 29));
        listaVuelos.add(new Vuelo("IBE 6833", "Londres", "Santiago", fecha7, 55));
        listaVuelos.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", fecha8, 51));
        listaVuelos.add(new Vuelo("SKU 803", "Lima", "Santiago", fecha9, 48));
        listaVuelos.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago", fecha10, 59));
        listaVuelos.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", fecha11, 31));
        listaVuelos.add(new Vuelo("CMP 111", "Panama City", "Santiago", fecha12, 29));
        listaVuelos.add(new Vuelo("LAT 705", "Madrid", "Santiago", fecha13, 47));
        listaVuelos.add(new Vuelo("AAL 957", "Miami", "Santiago", fecha14, 60));
        listaVuelos.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", fecha15, 32));
        listaVuelos.add(new Vuelo("LAT 1283", "Cancún", "Santiago", fecha16, 35));
        listaVuelos.add(new Vuelo("LAT 579", "Barcelona", "Santiago", fecha17, 61));
        listaVuelos.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", fecha18, 58));
        listaVuelos.add(new Vuelo("LAT 501", "París", "Santiago", fecha19, 49));
        listaVuelos.add(new Vuelo("LAT 405", "Montevideo", "Santiago", fecha20, 39));

        Collections.sort(listaVuelos, new Comparator<Vuelo>() {
            @Override
            public int compare(Vuelo v1, Vuelo v2) {
                return v1.getFechayhora().compareTo(v2.getFechayhora());
            }
        });

        System.out.println("========= VUELOS ORDENADOS POR FECHA Y HORA DE LLEGADA ========\n");
        for(Vuelo lv : listaVuelos){
            System.out.println(lv);

        }

        Comparator<Vuelo> comparator = new Comparator<Vuelo>() {
            @Override
            public int compare(Vuelo v1, Vuelo v2) {
                return v1.getFechayhora().compareTo(v2.getFechayhora());
            }
        };

        Vuelo ultimoVuelo = Collections.max(listaVuelos, comparator);

        System.out.println("\n El último vuelo en llegar fue el -----> " + ultimoVuelo);

        Comparator<Vuelo> comparatorPasajeros = new Comparator<Vuelo>() {
            @Override
            public int compare(Vuelo v1, Vuelo v2) {
                return Integer.compare(v1.getNumPasajeros(), v2.getNumPasajeros());
            }
        };

        Vuelo vueloMenorPasajeros = Collections.min(listaVuelos, comparatorPasajeros);
        System.out.println("\n El vuelo con el menor número de pasajeros es -----> " + vueloMenorPasajeros);


    }
}
