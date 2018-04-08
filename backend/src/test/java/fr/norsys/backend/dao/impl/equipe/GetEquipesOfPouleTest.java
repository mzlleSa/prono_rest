package fr.norsys.backend.dao.impl.equipe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

public class GetEquipesOfPouleTest extends AEquipeDaoImplTest {

	@Test
	public void should_get_equipes_when_competition_1_poule_1() throws SQLException {

		List<fr.norsys.backend.entity.Equipe> equipes = this.equipeDao.getEquipesOfPoule(1L, 1);

		assertNotNull(equipes);
		assertTrue(equipes.size() == 4);
		assertEquals("Bresil", equipes.get(0).getIdentifiant());
		assertEquals("Mexique", equipes.get(1).getIdentifiant());
		assertEquals("Croatie", equipes.get(2).getIdentifiant());
		assertEquals("Cameroun", equipes.get(3).getIdentifiant());
	}
}
