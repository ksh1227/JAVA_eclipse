package Ex1015;

import javax.swing.JOptionPane;

public class test04 {

	public static void main(String[] args) {
		Command cmd = null;
		String msg = JOptionPane.showInputDialog("1.Delete  2.Update  3.조회...");
		
		if(msg.equals("1"))           cmd = new Delete();
		else if (msg.equals("2")) 	  cmd = new Update();
		else                          cmd = new Select();
		
		cmd.exce();
	}

}

class Command{
	public void exce() {
		System.out.println("DB 연동 준비...");
	}
}

class Delete extends Command{
	@Override
	public void exce() {
		super.exce();
		System.out.println("Delete......  수행...");
	}
}

class Update extends Command{
	@Override
	public void exce() {
		super.exce();
		System.out.println("Update......  수행...");
	}
}

class Select extends Command{
	@Override
	public void exce() {
		super.exce();
		System.out.println("Select(조회)......  수행...");
	}
}
