package ma.enset.states;


import ma.enset.client.AvionImpl;

public abstract class State {
    protected AvionImpl avion;

    public State(AvionImpl avion) {
        this.avion = avion;
    }

    public  abstract void executeSortirDuGarage(); // transitionn d'etat
    public  abstract void executeEntererAuGarage();
    public abstract void executeAtterir();
    public abstract  void executeDecoller();
    public abstract void executeDoActivity(); // activite
}
