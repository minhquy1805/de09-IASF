package com.aptech.de09.dtos.requests;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.bind.Name;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NewEmployeeRequest {
    @NotBlank(message = "Name is required")
    @Length(message ="dasdasda")
    private String name;

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;
}
