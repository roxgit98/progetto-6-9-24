package davidegiliberti.progetto_6_9_24.services;

import davidegiliberti.progetto_6_9_24.entities.Edificio;
import davidegiliberti.progetto_6_9_24.repositories.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdificioService {
    @Autowired
    private EdificioRepository edificioRepository;

    public Edificio ricercaId(long id) {
        return edificioRepository.findById(id).orElseThrow();
    }

    public void salva(Edificio edificio) {
        edificioRepository.save(edificio);
    }

    public void elimina(long id) {
        Edificio found = this.ricercaId(id);
        edificioRepository.delete(found);
    }
}
