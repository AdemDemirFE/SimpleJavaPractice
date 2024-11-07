package com.company;

public // Hasta sınıfı
class Patient {
    String name;
    int id;
    int yearlySurgeryCount = 0;
    int monthlyExamCount = 0;

    public Patient(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void addExam() {
        if (monthlyExamCount < 3) {
            monthlyExamCount++;
        }
    }

    public void addSurgery() {
        if (yearlySurgeryCount < 1) {
            yearlySurgeryCount++;
        }
    }
}