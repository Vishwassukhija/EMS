package com.vishwas.EMS.Controller;

import com.vishwas.EMS.Entity.AssestEntity;
import com.vishwas.EMS.Model.AssesModel;
import com.vishwas.EMS.Service.AssestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assest")

public class AssestController {

    @Autowired
    public AssestService assestService;


    @PostMapping("/createassest")
    public AssestEntity createAssest(@RequestBody AssesModel assesModel){
        return this.assestService.createAssest(assesModel);
    }

    @GetMapping("/getassest")
    public List<AssestEntity> getassest(){
        return this.assestService.getassest();
    }


    @GetMapping("/getassest/{assestId}")
    public AssesModel getassestbyId(@PathVariable long assestId){
        return this.assestService.getassestbyId(assestId);
    }

}
