package org.backend.loppu.Service;

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


//    GET
    public List<Anturi> findAll() {
        return new ArrayList<>(anturiRepo.findAll());
    }

    public List<Anturi> GetAllFromBlock(String block) {
        return anturiRepo.findAllByBlock(block);
    }

    public List<Anturi> GetAllByStatus(Boolean status) {
        return anturiRepo.findAllByStatus(status);
    }

//    POST
    public Anturi addNewAnturi(Anturi anturi) {
        return anturiRepo.save(anturi);
    }

    public Anturi updateAnturiStatus(Long id) {
//        Get the wanted anturi to be manipulated.
        Anturi anturi = getAnturiById(id);

//        IDE suggested simplified if else statement. Looks quite funky.
        anturi.setStatus(!anturi.getStatus());

        anturiRepo.save(anturi);
        return anturi;
    }

    public Anturi updateAnturiBlock(Long id, String newBlock) {
        Anturi anturi = getAnturiById(id);

        anturi.setBlock(newBlock);
        anturiRepo.save(anturi);
        return anturi;

    }
}
