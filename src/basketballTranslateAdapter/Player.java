package basketballTranslateAdapter;

public abstract class Player {
	
	public String name;
	public Player(String name)
	{
		this.name = name;
	}

	public abstract void attack();
	public abstract void defence();
}
