package CommandPattern;

public class TurnOn implements CommandInterface{
	  //reference to the light

	  Interruptor interruptor;

	  public TurnOn(Interruptor interruptor){

		  this.interruptor = interruptor;

	  }

	  public void execute(){

		  interruptor.switchOn();

	  }
}
