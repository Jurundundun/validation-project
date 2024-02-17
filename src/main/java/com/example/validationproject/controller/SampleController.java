package com.example.validationproject.controller;

import com.example.validationproject.dto.SampleDto;
import com.example.validationproject.dto.validationGoup.OnUpdate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/sample")
@Validated
public class SampleController {

    @PostMapping()
    public String createResource(@Validated @RequestBody SampleDto sampleDto) {
        return "Ok";
    }

    @PutMapping()

    public String updateResource(@Validated(OnUpdate.class) @RequestBody SampleDto sampleDto) {
        return "Ok";
    }
}