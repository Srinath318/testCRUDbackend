package com.example.TestApp.controller;

import com.example.TestApp.model.TestApp;
import com.example.TestApp.service.TestAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://test-crud-app.netlify.app/")
public class TestAppController {

    @Autowired
    TestAppService testAppService;

    @GetMapping("/all")
    public List<TestApp> allData(){
        return testAppService.allDataService();
    }

    @PostMapping("/post")
    public String postData(@RequestParam("testVar") String testVar){
        testAppService.postDataService(testVar);
        return "Added successfully";
    }

    @PutMapping("/update/{id}")
    public String updateData(@PathVariable int id,
                             @RequestParam("testVar") String testVar){
        testAppService.updateDataService(id,testVar);
        return "Updated successfully";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteData(@PathVariable int id){
        testAppService.deleteDataService(id);
        return "Deleted id "+id;
    }

    @DeleteMapping("/clear")
    public String clearData(){
        testAppService.clearDataService();
        return "Cleared data";
    }

}
