package repository.implementation;

public class RepositoryFactory {
	
	private static DataCollection reservationSystemRepository = new DataCollection();
	
	public static DataCollection getDbObj() {
		return reservationSystemRepository;
	}
	

}
