package fr.norsys.backend.dao.impl.pronostic;

import org.junit.Before;

import fr.norsys.backend.config.AppConfiguration;
import fr.norsys.backend.dao.IPronosticDao;
import fr.norsys.backend.dao.impl.PronosticDaoImpl;

public abstract class APronosticDaoImplTest {

	protected IPronosticDao pronosticDao;

	@Before
	public void setUp() {
		AppConfiguration app = new AppConfiguration();
		this.pronosticDao = new PronosticDaoImpl(app.getDataSource());
	}
}
