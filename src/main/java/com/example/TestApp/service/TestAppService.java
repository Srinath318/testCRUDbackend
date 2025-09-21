package com.example.TestApp.service;

import com.example.TestApp.model.TestApp;
import com.example.TestApp.repository.TestAppRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestAppService {

    @Autowired
    TestAppRepo testAppRepo;

    public List<TestApp> allDataService() {
        return testAppRepo.findAll();
    }

    public void postDataService(String testVar) {
        TestApp testApp = new TestApp(testVar);
        testAppRepo.save(testApp);
    }

    public void updateDataService(int id, String testVar) {
        TestApp t = testAppRepo.findById(id).orElse(null);

        if(t != null){
            t.setTestVar(testVar);
            testAppRepo.save(t);
        }
    }

    public void deleteDataService(int id) {
        testAppRepo.deleteById(id);
    }

    public void clearDataService() {
        testAppRepo.deleteAll();
    }
}
