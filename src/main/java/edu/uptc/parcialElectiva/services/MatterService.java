package edu.uptc.parcialElectiva.services;


import edu.uptc.parcialElectiva.entities.Matter;
import edu.uptc.parcialElectiva.repositories.MatterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MatterService {
    private MatterRepository matterRepository;

    public MatterService(MatterRepository matterRepository) {
        this.matterRepository = matterRepository;
    }
    public List<Matter> getMatters(){return matterRepository.findAll();}

    public Matter save(Matter matter){return matterRepository.save(matter);}

    public Matter findById(String code){
        Optional<Matter> optional = matterRepository.findById(code);
        return optional.isPresent() ? optional.get() : null;
    }

    public Matter update(Matter matter){return  (findById(matter.getCode())!=null) ? matterRepository.save(matter) : null;
    }

    public boolean delete(Matter matter){
        if (matter != null) {
            matterRepository.delete(matter);
        }
        return false;
    }
}
