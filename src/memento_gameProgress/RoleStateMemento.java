package memento_gameProgress;

//½ÇÉ«×´Ì¬´æ´¢Ïä
public class RoleStateMemento 
{
	public int vit;//ÉúÃüÁ¦
	public int atk;//¹¥»÷Á¦
	public int def;//·ÀÓùÁ¦

	public RoleStateMemento(int vit, int atk, int def)
	{
		this.vit = vit;
		this.atk = atk;
		this.def = def;
	}
	
	//ÉúÃüÁ¦
	public int getVit()
	{
		return vit;
	}
	
	public void setVit(int vit)
	{
		this.vit = vit;
	}
	
	//¹¥»÷Á¦
	public int getAtk()
	{
		return atk;
	}
	
	public void setAtk(int atk)
	{
		this.atk = atk;
	}
	
	//·ÀÓùÁ¦
	public int getDef()
	{
		return def;
	}
	
	public void setDef(int def)
	{
		this.def = def;
	}
	
}
