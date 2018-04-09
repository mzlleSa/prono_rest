//package fr.norsys.backend.service.impl.utilisateur;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Matchers.any;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.sql.SQLException;
//
//import org.junit.Test;
//
//import fr.norsys.backend.entity.Utilisateur;
//
//public class AddUtilisateurTest extends AUtilisateurServiceImplTest {
//
//	@Test
//	public void should_add_user() throws SQLException {
//
//		when(this.utilisateurDao.add(any(Utilisateur.class))).thenReturn(1);
//		int add = this.serviceUtilisateur.add(new Utilisateur());
//
//		assertEquals(1, add);
//		verify(this.utilisateurDao, times(1)).add(any(Utilisateur.class));
//	}
//}
