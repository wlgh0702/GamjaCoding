package org.gamjacoding.gamjacoding.test;

import lombok.RequiredArgsConstructor;
import org.gamjacoding.gamjacoding.entity.Test;
import org.gamjacoding.gamjacoding.repository.TestRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    public TestRepository testRepository;

    @GetMapping("/get")
    public String getTest() {
        return "get TEST";
    }

    @PostMapping("/insertUser")
    public Test insertUser(@RequestBody Test test) {
        System.out.println(test);
        return testRepository.save(test);
    }
}
