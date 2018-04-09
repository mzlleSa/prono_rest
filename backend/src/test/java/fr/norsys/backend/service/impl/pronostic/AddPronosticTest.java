package fr.norsys.backend.service.impl.pronostic;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.timeout;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.Test;

import fr.norsys.backend.entity.Pronostic;

public class AddPronosticTest extends APronosticServiceImplTest {

	@Test
	public void should_add_pronostic() throws SQLException {

		Pronostic pronostic = new Pronostic(1L, 1L, 1L, 3);
		when(this.pronosticDao.add(pronostic)).thenReturn(1);
		int add = this.servicePronostic.add(pronostic);

		assertEquals(1, add);
		verify(this.pronosticDao, timeout(1)).add(pronostic);
	}
}
