package com.application.doctorsuggest.doctorsuggest.doctors;

import com.application.doctorsuggest.doctorsuggest.validator.Validator;
import org.apache.commons.lang3.EnumUtils;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class DoctorsServiceImpl implements DoctorsService {

    @Autowired
    private DoctorsRepository doctorsRepository;

    @Override
    public String createDoctor(DoctorsModel doctorsModel) {

        List<Specialization> enumList = EnumUtils.getEnumList(Specialization.class);

        for(Specialization specializations :enumList){
            Specialization enumName = (Specialization) EnumUtils.getEnum(Specialization.class,specializations.name());
            if(enumName.toString().equals(doctorsModel.getSpecialization())){
                Validator validator = new Validator();
                if(!validator.phoneNumberValidator(doctorsModel.getPhoneNumber())){
                  return doctorsModel.getPhoneNumber()+" telefon numarası uygun formatlarda değildir";
                }if(!validator.mailvalidator(doctorsModel.getMail())){
                    return doctorsModel.getMail()+" mail adresi uygun formatlarda değildir";
                }

                doctorsRepository.save(doctorsModel);
                return doctorsModel.getName()+" başarılı şekilde kaydedilmiştir!";
            }
        }
        return null;
    }

    @Override
    public DoctorsModel findDoctorById(ObjectId id) {
        return doctorsRepository.findBy_id(id);
    }

    @Override
    public String findAll() {
        return null;
    }

    @Override
    public String findDoctorByUsername(String username) {
        return null;
    }

    @Override
    public String deleteDoctorByModel(DoctorsModel doctorsModel) {
        try{
            doctorsRepository.delete(doctorsModel);
            return doctorsModel.get_id().toString()+" Başarıyla silinmiştir.";
        }catch (Exception e){
            return doctorsModel.get_id()+": Kullanıcı silme işlemi sırasında bir hata oluştu!";
        }
    }

    @Override
    public String updateDoctorById(ObjectId id) {
        return null;
    }
}
