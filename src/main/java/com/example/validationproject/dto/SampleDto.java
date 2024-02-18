package com.example.validationproject.dto;

import com.example.validationproject.anotation.validation.NullOrNotBlank;
import com.example.validationproject.dto.validation_group.OnUpdate;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SampleDto {
    @NotNull(groups = OnUpdate.class, message = "Id must not be null for update group")
    private Long id;

    @Email(message = "Email must be a valid email address")
    private String email;

    @NotBlank(message = "Firstname must not be blank")
    @Size(min = 2, message = "Firstname length must be at least 2 characters")
    private String firstname;

    @NullOrNotBlank(message = "Lastname must be null or not blank")
    private String lastname;

    @NotNull(message = "Age must not be null")
    @Min(value = 18, message = "Age must be greater than or equal to 18")
    @Max(value = 70, message = "Age must be less than or equal to 70")
    private Integer age;

    @Null(message = "ForeverNull must be null")
    private String foreverNull;

    @Pattern(regexp = "^(?=.*!).{5,50}$", message = "Welcome message must be between 5 and 50 characters and contain at least one '!'")
    private String welcomeMessage;
}

