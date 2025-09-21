package com.example.TestApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class TestApp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String testVar;

    public TestApp() {
    }

    public TestApp(int id, String testVar) {
        this.id = id;
        this.testVar = testVar;
    }


    public TestApp(String testVar) {
        this.testVar = testVar;
    }
}
