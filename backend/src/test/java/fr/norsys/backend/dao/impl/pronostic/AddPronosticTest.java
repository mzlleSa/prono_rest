package fr.norsys.backend.dao.impl.pronostic;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;

import fr.norsys.backend.entity.Pronostic;

public class AddPronosticTest extends APronosticDaoImplTest {

	@Test
	public void should_add_pronostic() throws SQLException {

		Pronostic pronostic = new Pronostic(1L, 24L, 36L, 99);
		int add = this.pronosticDao.add(pronostic);

		assertEquals(1, add);
	}

}
