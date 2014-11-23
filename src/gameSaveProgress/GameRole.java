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
	
	//攻击力
	public int attack;
	public int getAttack()
	{
		return attack;
	}
	
	public void setAttack(int attack)
	{
		this.attack = attack;
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
		System.out.println("攻击力：" + this.attack);
		System.out.println("防御力：" + this.def);
	}
	
	//获得初始状态
	public void getInitState()
	{
		this.vit = 100;
		this.attack = 100;
		this.def = 100;
	}
	
	//战斗
	public void fight()
	{
		this.vit = 0;
		this.attack = 0;
		this.def = 0;
	}
}
