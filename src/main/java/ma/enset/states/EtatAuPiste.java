package ma.enset.states;


import ma.enset.client.AvionImpl;

public class EtatAuPiste extends State {
    public EtatAuPiste(AvionImpl avion) {
        super(avion);
    }

    @Override
    public void executeSortirDuGarage() {
        System.out.println("Imposible je suis deja en piste ");
    }

    @Override
    public void executeEntererAuGarage() {
        avion.setState(new EtatAuGarage(avion));
        System.out.println("Transition etat piste ==> Garage  ");
    }

    @Override
    public void executeAtterir() {
        System.out.println("Imposible je suis deja en piste ");
    }

    @Override
    public void executeDecoller() {
        avion.setState(new EtatEnLair(avion));
        System.out.println("Transition etat piste ==> Decoller   ");
    }

    @Override
    public void executeDoActivity() {
        System.out.println("Activite au piste....");
    }
}
