package edu.uptc.parcialElectiva.repositories;

import edu.uptc.parcialElectiva.entities.Matter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatterRepository extends JpaRepository<Matter, String> {
}
