package ma.enset.states;


import ma.enset.client.AvionImpl;

public class EtatAuGarage extends State {
    public EtatAuGarage(AvionImpl avion) {
        super(avion);
    }

    @Override
    public void executeSortirDuGarage() {
        avion.setState(new EtatAuPiste(avion));
        System.out.println("Transition etat garage ==> en piste   ");
    }

    @Override
    public void executeEntererAuGarage() {
        System.out.println("Imposible d'enterer au garage je suis deja en garage ");
    }

    @Override
    public void executeAtterir() {
        System.out.println("Imposible atterir  je suis deja au garage ");
    }

    @Override
    public void executeDecoller() {
        System.out.println("Imposible de decoller  je suis deja au garage ");
    }

    @Override
    public void executeDoActivity() {
        System.out.println("Activite au garage ....");
    }
}
