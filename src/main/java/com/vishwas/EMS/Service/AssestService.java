package com.vishwas.EMS.Service;


import com.vishwas.EMS.Entity.AssestEntity;
import com.vishwas.EMS.Model.AssesModel;

import java.util.List;

public interface AssestService {


    public AssestEntity createAssest(AssesModel assesModel);


    public List<AssestEntity> getassest();

    public AssesModel getassestbyId(long assestId);

}
