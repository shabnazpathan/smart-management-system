package com.project_black_end.services;

import com.project_black_end.models.Appointment;
import com.project_black_end.models.Doctor;
import com.project_black_end.repo.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public Appointment bookAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public List<Appointment> getAppointmentsForDoctorOnDate(Doctor doctor, LocalDate date) {
        return appointmentRepository.findByDoctorAndAppointmentTimeBetween(
            doctor,
            date.atStartOfDay(),
            date.plusDays(1).atStartOfDay()
        );
    }
}
