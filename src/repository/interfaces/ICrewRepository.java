package repository.interfaces;

import java.util.List;

import model.Crew;
import model.FlightInstance;

public interface ICrewRepository {
	boolean addCrew(Crew crew);

	boolean removeCrew(Crew crew);

	boolean updateCrew(Crew crew);
	
	List<Crew> getAllCrews();
	
}
