package fr.norsys.backend.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Test {

	private Long id;
	private String nom;

	public Test(String nom) {
		this.nom = nom;
	}

	public Test(long id, String nom) {
		this.id = id;
		this.nom = nom;
	}
}
