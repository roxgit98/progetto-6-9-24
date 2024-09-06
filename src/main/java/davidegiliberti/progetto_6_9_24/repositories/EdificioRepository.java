package davidegiliberti.progetto_6_9_24.repositories;

import davidegiliberti.progetto_6_9_24.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Long> {
}
