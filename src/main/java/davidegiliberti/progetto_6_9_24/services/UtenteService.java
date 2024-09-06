package davidegiliberti.progetto_6_9_24.services;

import davidegiliberti.progetto_6_9_24.entities.Utente;
import davidegiliberti.progetto_6_9_24.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtenteService {
    @Autowired
    private UtenteRepository utenteRepository;

    public Utente ricercaId(long id) {
        return utenteRepository.findById(id).orElseThrow();
    }

    public void salva(Utente utente) {
        utenteRepository.save(utente);
    }

    public void elimina(long id) {
        Utente found = this.ricercaId(id);
        utenteRepository.delete(found);
    }
}
