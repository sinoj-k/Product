package com.Product.Model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductModel {


    private Long id;

    @NotBlank(message = "Name is Required")
    private String name;

    @NotBlank(message = "Description is Required")
    private String description;

}
