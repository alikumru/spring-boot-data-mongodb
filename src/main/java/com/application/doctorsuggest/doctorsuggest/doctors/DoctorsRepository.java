package com.application.doctorsuggest.doctorsuggest.doctors;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DoctorsRepository  extends MongoRepository<DoctorsModel,String> {
    DoctorsModel findBy_id(ObjectId _id);
}

