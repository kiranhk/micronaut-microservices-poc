package pl.altkom.asc.lab.micronaut.poc.product.service.api.v1.questions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ChoiceDto {
    private String code;
    private String label;
}
