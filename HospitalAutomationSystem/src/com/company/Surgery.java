package com.company;

import java.util.List;

public class Surgery {
    List<Doctor> doctors;
    List<Nurse> nurses;
    List<Material> materials;

    public Surgery(List<Doctor> doctors, List<Nurse> nurses, List<Material> materials) {
        if (doctors.stream().anyMatch(d -> d.isSurgeon)) {
            this.doctors = doctors;
        } else {
            throw new IllegalArgumentException("Ameliyat için en az bir operatör doktor gerekli.");
        }
        if (nurses.size() <= 5) {
            this.nurses = nurses;
        } else {
            throw new IllegalArgumentException("En fazla 5 hemşire ameliyata girebilir.");
        }
        this.materials = materials;
    }

    public double calculateCost() {
        double materialCost = materials.stream().mapToDouble(Material::getTotalCost).sum();
        double doctorCost = doctors.stream().mapToDouble(d -> d.fee).sum();
        return materialCost + doctorCost;
    }
}