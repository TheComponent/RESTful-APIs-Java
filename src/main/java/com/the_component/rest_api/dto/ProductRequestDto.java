package com.the_component.rest_api.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequestDto {
    @NotBlank(message = "Name cannot blank")
    private String name;

    private String description;

    @Min(value = 0, message = "Price cannot less than 0")
    private Double price;
}
