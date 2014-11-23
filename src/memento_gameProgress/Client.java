package memento_gameProgress;

public class Client {
	
	public static void main(String[] args) {
		//大战boss前
		
		GameRole lixiaoyao = new GameRole();
		lixiaoyao.getInitState();
		lixiaoyao.stateDisplay();
		
		//保存进度
		RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
		stateAdmin.memento = lixiaoyao.saveState();
		
		//大战boss时，损耗严重
		lixiaoyao.fight();
		lixiaoyao.stateDisplay();
		
		//恢复之前状态
		lixiaoyao.recoveryState(stateAdmin.memento);
		lixiaoyao.stateDisplay();
	}

}
