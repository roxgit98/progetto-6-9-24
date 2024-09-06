package davidegiliberti.progetto_6_9_24.repositories;

import davidegiliberti.progetto_6_9_24.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {
}
