package fr.norsys.backend.dao.impl.utilisateur;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.Optional;

import org.junit.Test;

import fr.norsys.backend.entity.Utilisateur;

public class FindUtilisateurByIdentifiantMotDePasseTest extends AUtilisateurDaoImplTest {

	@Test
	public void should_find_by_identifiant_and_password() throws SQLException {

		Optional<Utilisateur> utilisateur = this.utilisateurDao.findByIdentifiantMotDePasse("test", "azerty");

		assertNotNull(utilisateur);
		assertEquals("testEmail@gmail.com", utilisateur.get().getEmail());
		assertEquals("azerty", utilisateur.get().getMotDePasse());
		assertEquals("test", utilisateur.get().getIdentifiant());
	}
}
