package basketballTranslateAdapter;

public class Center extends Player
{
	public Center(String name)
	{
		super(name);
	}
	
	@Override
	public void attack() {
		System.out.println("�з�" + name +"����");
		
	}
	
	public void defence()
	{
		System.out.println("�з�" + name +"����");
	}

}
