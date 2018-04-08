package fr.norsys.backend.service.impl.utilisateur;

import static org.mockito.Mockito.mock;

import org.junit.Before;

import fr.norsys.backend.dao.IUtilisateurDao;
import fr.norsys.backend.entity.Utilisateur;
import fr.norsys.backend.service.impl.UtilisateurServiceImpl;

public abstract class AUtilisateurServiceImplTest {

	protected UtilisateurServiceImpl serviceUtilisateur;
	protected IUtilisateurDao utilisateurDao;
	protected Utilisateur user;

	@Before
	public void setUp() {
		this.utilisateurDao = mock(IUtilisateurDao.class);
		this.serviceUtilisateur = new UtilisateurServiceImpl();
		this.serviceUtilisateur.setDaoUtilisateur(utilisateurDao);
		this.user = this.setUser();
	}

	private Utilisateur setUser() {
		Utilisateur utilisateur = new Utilisateur("sez", "sez@gmail.com", "azerty");
		return utilisateur;
	}
}
