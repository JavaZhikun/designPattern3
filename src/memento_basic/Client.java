package memento_basic;

public class Client 
{
	public static void main(String[] args) {
		Originator o = new Originator();
		o.state = "On";
		o.show();
		
		Caretaker c = new Caretaker();
		c.memento = o.createMemento();
		
		o.state = "off";
		o.show();
		
		o.setMemento(c.memento);
		o.show();
	}

}
