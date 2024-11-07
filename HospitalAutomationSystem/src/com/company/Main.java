package com.company;


import java.util.Arrays;
import java.util.List;

// Kullanım örneği
class HospitalAutomation {
    public static void main(String[] args) {
        // Hastane, doktorlar, hemşireler, hastalar ve ameliyat verilerinin tanımlanması
        Hospital hospital = new Hospital();

        // Doktor ve hemşire ekleme
        Doctor doc1 = new Doctor("Dr. Ali", 1, true, 1500.0);
        Doctor doc2 = new Doctor("Dr. Veli", 2, false, 1000.0);
        Nurse nurse1 = new Nurse("Nurse Ayşe", 101);
        hospital.doctors.add(doc1);
        hospital.doctors.add(doc2);
        hospital.nurses.add(nurse1);

        // Hasta ekleme ve muayene
        Patient patient1 = new Patient("Patient Ahmet", 201);
        patient1.addExam();
        patient1.addExam();
        hospital.patients.add(patient1);

        // Ameliyat malzemeleri ve maliyet hesaplama
        Material material1 = new Material("Gauze", 10, 5.0);
        Material material2 = new Material("Scalpel", 1, 50.0);
        List<Material> materials = Arrays.asList(material1, material2);

        Surgery surgery = new Surgery(Arrays.asList(doc1), Arrays.asList(nurse1), materials);
        hospital.surgeries.add(surgery);

        // En çok muayene olan hasta
        Patient mostExaminedPatient = hospital.getMostExaminedPatient();
        System.out.println("Bir yılda en çok muayene olan hasta: " + (mostExaminedPatient != null ? mostExaminedPatient.name : "Yok"));

        // En yüksek ameliyat maliyeti
        double maxSurgeryCost = hospital.getMaxSurgeryCost();
        System.out.println("Bir ameliyatta oluşan en yüksek maliyet: " + maxSurgeryCost);
    }
}