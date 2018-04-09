//package fr.norsys.backend.service.impl.competition;
//
//import static org.mockito.Mockito.mock;
//
//import org.junit.Before;
//
//import fr.norsys.backend.dao.ICompetitionDao;
//import fr.norsys.backend.service.impl.CompetitionServiceImpl;
//
//public abstract class ACompetitionServiceImplTest {
//
//	protected CompetitionServiceImpl serviceCompetition;
//	protected ICompetitionDao competitionDao;
//
//	@Before
//	public void setUp() {
//		this.competitionDao = mock(ICompetitionDao.class);
//		this.serviceCompetition = new CompetitionServiceImpl();
//		this.serviceCompetition.setDaoCompetition(this.competitionDao);
//	}
//}
