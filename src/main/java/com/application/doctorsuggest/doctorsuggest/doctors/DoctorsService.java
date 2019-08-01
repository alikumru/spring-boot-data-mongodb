package com.application.doctorsuggest.doctorsuggest.doctors;

import org.bson.types.ObjectId;

public interface DoctorsService {

    public String createDoctor(DoctorsModel doctorsModel);

    public DoctorsModel findDoctorById(ObjectId objectId);

    public String findAll();

    public String findDoctorByUsername(String username);

    public String deleteDoctorByModel(DoctorsModel DoctorsModel);

    public String updateDoctorById(ObjectId id);
}
