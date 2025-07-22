package com.project_black_end.controllers;

import com.project_black_end.models.Doctor;
import com.project_black_end.services.DoctorService;
import com.project_black_end.services.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private TokenService tokenService;

    @GetMapping("/availability")
    public ResponseEntity<?> getAvailableDoctors(
            @RequestParam String specialization,
            @RequestParam String time,
            @RequestHeader("Authorization") String token) {

        if (!tokenService.validateToken(token)) {
            return ResponseEntity.status(401).body("Invalid token");
        }

        List<Doctor> doctors = doctorService.findAvailableDoctors(specialization, time);
        return ResponseEntity.ok(doctors);
    }
}
