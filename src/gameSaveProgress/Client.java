package gameSaveProgress;

public class Client {
	public static void main(String[] args) {
		GameRole lixiaoyao = new GameRole();
		lixiaoyao.getInitState();
		lixiaoyao.stateDisplay();
		
		//�������
		GameRole backup = new GameRole();
		backup.vit = lixiaoyao.vit;
		backup.attack = lixiaoyao.attack;
		backup.def = lixiaoyao.def;
		
		//��սbossʱ���������
		lixiaoyao.fight();
		lixiaoyao.stateDisplay();
		
		//�ָ�֮ǰ��״̬
		lixiaoyao.vit = backup.vit;
		lixiaoyao.attack = backup.attack;
		lixiaoyao.def = backup.def;
		
		lixiaoyao.stateDisplay();
	}

}
