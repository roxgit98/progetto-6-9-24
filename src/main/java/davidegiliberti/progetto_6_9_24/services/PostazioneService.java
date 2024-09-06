package davidegiliberti.progetto_6_9_24.services;

import davidegiliberti.progetto_6_9_24.entities.Postazione;
import davidegiliberti.progetto_6_9_24.repositories.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostazioneService {
    @Autowired
    private PostazioneRepository postazioneRepository;

    public Postazione ricercaId(long id) {
        return postazioneRepository.findById(id).orElseThrow();
    }

    public void salva(Postazione postazione) {
        postazioneRepository.save(postazione);
    }

    public void elimina(long id) {
        Postazione found = this.ricercaId(id);
        postazioneRepository.delete(found);
    }
}
