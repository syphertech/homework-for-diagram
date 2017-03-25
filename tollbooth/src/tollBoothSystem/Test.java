package tollBoothSystem;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TollBooth booth = new AlleghenyTollBooth();
		TollBooth boothEasy = new DelawareEazyPassTollBooth();
		Truck nissan = new BenzeTruck(3, 12000); // 5 axles and 12000 kilograms
		Truck ford = new FordTruck(2, 5000); // 2 axles and 5000kg
		Truck daewoo = new BenzeTruck(6, 17000); // ….
		
		try {
			booth.calCulateToll(ford);
		} catch (tollBoothSystem.InvalidVehicleParameterException e) {	
			System.out.println(e);
		}
		try {
			booth.calCulateToll(nissan);
		} catch (tollBoothSystem.InvalidVehicleParameterException e) {	
			System.out.println(e);
		}
		try {
			boothEasy.calCulateToll(ford);
		} catch (tollBoothSystem.InvalidVehicleParameterException e) {
			System.out.println(e);
			
		}
		booth.displayData();
		boothEasy.displayData();
		try {
			boothEasy.calCulateToll(nissan);
		} catch (tollBoothSystem.InvalidVehicleParameterException e) {
			System.out.println(e);
		}
		
		//checking types of objects created
		if (ford instanceof FordTruck){
		System.out.println("ford is a FordTruck\n");}
		else {
			System.out.println("unkown type");
		}
		if (nissan instanceof BenzeTruck){
			System.out.println("nissan is a BenzeTruck\n");
		}
		if (daewoo instanceof BenzeTruck){
			System.out.println("daewoo is a BenzeTruck\n");}
		if (booth instanceof AlleghenyTollBooth){
			System.out.println("booth is an AlleghenyTollBooth\n");}
		if (boothEasy instanceof DelawareEazyPassTollBooth){
			System.out.println("boothEasy is a DelawareEazyPassTollBooth\n");}
		
		///how to create a jar file
		System.out.println("\n"
				+ "to create a jar file using eclipse\n "
				+ "goto file >> export >>export as runnable jar fie >>and click next\n"
				+ " select >> extract librariies into generated jar file\n"
				+ "to run the file in linux go to command prompt and navigat to where the file is"
				+"\ntype java jar -[nameofJarFile] "
				);
		
		}
	}


