package com.project_black_end.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.util.List;

@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Doctor name is required")
    private String name;

    @NotBlank(message = "Speciality is required")
    private String speciality;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    @Column(unique = true)
    private String email;

    @NotBlank(message = "Phone number is required")
    @Column(unique = true)
    private String phone;

    @NotBlank(message = "Password is required")
    private String password;

    @ElementCollection
    private List<String> availableTimes;

    // Constructors
    public Doctor() {}

    public Doctor(String name, String speciality, String email, String phone, String password, List<String> availableTimes) {
        this.name = name;
        this.speciality = speciality;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.availableTimes = availableTimes;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpeciality() { return speciality; }
    public void setSpeciality(String speciality) { this.speciality = speciality; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public List<String> getAvailableTimes() { return availableTimes; }
    public void setAvailableTimes(List<String> availableTimes) { this.availableTimes = availableTimes; }
}
