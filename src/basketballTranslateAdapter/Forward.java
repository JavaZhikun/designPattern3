package basketballTranslateAdapter;

public class Forward extends Player
{
	public Forward(String name)
	{
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("ǰ��" + name + "����");
		
	}
	
	@Override
	public void defence() {
		System.out.println("ǰ��" + name + "����");
		
	}
}
