package memento_gameProgress;

//游戏角色类
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
	
	//攻击力
	public int atk;
	public int getAtk()
	{
		return atk;
	}
	
	public void setAttack(int atk)
	{
		this.atk = atk;
	}

	//防御力
	public int def;
	public int getDef()
	{
		return def;
	}
	
	public void setDef(int def)
	{
		this.def = def;
	}
	
	//状态显示
	public void stateDisplay()
	{
		System.out.println("角色当前状态");
		System.out.println("体力:" + this.vit);
		System.out.println("攻击力：" + this.atk);
		System.out.println("防御力：" + this.def);
	}
	
	//获得初始状态
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
	
	//保存角色状态
	public RoleStateMemento saveState()
	{
		return (new RoleStateMemento(vit, atk, def));
	}
	
	//恢复角色状态
	public void recoveryState(RoleStateMemento memento)
	{
		this.vit = memento.vit;
		this.atk = memento.atk;
		this.def = memento.def;
	}

}
