package org.backend.loppu.Repository;

import org.backend.loppu.Model.Anturi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnturiRepo extends JpaRepository<Anturi, Long> {


    List<Anturi> findAllByBlock(String block);

    List<Anturi> findAllByStatus(Boolean status);

}
