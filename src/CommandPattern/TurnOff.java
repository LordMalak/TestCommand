package CommandPattern;

public class TurnOff implements CommandInterface{

	//reference to the light

	Interruptor interruptor;

	public TurnOff(Interruptor interruptor){

		this.interruptor = interruptor;

	}

	public void execute(){

		interruptor.switchOff();

	}

}