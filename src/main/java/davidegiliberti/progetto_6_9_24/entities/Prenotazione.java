package davidegiliberti.progetto_6_9_24.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "prenotazione")
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDateTime dataPrenotazione;
    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;
    @ManyToOne
    @JoinColumn(name = "postazione_id")
    private Postazione postazione;

    public Prenotazione() {
    }

    public Prenotazione(LocalDateTime dataPrenotazione, Utente utente, Postazione postazione) {
        this.dataPrenotazione = dataPrenotazione;
        this.utente = utente;
        this.postazione = postazione;
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getDataPrenotazione() {
        return dataPrenotazione;
    }

    public void setDataPrenotazione(LocalDateTime dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Postazione getPostazione() {
        return postazione;
    }

    public void setPostazione(Postazione postazione) {
        this.postazione = postazione;
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "id=" + id +
                ", dataPrenotazione=" + dataPrenotazione +
                ", utente=" + utente +
                ", postazione=" + postazione +
                '}';
    }
}
