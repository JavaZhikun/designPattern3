package basketballTranslateAdapter;

public class Client 
{
	public static void main(String[] args) {
		Player b = new Forward("�͵ٶ�");
		b.attack();
		
		Player m = new Guards("��˸��׵�");
		m.attack();
		
		Player ym = new Translator("Ҧ��");
		ym.attack();
		ym.defence();
	}

}
