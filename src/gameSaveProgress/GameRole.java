package gameSaveProgress;

public class GameRole 
{
	public int vit;
	public int getVitality()
	{
		return vit;
	}
	
	public void setVitality(int vit)
	{
		this.vit = vit;
	}
	
	//������
	public int attack;
	public int getAttack()
	{
		return attack;
	}
	
	public void setAttack(int attack)
	{
		this.attack = attack;
	}

	//������
	public int def;
	public int getDef()
	{
		return def;
	}
	
	public void setDef(int def)
	{
		this.def = def;
	}
	
	//״̬��ʾ
	public void stateDisplay()
	{
		System.out.println("��ɫ��ǰ״̬");
		System.out.println("����:" + this.vit);
		System.out.println("��������" + this.attack);
		System.out.println("��������" + this.def);
	}
	
	//��ó�ʼ״̬
	public void getInitState()
	{
		this.vit = 100;
		this.attack = 100;
		this.def = 100;
	}
	
	//ս��
	public void fight()
	{
		this.vit = 0;
		this.attack = 0;
		this.def = 0;
	}
}
