package davidegiliberti.progetto_6_9_24.runners;

import davidegiliberti.progetto_6_9_24.entities.Edificio;
import davidegiliberti.progetto_6_9_24.entities.Postazione;
import davidegiliberti.progetto_6_9_24.entities.Prenotazione;
import davidegiliberti.progetto_6_9_24.entities.Utente;
import davidegiliberti.progetto_6_9_24.enums.TipoPostazione;
import davidegiliberti.progetto_6_9_24.services.EdificioService;
import davidegiliberti.progetto_6_9_24.services.PostazioneService;
import davidegiliberti.progetto_6_9_24.services.PrenotazioneService;
import davidegiliberti.progetto_6_9_24.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MainRunner implements CommandLineRunner {
    @Autowired
    private EdificioService edificioService;
    @Autowired
    private PostazioneService postazioneService;
    @Autowired
    private PrenotazioneService prenotazioneService;
    @Autowired
    private UtenteService utenteService;

    @Override
    public void run(String... args) {

        Edificio edificio = new Edificio("edificio 1", "via palizzi", "milano");
        edificioService.salva(edificio);

        Postazione postazione = new Postazione("postazione 1", TipoPostazione.PRIVATO, 2);
        postazioneService.salva(postazione);

        Prenotazione prenotazione = new Prenotazione(LocalDateTime.parse("2024-09-06T15:00:00"));
        prenotazioneService.salva(prenotazione);

        Utente utente = new Utente("giacomo", "poretti", "gporetti@gmail.com");
        utenteService.salva(utente);
    }
}
