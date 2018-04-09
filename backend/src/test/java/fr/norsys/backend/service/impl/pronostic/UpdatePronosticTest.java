//package fr.norsys.backend.service.impl.pronostic;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Matchers.any;
//import static org.mockito.Mockito.timeout;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.sql.SQLException;
//
//import org.junit.Test;
//
//import fr.norsys.backend.entity.Pronostic;
//
//public class UpdatePronosticTest extends APronosticServiceImplTest {
//
//	@Test
//	public void should_update_pronostic() throws SQLException {
//
//		when(this.pronosticDao.update(any(Pronostic.class))).thenReturn(1);
//		int update = this.servicePronostic.update(new Pronostic(1L, 1L, 1L, 3));
//
//		assertEquals(1, update);
//		verify(this.pronosticDao, timeout(1)).update(any(Pronostic.class));
//	}
//}
