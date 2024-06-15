package co.pragra.amex.guestapp.repo;

import co.pragra.amex.guestapp.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepo extends JpaRepository<Document, Integer> {
}
