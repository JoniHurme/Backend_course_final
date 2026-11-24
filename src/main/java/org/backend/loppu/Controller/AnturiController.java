package org.backend.loppu.Controller;

import org.backend.loppu.Model.Anturi;
import org.backend.loppu.Service.AnturiService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/anturit")
public class AnturiController {


    private final AnturiService anturiService;

    public AnturiController(AnturiService anturiService) {
        this.anturiService = anturiService;
    }

    @GetMapping
    public List<Anturi> GetAll() {
        return anturiService.findAll();
    }

    @GetMapping("/block/{block}")
    public List<Anturi> GetAllFromBlock(@PathVariable String block) {
        return anturiService.GetAllFromBlock(block);
    }

    @GetMapping("/status/{status}")
    public List<Anturi> GetAllByStatus(@PathVariable Boolean status) {
        return anturiService.GetAllByStatus(status);
    }

    @PostMapping
    public Anturi addNewAnturi(@RequestBody Anturi anturi) {
        return anturiService.addNewAnturi(anturi);
    }

    @PostMapping({"/{id}/status"})
    public Anturi updateAnturiStatus(@PathVariable Long id) {
        return anturiService.updateAnturiStatus(id);
    }
    @PostMapping("/{id}/block")
    public Anturi updateAnturiBlock(@PathVariable Long id, @RequestBody String newBlock) {
        return anturiService.updateAnturiBlock(id, newBlock);
    }


}
