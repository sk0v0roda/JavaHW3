package AgentController;
import Customer.CustomerAgent;
import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

public class CreateCustomer extends TickerBehaviour {

    int customer_id = 1;
    public CreateCustomer(Agent a, long period) {
        super(a, period);
    }

    @Override
    protected void onTick() {
        ((Controller)myAgent).addAgent("Customer" + customer_id, CustomerAgent.class.getName());
        ++customer_id;
    }
}
