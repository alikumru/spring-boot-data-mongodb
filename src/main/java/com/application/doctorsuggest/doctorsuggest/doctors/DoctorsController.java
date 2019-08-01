package com.application.doctorsuggest.doctorsuggest.doctors;

import org.bson.types.ObjectId;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/doctors")
public class DoctorsController {

    @Autowired
    private DoctorsServiceImpl doctorsServiceImpl;
    @Autowired
    private DoctorsRepository doctorsRepository;

    @PostMapping(value = "/createDoctor")
    public String createDoctor(@RequestBody DoctorsModel doctorsModel) throws JSONException {

        JSONObject result = new JSONObject();
        try{
                //result.put("result",doctorsRepository.save(doctorsModel));
            return doctorsServiceImpl.createDoctor(doctorsModel);

        }catch (Exception e){
            result.put("result",e.getMessage());
        }
        return result.toString();
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public String getAllDoctors() {

       // return doctorsRepository.findAll();
        return doctorsServiceImpl.findAll();
    }

    @RequestMapping(value = "/getDoctorById/{id}", method = RequestMethod.GET)
    public DoctorsModel getDoctorById(@PathVariable ObjectId id) {
        //DoctorsModel doctor = doctorsRepository.findBy_id(id);
        //System.out.println(doctor.get_id());
        //return doctorsRepository.findBy_id(id);
        return doctorsServiceImpl.findDoctorById(id);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public String deleteDoctor(@PathVariable ObjectId id) {
        //doctorsRepository.delete(doctorsRepository.findBy_id(id));
//        DoctorsModel model = doctorsServiceImpl.findDoctorById(id);
//        System.out.println(model);
//        doctorsServiceImpl.deleteDoctorById(model);
        return doctorsServiceImpl.deleteDoctorByModel(doctorsServiceImpl.findDoctorById(id));
    }
}
