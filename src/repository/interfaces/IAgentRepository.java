package repository.interfaces;

import java.util.List;

import model.Agent;
import model.Ticket;

public interface IAgentRepository {
	boolean addAgent(Agent agent);

	boolean removeAgent(Agent agent);

	List<Agent> getAllAgents();
	Agent getAgentByCode(String code);

}
