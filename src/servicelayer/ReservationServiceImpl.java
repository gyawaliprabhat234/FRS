package servicelayer;

import java.util.List;

import model.Agent;
import model.Flight;
import model.Passenger;
import model.Reservation;
import repository.ReservationSystemRepository;

public class ReservationServiceImpl implements IReservationService {
	private ReservationSystemRepository repository;
	
	public ReservationServiceImpl(ReservationSystemRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Reservation> findReservationsByPassengerId(Integer passengerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Passenger> findPassengersByAgentCode(String agentCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation createReservation(Passenger passenger, List<Flight> flights) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation createReservation(Agent agent, Passenger passenger, List<Flight> flights) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void confirmReservation(String reservationCode) {
		// TODO Auto-generated method stub

	}

	@Override
	public void confirmReservation(String reservationCode, String agentCode) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancelReservation(String reservationCode) {
		// TODO Auto-generated method stub

	}

}
