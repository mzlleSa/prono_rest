package fr.norsys.backend.dao.impl.match;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import fr.norsys.backend.entity.Match;

public class GetNotPlayedMatchTest extends AMatchDaoImplTest {

	@Test
	public void should_get_not_played_match() throws SQLException {

		List<Match> matchs = this.matchDao.getNotPlayedMatch();

		assertNotNull(matchs);
		assertTrue(matchs.size() > 0 );
	}
}
