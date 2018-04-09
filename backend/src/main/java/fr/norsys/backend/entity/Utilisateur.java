package fr.norsys.backend.entity;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Utilisateur {

	private Long id;
	private String nom;
	private String prenom;
	private String email;
	private String identifiant;
	private String motDePasse;
	private String role;
	private int score;
	private Integer classement;
	private List<Pronostic> pronostics;

	public Utilisateur(String identifiant, String email, String motDePasse, String role) {
		this.identifiant = identifiant;
		this.email = email;
		this.motDePasse = motDePasse;
		this.role = role;
	}

	public Utilisateur(Long id, String nom, String prenom, String email, String identifiant, int score,
			Integer classement, String motDePasse, String role) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.identifiant = identifiant;
		this.score = score;
		this.classement = classement;
		this.motDePasse = motDePasse;
		this.role = role;
	}

}
