package basketballTranslateAdapter;

public class Translator extends Player
{
	private ForeignCenter wjzf = new ForeignCenter();
	
	public Translator(String name)
	{
		super(name);
		wjzf.name = name;
	}
	
	@Override
	public void attack() {
	    wjzf.����();
		
	}
	
	public void defence()
	{
		wjzf.����();
	}
	

}
