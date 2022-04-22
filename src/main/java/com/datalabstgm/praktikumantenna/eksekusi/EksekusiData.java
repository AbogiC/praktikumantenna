package com.datalabstgm.praktikumantenna.eksekusi;

import com.datalabstgm.praktikumantenna.model.dto.DTOpraktikum;
import com.datalabstgm.praktikumantenna.model.entity.EntityPraktikum;
import com.datalabstgm.praktikumantenna.repository.RepoPraktikum;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/praktikumantenna")
public class EksekusiData {
    private final RepoPraktikum repoPraktikum;
    public EksekusiData(RepoPraktikum repoPraktikum) {
        this.repoPraktikum = repoPraktikum;
    }

    public DTOpraktikum convertEntityToDto(EntityPraktikum entity){
        DTOpraktikum dto = new DTOpraktikum();
        dto.setNim(entity.getNim());
        dto.setNama(entity.getNama());
        dto.setNilai(entity.getNilai());
        return dto;
    }
    public EntityPraktikum convertDtoToEntity(DTOpraktikum dto){
        EntityPraktikum entity = new EntityPraktikum();
        entity.setNim(dto.getNim());
        entity.setNama(dto.getNama());
        entity.setNilai(dto.getNilai());
        return entity;
    }

    @GetMapping("/listdata")
    public List<DTOpraktikum> getListMahasiswa() {
        List<DTOpraktikum> list = new ArrayList<>();
        for (EntityPraktikum m : repoPraktikum.findAll()) {
            list.add(convertEntityToDto(m));
        }
        return list;
    }

    @PostMapping("/save")
    public DTOpraktikum savemahasiswa(@RequestBody DTOpraktikum dto){
        EntityPraktikum entity = convertDtoToEntity(dto);
        repoPraktikum.save(entity);
        return dto;
    }
}
