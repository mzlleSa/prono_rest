package fr.norsys.backend.dao.impl.match;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Optional;

import org.junit.Test;

import fr.norsys.backend.entity.Match;

public class UpdateMatchTest extends AMatchDaoImplTest {

	@Test
	public void should_update_match() throws ParseException, SQLException {

		Match match = new Match(48L, "match 48", "poule", Timestamp.valueOf("2018-10-10 16:40:00"), false, 1);
		int update = this.matchDao.update(match);
		Optional<Match> matchRecuperer = this.matchDao.getById(match.getId());

		assertEquals(1, update);
		assertFalse(matchRecuperer.get().isEstJouer());
	}
}
