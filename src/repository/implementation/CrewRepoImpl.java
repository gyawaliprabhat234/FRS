package repository.implementation;

import java.util.Hashtable;
import java.util.List;

import model.Crew;
import model.FlightInstance;
import repository.interfaces.ICrewRepository;

public class CrewRepoImpl implements ICrewRepository {
	private Hashtable<String, Crew> crews;

	CrewRepoImpl(){
		 crews = new Hashtable<>();
	}
	@Override
	public boolean addCrew(Crew crew) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeCrew(Crew crew) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCrew(Crew crew) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Crew> getAllCrews() {
		// TODO Auto-generated method stub
		return null;
	}


}
