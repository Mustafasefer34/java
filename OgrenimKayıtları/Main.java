package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		TarimKrediManager tarimKrediManager = new TarimKrediManager();
		KrediUI krediUI = new KrediUI();
		
		krediUI.hesapla(tarimKrediManager);

	}

}
