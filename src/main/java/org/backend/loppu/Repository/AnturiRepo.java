package org.backend.loppu.Repository;

import org.backend.loppu.Model.Anturi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AnturiRepo extends JpaRepository<Anturi, Long> {

    Optional<Anturi> findById(Long id);

    List<Anturi> id(Long id);

}
