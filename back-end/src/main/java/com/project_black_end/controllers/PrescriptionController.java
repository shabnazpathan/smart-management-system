package com.project_black_end.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prescriptions")
public class PrescriptionController {

    @PostMapping
    public ResponseEntity<?> savePrescription(
            @RequestHeader("Authorization") String token,
            @RequestBody String prescriptionJson) {

        if (!token.equals("VALID_TOKEN")) {
            return ResponseEntity.status(403).body("Unauthorized");
        }

        return ResponseEntity.ok("Prescription saved");
    }
}
