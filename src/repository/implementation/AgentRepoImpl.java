package repository.implementation;

import java.util.Hashtable;
import java.util.List;
import model.Agent;
import model.Airline;
import repository.interfaces.IAgentRepository;

public class AgentRepoImpl implements IAgentRepository{
	private Hashtable<String, Agent> agents;
	AgentRepoImpl(){
		agents = new Hashtable<>();
	}
	@Override
	public boolean addAgent(Agent agent) {
		return this.agents.put(agent.getId(), agent) != null;
	}

	@Override
	public boolean removeAgent(Agent agent) {
		return this.agents.remove(agent.getId()) != null;
	}

	@Override
	public List<Agent> getAllAgents() {
		return List.copyOf(agents.values());
	}

	@Override
	public Agent getAgentByCode(String code) {
		return agents.get(code);
	}
	
}
