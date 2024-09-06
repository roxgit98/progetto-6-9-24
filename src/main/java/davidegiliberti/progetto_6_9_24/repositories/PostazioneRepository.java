package davidegiliberti.progetto_6_9_24.repositories;

import davidegiliberti.progetto_6_9_24.entities.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
}
