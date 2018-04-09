package fr.norsys.backend.dao.impl.utilisateur;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;

import fr.norsys.backend.entity.Utilisateur;

public class AddUtilisateurTest extends AUtilisateurDaoImplTest {

	@Test
	public void should_add_user() throws SQLException {

		int add = this.utilisateurDao.add(new Utilisateur("sen", "aafrae"));

		assertEquals(1, add);
	}
}
