import tollBoothSystem;
Class test {
public static void main(String [] args){
	TollBooth booth = new AlleghenyTollBooth();
	TollBooth boothEasy = new DelawareEazyPassTollBooth();
	Truck ford = new FordTruck(5, 12000); // 5 axles and 12000 kilograms
	Truck nissan = new NissanTruck(2, 5000); // 2 axles and 5000kg
	Truck daewoo = new DaewooTruck(6, 17000); // ….
	booth.calculateToll(ford);
	booth.displayData();
	booth.calculateToll(nissan);
	boothEasy.calculateToll(ford);
	boothEasy.displayData();
	boothEasy.calculateToll(nissan);
}
}