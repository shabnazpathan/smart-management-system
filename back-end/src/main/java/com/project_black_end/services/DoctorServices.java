package com.project_black_end.services;

import com.project_black_end.models.Doctor;
import com.project_black_end.repo.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> findAvailableDoctors(String specialization, String time) {
        return doctorRepository.findBySpecializationAndAvailableTimesContaining(specialization, time);
    }

    public boolean validateLogin(String email, String password) {
        return doctorRepository.findByEmailAndPassword(email, password).isPresent();
    }
}
