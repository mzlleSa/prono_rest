//package fr.norsys.backend.dao.impl.pronostic;
//
//import static org.junit.Assert.assertEquals;
//
//import java.sql.SQLException;
//
//import org.junit.Test;
//
//import fr.norsys.backend.entity.Pronostic;
//
//public class UpdatePronosticTest extends APronosticDaoImplTest {
//
//	@Test
//	public void should_update_pronostic() throws SQLException {
//
//		Pronostic pronostic = new Pronostic(1L, 1L, 1L, 10);
//		int update = this.pronosticDao.update(pronostic);
//
//		assertEquals(1, update);
//	}
//}
