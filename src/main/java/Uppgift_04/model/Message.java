package Uppgift_04.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table("messages")
public record Message(

        @Id
        Long id,

        @NotBlank(message = "Message text cannot be blank")
        @Size(max = 100, message = "Message text must be less than 100 characters")
        @Column("message")
        String message,

        @Column("created_At")
        LocalDateTime createdAt,

       @Column("pinned")
        boolean pinned
) {}
