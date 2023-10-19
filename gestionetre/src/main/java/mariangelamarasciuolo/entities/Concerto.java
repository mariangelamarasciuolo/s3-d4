package mariangelamarasciuolo.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("Concerto")
public class Concerto extends Evento {

    public boolean inStreaming;

    private Genere genere;

    public Concerto(String titolo, LocalDate data_evento, String descrizione, TipoEvento tipoEvento, int numero_max_partecipanti, Location location, boolean inStreaming, Genere genere) {
        super(titolo, data_evento, descrizione, tipoEvento, numero_max_partecipanti, location);
        this.inStreaming = inStreaming;
        this.genere = genere;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public boolean isInStreaming() {
        return inStreaming;
    }

    public void setInStreaming(boolean inStreaming) {
        this.inStreaming = inStreaming;
    }


}
