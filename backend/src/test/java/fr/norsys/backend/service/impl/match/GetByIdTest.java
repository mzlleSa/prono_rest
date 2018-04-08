package fr.norsys.backend.service.impl.match;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.util.Optional;

import org.junit.Test;

import fr.norsys.backend.entity.Match;

public class GetByIdTest extends AMatchServiceImplTest {

	@Test
	public void should_get_match_when_id_1() throws SQLException {

		when(this.matchDao.getById(1L)).thenReturn(Optional.of(new Match(1L)));
		Optional<Match> match = this.serviceMatch.getById(1L);

		assertNotNull(match);
		assertEquals(1, match.get().getId().intValue());
		verify(this.matchDao, times(1)).getById(1L);
	}
}