package AgentController;
import Manager.ManagerAgent;
import jade.core.behaviours.OneShotBehaviour;

public class CreateManager extends OneShotBehaviour {
    @Override
    public void action() {
        ((Controller)myAgent).addAgent("Manager", ManagerAgent.class.getName());
    }
}
