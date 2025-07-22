//Doctor
package com.project_black_end.services;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class DoctorServices {

    public List<String> getAvailableTimeSlots(Long doctorId, LocalDate date) {
        // mock implementation
        return List.of("10:00 AM", "11:00 AM", "03:00 PM");
    }

    public String validateLogin(String email, String password) {
        if (email.equals("doctor@example.com") && password.equals("password123")) {
            return "Login successful";
        } else {
            return "Invalid credentials";
        }
    }
}
