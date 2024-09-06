package davidegiliberti.progetto_6_9_24.services;

import davidegiliberti.progetto_6_9_24.entities.Prenotazione;
import davidegiliberti.progetto_6_9_24.repositories.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrenotazioneService {
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public Prenotazione ricercaId(long id) {
        return prenotazioneRepository.findById(id).orElseThrow();
    }

    public void salva(Prenotazione prenotazione) {
        prenotazioneRepository.save(prenotazione);
    }

    public void elimina(long id) {
        Prenotazione found = this.ricercaId(id);
        prenotazioneRepository.delete(found);
    }
}
