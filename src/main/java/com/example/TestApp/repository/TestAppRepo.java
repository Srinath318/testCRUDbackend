package com.example.TestApp.repository;

import com.example.TestApp.model.TestApp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestAppRepo extends JpaRepository<TestApp,Integer> {
}
