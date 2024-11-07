package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hospital {
    List<Doctor> doctors = new ArrayList<>();
    List<Nurse> nurses = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();
    List<Surgery> surgeries = new ArrayList<>();

    public Patient getMostExaminedPatient() {
        return patients.stream()
                .max(Comparator.comparingInt(p -> p.monthlyExamCount))
                .orElse(null);
    }

    public double getMaxSurgeryCost() {
        return surgeries.stream()
                .mapToDouble(Surgery::calculateCost)
                .max()
                .orElse(0.0);
    }
}