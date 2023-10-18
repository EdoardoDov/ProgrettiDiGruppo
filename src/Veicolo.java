import java.util.Random;

public class Veicolo {
    private int id;
    private String posizione;
    private boolean affittato = false;
    private static int count =0;

    public Veicolo(){
        this.id = count;
        count++;
    }


    public int getId() {
        return id;
    }

    public String getPosizione() {
        return posizione;
    }

    public void setPosizione(String posizione) {
        this.posizione = posizione;
    }

    public boolean isAffittato() {
        return affittato;
    }

    public void setAffittato(boolean affittato) {
        this.affittato = affittato;
    }

    //il veicolo è stato noleggiato da un utente
    public void affitoVeicolo() {
        affittato = true;
    }

    //il veicolo è stato restituito ed è ora disponibile per il noleggio
    public void returnVeicolo() {
        affittato = false;
    }

    @Override
    public String toString() {
        return
                "Veicolo"
                + "id="
                + id
                + ", posizione='"
                + posizione
                + ", affittato="
                + affittato;
    }
}

