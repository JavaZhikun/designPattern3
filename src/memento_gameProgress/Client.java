package memento_gameProgress;

public class Client {
	
	public static void main(String[] args) {
		//��սbossǰ
		
		GameRole lixiaoyao = new GameRole();
		lixiaoyao.getInitState();
		lixiaoyao.stateDisplay();
		
		//�������
		RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
		stateAdmin.memento = lixiaoyao.saveState();
		
		//��սbossʱ���������
		lixiaoyao.fight();
		lixiaoyao.stateDisplay();
		
		//�ָ�֮ǰ״̬
		lixiaoyao.recoveryState(stateAdmin.memento);
		lixiaoyao.stateDisplay();
	}

}
