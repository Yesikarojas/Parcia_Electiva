package edu.uptc.parcialElectiva.controllers;

import edu.uptc.parcialElectiva.entities.Matter;
import edu.uptc.parcialElectiva.services.MatterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/matters")
public class MatterController {
    private MatterService matterService;

    public MatterController(MatterService matterService) {
        this.matterService = matterService;
    }
    @GetMapping
    public List<Matter> getMatters(){return  matterService.getMatters();}
    @GetMapping("/{id}")
    public Matter findById(@PathVariable String id){return  matterService.findById(id);}

    @PostMapping
    public Matter save(@RequestBody Matter matter){return matterService.save(matter);}

    @PutMapping("/{id}")
    public Matter update(@RequestBody Matter matter, @PathVariable String id){return matterService.update(matter);}

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable String id){
        return matterService.delete(findById(id));
    }

}
