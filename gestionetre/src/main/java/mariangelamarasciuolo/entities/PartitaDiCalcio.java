package mariangelamarasciuolo.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Partita")
public class PartitaDiCalcio extends Evento {
    String squadraDiCasa;
    String squadraDiOspite;
    String squadraVincente;
    int golSquadraDiCasa;
    int golSquadraOspite;

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getSquadraDiOspite() {
        return squadraDiOspite;
    }

    public void setSquadraDiOspite(String squadraDiOspite) {
        this.squadraDiOspite = squadraDiOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public int getGolSquadraDiCasa() {
        return golSquadraDiCasa;
    }

    public void setGolSquadraDiCasa(int golSquadraDiCasa) {
        this.golSquadraDiCasa = golSquadraDiCasa;
    }

    public int getGolSquadraOspite() {
        return golSquadraOspite;
    }

    public void setGolSquadraOspite(int golSquadraOspite) {
        this.golSquadraOspite = golSquadraOspite;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadraDiCasa='" + squadraDiCasa + '\'' +
                ", squadraDiOspite='" + squadraDiOspite + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", golSquadraDiCasa=" + golSquadraDiCasa +
                ", golSquadraOspite=" + golSquadraOspite +
                '}';
    }
}
