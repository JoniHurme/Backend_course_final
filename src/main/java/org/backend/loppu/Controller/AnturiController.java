package org.backend.loppu.Controller;

import org.backend.loppu.Model.Anturi;
import org.backend.loppu.Repository.AnturiRepo;
import org.backend.loppu.Service.AnturiService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/anturit")
public class AnturiController {


    private final AnturiService anturiService;
    private final AnturiRepo anturiRepo;

    public AnturiController(AnturiService anturiService, AnturiRepo anturiRepo) {
        this.anturiService = anturiService;
        this.anturiRepo = anturiRepo;
    }

    @GetMapping
    public List<Anturi> GetAll() {
        return anturiService.findAll();
    }

    @PostMapping
    public Anturi addNewAnturi(@RequestBody Anturi anturi) {
        return anturiService.addNewAnturi(anturi);
    }


}
