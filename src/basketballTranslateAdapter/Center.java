package basketballTranslateAdapter;

public class Center extends Player
{
	public Center(String name)
	{
		super(name);
	}
	
	@Override
	public void attack() {
		System.out.println("ÖĞ·æ" + name +"½ø¹¥");
		
	}
	
	public void defence()
	{
		System.out.println("ÖĞ·æ" + name +"·ÀÊØ");
	}

}
