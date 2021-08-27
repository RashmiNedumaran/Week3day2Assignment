package Week3Day2Assignments;

public class Desktop extends PersonalComputer{

	public void hardwareResource() {
		// TODO Auto-generated method stub
		System.out.println("CPU");
		
	}

	public void sofwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Windows");
	}

	@Override
	public void toassemble() {
		// TODO Auto-generated method stub
		System.out.println("Assembling");
		
	}
	
	public void PcModels() {
		System.out.println("models of pc");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop obj = new Desktop();
		obj.hardwareResource();
		obj.PcModels();
		obj.sofwareResources();
		obj.toassemble();
		obj.todisplaypc();
		obj.PcModels();
	}

}
