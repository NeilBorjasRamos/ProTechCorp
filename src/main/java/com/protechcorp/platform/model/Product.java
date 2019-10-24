package com.protechcorp.platform.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "Name cannot be empty")
	@Column(name = "name", nullable = false, length = 50)
	private String name;

	@Size(min = 10, max = 10)
	@NotEmpty(message = "LPN cannot be empty")
	@Column(name = "LPN", nullable = false, length = 10)
	private String LPN;

	@NotEmpty(message = "Brand cannot be empty")
	@Column(name = "brand")
	private String brand;

	@DecimalMin("1.00")
	@Column(name = "price", columnDefinition = "Decimal(8,2)", nullable = false)
	private Double price;

	@Column(name = "quantity", nullable = false)
	private int quantity;

	@NotEmpty(message = "Description cannot be empty")
	@Column(name = "description", nullable = false, length = 50)
	private String description;

	

}
