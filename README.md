# Smart Clinic MySQL Schema

## Tables

### 1. Patient
- id (INT, PK)
- name (VARCHAR)
- email (VARCHAR, UNIQUE)
- phone (VARCHAR, UNIQUE)
- password (VARCHAR)

### 2. Doctor
- id (INT, PK)
- name (VARCHAR)
- specialization (VARCHAR)
- available_times (TEXT)

### 3. Appointment
- id (INT, PK)
- doctor_id (FK -> Doctor)
- patient_id (FK -> Patient)
- appointment_time (DATETIME)

### 4. Prescription
- id (INT, PK)
- appointment_id (FK -> Appointment)
- doctor_notes (TEXT)
