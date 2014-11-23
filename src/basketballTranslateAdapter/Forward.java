package basketballTranslateAdapter;

public class Forward extends Player
{
	public Forward(String name)
	{
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("Ç°·æ" + name + "½ø¹¥");
		
	}
	
	@Override
	public void defence() {
		System.out.println("Ç°·æ" + name + "·ÀÊØ");
		
	}
}
