package com.mateuszcholyn.monitoring.controller;


import com.mateuszcholyn.monitoring.service.DummyService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

@RestController
public class DummyController {

    private final DummyService dummyService;

    public DummyController(DummyService dummyService) {
        this.dummyService = dummyService;
    }

    @GetMapping("randomNumber/{bound}")
    public ResponseEntity<?> randomNumber(@PathVariable("bound") Integer bound) {

        return ResponseEntity.ok(dummyService.randomNumber(bound.toString()));
    }

}
