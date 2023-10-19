package mariangelamarasciuolo.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "eventi")

public class Evento {
    @Id
    @GeneratedValue
    private long id;
    private String titolo;
    private LocalDate data_evento;
    private String descrizione;
    @Enumerated(EnumType.STRING) // Annotazione specifica per gli Enum
    private TipoEvento tipoEvento;
    private int numero_max_partecipanti;
    @OneToMany(mappedBy = "evento", cascade = CascadeType.REMOVE)
    private Set<Partecipazione> SetPartecipanti;

    @ManyToOne
    private Location location;


    public Evento() {
    }

    public Evento(String titolo, LocalDate data_evento, String descrizione, TipoEvento tipoEvento, int numero_max_partecipanti) {
        this.titolo = titolo;
        this.data_evento = data_evento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numero_max_partecipanti = numero_max_partecipanti;
    }

    public long getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getData_evento() {
        return data_evento;
    }

    public void setData_evento(LocalDate data_evento) {
        this.data_evento = data_evento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getNumero_max_partecipanti() {
        return numero_max_partecipanti;
    }

    public void setNumero_max_partecipanti(int numero_max_partecipanti) {
        this.numero_max_partecipanti = numero_max_partecipanti;
    }

    public Set<Partecipazione> getSetPartecipanti() {
        return SetPartecipanti;
    }

    public void setSetPartecipanti(Set<Partecipazione> setPartecipanti) {
        SetPartecipanti = setPartecipanti;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
