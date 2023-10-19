package mariangelamarasciuolo.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.List;

@Entity
@DiscriminatorValue("Gara")
public class GaraDiAtletica extends Evento {
    public List<Persona> setAtleti;
    public Persona vincitore;

    public List<Persona> getSetAtleti() {
        return setAtleti;
    }

    public void setSetAtleti(List<Persona> setAtleti) {
        this.setAtleti = setAtleti;
    }

    public Persona getVincitore() {
        return vincitore;
    }

    public void setVincitore(Persona vincitore) {
        vincitore = vincitore;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "setAtleti=" + setAtleti +
                ", Vincitore=" + vincitore +
                '}';
    }
}
