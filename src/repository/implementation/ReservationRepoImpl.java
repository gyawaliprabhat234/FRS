package repository.implementation;

import java.util.Hashtable;
import java.util.List;

import model.Agent;
import model.Passenger;
import model.Reservation;
import repository.interfaces.IReservationRepository;

public class ReservationRepoImpl implements IReservationRepository {
	private Hashtable<String, Reservation> reservations;
	
	ReservationRepoImpl(){
		reservations = new Hashtable<>();
	}
	@Override
	public boolean addReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Reservation> findReservationsByPassengerId(Passenger passenger) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> findReservationByAgent(Agent agent) {
		// TODO Auto-generated method stub
		return null;
	}

}
