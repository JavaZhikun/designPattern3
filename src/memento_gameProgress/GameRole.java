package memento_gameProgress;

//��Ϸ��ɫ��
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
	public int atk;
	public int getAtk()
	{
		return atk;
	}
	
	public void setAttack(int atk)
	{
		this.atk = atk;
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
		System.out.println("��������" + this.atk);
		System.out.println("��������" + this.def);
	}
	
	//��ó�ʼ״̬
	public void getInitState()
	{
		this.vit = 100;
		this.atk = 100;
		this.def = 100;
	}
	
	public void fight()
	{
		this.vit = 0;
		this.atk = 0;
		this.def = 0;
	}
	
	//�����ɫ״̬
	public RoleStateMemento saveState()
	{
		return (new RoleStateMemento(vit, atk, def));
	}
	
	//�ָ���ɫ״̬
	public void recoveryState(RoleStateMemento memento)
	{
		this.vit = memento.vit;
		this.atk = memento.atk;
		this.def = memento.def;
	}

}
