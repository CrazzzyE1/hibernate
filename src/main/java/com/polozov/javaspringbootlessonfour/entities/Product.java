package com.polozov.javaspringbootlessonfour.entities;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	@NonNull
	private String name;

	@Column
	@NonNull
	private String description;

	@Column
	@NonNull
	private BigDecimal price;
}
