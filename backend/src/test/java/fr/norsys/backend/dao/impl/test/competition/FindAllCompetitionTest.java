package fr.norsys.backend.dao.impl.competition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import fr.norsys.backend.entity.Competition;

public class FindAllCompetitionTest extends ACompetitionDaoImplTest {

	@Test
	public void should_find_all_competition() throws SQLException {

		List<Competition> competitions = this.competitionDao.findAll();

		assertNotNull(competitions);
		assertTrue(competitions.size() > 0);
		assertEquals("coupe du monde", competitions.get(0).getIdentifiant());
	}
}
