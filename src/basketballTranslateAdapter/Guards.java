package basketballTranslateAdapter;

public class Guards extends Player
{
	public Guards(String name)
	{
		super(name);
	}
	
	@Override
	public void attack() {
		System.out.println("����" + name + "����");
		
	}

	public void defence()
	{
		System.out.println("����" + name + "����");
	}
}
