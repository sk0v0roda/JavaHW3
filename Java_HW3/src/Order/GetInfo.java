package Order;
import Message.Message;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.UnreadableException;

public class GetInfo extends Behaviour {
    @Override
    public void action() {
        ACLMessage msg = myAgent.receive();
        if (msg != null) {
            try {
                Message message = (Message) msg.getContentObject();
                System.out.println(myAgent.getLocalName() + " received: " + message.content);
                ((OrderAgent) myAgent).setCustomerName(message.content);
            } catch (UnreadableException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public boolean done() {
        return false;
    }
}
