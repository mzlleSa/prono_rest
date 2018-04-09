package fr.norsys.backend.service.impl.match;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.Test;

import fr.norsys.backend.entity.Match;

public class UpdateMatchTest extends AMatchServiceImplTest {

	@Test
	public void should_update_match() throws SQLException {

		when(this.matchDao.update(any(Match.class))).thenReturn(1);
		int update = this.serviceMatch.update(new Match(1L));

		assertEquals(1, update);
		verify(this.matchDao, times(1)).update(any(Match.class));
	}
}
