package gameSaveProgress;

public class Client {
	public static void main(String[] args) {
		GameRole lixiaoyao = new GameRole();
		lixiaoyao.getInitState();
		lixiaoyao.stateDisplay();
		
		//保存进度
		GameRole backup = new GameRole();
		backup.vit = lixiaoyao.vit;
		backup.attack = lixiaoyao.attack;
		backup.def = lixiaoyao.def;
		
		//大战boss时，损耗严重
		lixiaoyao.fight();
		lixiaoyao.stateDisplay();
		
		//恢复之前的状态
		lixiaoyao.vit = backup.vit;
		lixiaoyao.attack = backup.attack;
		lixiaoyao.def = backup.def;
		
		lixiaoyao.stateDisplay();
	}

}
