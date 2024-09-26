package com.vishwas.EMS.ServiceImp;

import com.fasterxml.jackson.annotation.OptBoolean;
import com.vishwas.EMS.Entity.AssestEntity;
import com.vishwas.EMS.Model.AssesModel;
import com.vishwas.EMS.Repositry.AssestRepo;
import com.vishwas.EMS.Service.AssestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AssestServiceImp implements AssestService {

    @Autowired
    public AssestRepo assestRepo;



    @Override
    public AssestEntity createAssest(AssesModel assesModel){

        AssestEntity assestEntity =new AssestEntity();

        assestEntity.setAssestId(assesModel.getAssestId());
        assestEntity.setAssestName(assesModel.getAssestName());
        assestEntity.setAssestBrand(assesModel.getAssestBrand());
        assestEntity.setAssestModel(assesModel.getAssestModel());
        assestEntity.setEmpId(assesModel.getEmpId());

        assestRepo.save(assestEntity);

        return assestEntity;
    }

    @Override
    public List<AssestEntity> getassest(){
        List<AssestEntity> getasset= new ArrayList<>();
        getasset = assestRepo.findAll();

        return getasset;
    }

    @Override
    public AssesModel getassestbyId(long assestId){
        Optional<AssestEntity> assestEntity = assestRepo.findById(assestId);

        AssesModel assesModel = new AssesModel();

        assesModel.setAssestId(assestEntity.get().getAssestId());
        assesModel.setAssestBrand(assestEntity.get().getAssestBrand());
        assesModel.setAssestModel(assestEntity.get().getAssestModel());
        assesModel.setEmpId(assestEntity.get().getEmpId());
        assesModel.setAssestName(assestEntity.get().getAssestName());


        return assesModel;
    }

}
