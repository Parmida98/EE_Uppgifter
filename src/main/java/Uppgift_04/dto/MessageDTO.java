package Uppgift_04.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public record MessageDTO(
        Long id,

        @NotBlank(message = "Message text cannot be blank")
        @Size(max = 100, message = "Message text must be less than 100 characters")
        String message,

        LocalDateTime createdAt
) {}

/*
Syfte med DTO:
Separera databasen (domänmodellen) från API:t.
Underlättar validering av inkommande data.
Gör det enkelt att styra vilken information som skickas ut.
* */