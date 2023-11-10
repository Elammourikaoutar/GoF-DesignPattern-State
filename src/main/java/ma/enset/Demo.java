package ma.enset;


import ma.enset.client.AvionImpl;

public class Demo {
    public static void main(String[] args) {
        AvionImpl avion = new AvionImpl();
        avion.doActivity();
        avion.sortirDuGarage();
        avion.entererAuGarage();
        avion.sortirDuGarage();
        avion.decoller();
        avion.entererAuGarage();
        avion.atterir();
        avion.doActivity();

    }
}
