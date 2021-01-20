package repository.implementation;

import java.util.Hashtable;
import java.util.List;

import model.Pilot;
import repository.interfaces.IPilotRepository;

public class PilotRepoImpl implements IPilotRepository {
	private Hashtable<String, Pilot> pilots;
	PilotRepoImpl(){
		pilots = new Hashtable<>();
	}
	@Override
	public boolean addPilot(Pilot pilot) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removePilot(Pilot pilot) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePilot(Pilot pilot) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Pilot> getAllPilots() {
		// TODO Auto-generated method stub
		return null;
	}

}
