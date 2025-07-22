# MySQL Schema Design

## Tables

### 1. Doctor
- id (PK, INT, AUTO_INCREMENT)
- name (VARCHAR)
- specialization (VARCHAR)

### 2. Patient
- id (PK, INT, AUTO_INCREMENT)
- name (VARCHAR)
- email (VARCHAR, UNIQUE)
- phoneNumber (VARCHAR, UNIQUE)
- password (VARCHAR)

### 3. Appointment
- id (PK, INT)
- doctor_id (FK → Doctor.id)
- patient_id (FK → Patient.id)
- appointmentTime (DATETIME)

### 4. Prescription
- id (PK, INT)
- doctor_id (FK → Doctor.id)
- patient_id (FK → Patient.id)
- text (TEXT)
