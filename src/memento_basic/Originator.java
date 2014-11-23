package memento_basic;


//·¢ÆğÈË
public class Originator 
{
	public String state;
	
	public String getState()
	{
		return state;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	public Memento createMemento()
	{
		return (new Memento(state));
	}
	
	public void setMemento(Memento memento)
	{
		state = memento.state;
	}
	
	public void show()
	{
		System.out.println("state=" + state);
	}

}
