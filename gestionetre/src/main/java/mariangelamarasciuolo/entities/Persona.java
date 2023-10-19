package mariangelamarasciuolo.entities;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue
    Long id;

    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private String email;
    @Enumerated(EnumType.STRING) // Annotazione specifica per gli Enum
    private Sesso sesso;
    @OneToMany(mappedBy = "persona", cascade = CascadeType.REMOVE)
    private List<Partecipazione> listaPartecipanti;
}
