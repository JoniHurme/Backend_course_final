package org.backend.loppu.Controller;

import org.backend.loppu.Model.Anturi;
import org.backend.loppu.Repository.AnturiRepo;
import org.backend.loppu.Service.AnturiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public Anturi addNewAnturi(Anturi anturi) {
        return anturiService.addNewAnturi(anturi);
    }


}
