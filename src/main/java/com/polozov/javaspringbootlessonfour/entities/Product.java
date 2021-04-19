package com.polozov.javaspringbootlessonfour.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Product {
	private Long id;
	private String name;
	private String description;
	private BigDecimal price;
}
