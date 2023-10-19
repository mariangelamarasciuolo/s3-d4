package mariangelamarasciuolo.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PersonaDAO {
    private final EntityManager em;

    public PersonaDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Persona pers) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(pers);
        transaction.commit();
        System.out.println("Il partecipante è stato salvato correttamente!");
    }

    public Persona findById(long id) {
        return em.find(Persona.class, id);
    }

    public void findAndDelete(long id) {
        Persona found = em.find(Persona.class, id);
        if (found != null) {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(found);
            transaction.commit();
            System.out.println("Il partecipante è stato cancellato correttamente");
        } else {
            System.err.println("Il partecipante con l'id " + id + " non è stato trovato");
        }
    }
}
