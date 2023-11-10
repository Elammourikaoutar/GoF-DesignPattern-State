package ma.enset.states;


import ma.enset.client.AvionImpl;

public class EtatEnLair extends State {
    public EtatEnLair(AvionImpl avion) {
        super(avion);
    }

    @Override
    public void executeSortirDuGarage() {
        System.out.println("Imposible sortir  au garage je suis en lair  ");
    }

    @Override
    public void executeEntererAuGarage() {
        System.out.println("Imposible enterer au garage je suis en lair  ");
    }

    @Override
    public void executeAtterir() {
            avion.setState(new EtatAuPiste(avion));
        System.out.println("Transition decoller  piste ==> en piste    ");
    }

    @Override
    public void executeDecoller() {
        System.out.println("Imposible de decoller  au garage je suis en lair  ");
    }

    @Override
    public void executeDoActivity() {
        System.out.println("Activite decoller  ....");
    }
}
