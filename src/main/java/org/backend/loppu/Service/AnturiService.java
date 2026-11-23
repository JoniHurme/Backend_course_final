package org.backend.loppu.Service;

import jakarta.persistence.Id;
import org.backend.loppu.Model.Anturi;
import org.backend.loppu.Repository.AnturiRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnturiService {

    private final AnturiRepo anturiRepo;

    public AnturiService(AnturiRepo anturiRepo) {
        this.anturiRepo = anturiRepo;
    }


    public Anturi getAnturiById(Long id) {
        return anturiRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Anturia ei ole" + id));
    }


    public List<Anturi> findAll() {
        return new ArrayList<>(anturiRepo.findAll());
    }


    public Anturi addNewAnturi(Anturi anturi) {
        return anturiRepo.save(anturi);
    }

}
