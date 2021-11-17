package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.beerstock.enums.BeerType;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Beer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true)
	private String name;

	// marca da cerveja
	@Column(nullable = false)
	private String brand;

	@Column(nullable = false)
	private int max;

	// Quantidade que vai comprar
	@Column(nullable = false)
	private int quantity;

	// tipo da cerveja
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private BeerType type;

}