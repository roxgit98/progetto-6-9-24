package davidegiliberti.progetto_6_9_24.entities;

import davidegiliberti.progetto_6_9_24.enums.TipoPostazione;
import jakarta.persistence.*;

@Entity
@Table(name = "postazione")
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String descrizione;
    @Enumerated(EnumType.STRING)
    private TipoPostazione tipoPostazione;
    private int numeroMaxOccupanti;
    @ManyToOne
    @JoinColumn(name = "id_edificio")
    private Edificio edificio;

    public Postazione() {
    }

    public Postazione(String descrizione, TipoPostazione tipoPostazione, int numeroMaxOccupanti, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.numeroMaxOccupanti = numeroMaxOccupanti;
        this.edificio = edificio;
    }

    public long getId() {
        return id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public TipoPostazione getTipoPostazione() {
        return tipoPostazione;
    }

    public void setTipoPostazione(TipoPostazione tipoPostazione) {
        this.tipoPostazione = tipoPostazione;
    }

    public int getNumeroMaxOccupanti() {
        return numeroMaxOccupanti;
    }

    public void setNumeroMaxOccupanti(int numeroMaxOccupanti) {
        this.numeroMaxOccupanti = numeroMaxOccupanti;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    @Override
    public String toString() {
        return "Postazione{" +
                "id=" + id +
                ", descrizione='" + descrizione + '\'' +
                ", tipoPostazione=" + tipoPostazione +
                ", numeroMaxOccupanti=" + numeroMaxOccupanti +
                ", edificio=" + edificio +
                '}';
    }
}
