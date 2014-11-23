package basketballTranslateAdapter;

public class Guards extends Player
{
	public Guards(String name)
	{
		super(name);
	}
	
	@Override
	public void attack() {
		System.out.println("ºóÎÀ" + name + "½ø¹¥");
		
	}

	public void defence()
	{
		System.out.println("ºóÎÀ" + name + "·ÀÊØ");
	}
}
