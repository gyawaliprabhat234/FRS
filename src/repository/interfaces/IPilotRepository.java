package repository.interfaces;

import java.util.List;

import model.Pilot;

public interface IPilotRepository {
	
	boolean addPilot(Pilot pilot);

	boolean removePilot(Pilot pilot);

	boolean updatePilot(Pilot pilot);
	
	List<Pilot> getAllPilots();
}
