package CommandPattern;

public class Client{

	public static void main(String[] args)    {

		RemoteControl control = new RemoteControl();

		Interruptor interruptor = new Interruptor();

	    CommandInterface interruptorOn = new TurnOn(interruptor);
	
	    CommandInterface interruptorOff = new TurnOff(interruptor);
	
	
	    control.setCommand(interruptorOn);
	
	    control.pressButton();
	
	    control.setCommand(interruptorOff);
	
	    control.pressButton();
	
	}

}