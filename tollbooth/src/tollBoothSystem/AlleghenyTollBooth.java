package tollBoothSystem;

public class AlleghenyTollBooth implements TollBooth{
	protected float calcCostPerTruck;
	protected int numAxels;
	protected int totalNumTrucks;
	protected float weightperTrck;
	protected float totalMoneyCollectd;
	public AlleghenyTollBooth(){
		
		totalNumTrucks=0;
		totalMoneyCollectd=0;
		}
	public float calCulateToll(Truck T)throws  InvalidVehicleParameterException{
		scanBarcode( T);
		if (numAxels<0){
			throw new  InvalidVehicleParameterException("number of Axels cannot be  negative " + numAxels +"\n");
		}
		calcCostPerTruck=5*numAxels  +(( weightperTrck/1000)*2 )*10;
		totalMoneyCollectd+=calcCostPerTruck;
		totalNumTrucks++;
		System.out.println("Truck arrival - Axles: "+ numAxels + "   Total weight: "+ weightperTrck +"   Toll due:$" +calcCostPerTruck);
		return calcCostPerTruck;
		};
	public void displayData(){
		 System.out.println("\n*** Collecting receipts ***");
		
		 System.out.println("Totals since the last collection - Receipts: " + " " + totalMoneyCollectd);
		 System.out.println("total trucks collected is " + " " + totalNumTrucks);
	}
	

	public int getNumberofTruckArrivals() {	
		return totalNumTrucks;
	}
	
	public float getTotalAmount() {
		return totalMoneyCollectd;
	}
	//collect data about truck
	public void scanBarcode(Truck T) {
		//collect data about truck
		weightperTrck=T.getWeight();
		numAxels=T.getNumberOfAxles();
		
	}
	
	public void makeAcollection() {
	//displays amount and reset tollbooth
		displayData();
		totalMoneyCollectd=0;
		totalNumTrucks=0;
	}
	
	
}
