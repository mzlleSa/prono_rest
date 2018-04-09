package fr.norsys.backend.dao.impl.utilisateur;

import org.junit.Before;

import fr.norsys.backend.config.AppConfiguration;
import fr.norsys.backend.dao.IUtilisateurDao;
import fr.norsys.backend.dao.impl.UtilisateurDaoImpl;

public abstract class AUtilisateurDaoImplTest {

	IUtilisateurDao utilisateurDao;

	@Before
	public void setUp() {
		AppConfiguration app = new AppConfiguration();
		this.utilisateurDao = new UtilisateurDaoImpl(app.getDataSource());
	}
}
