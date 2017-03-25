package tollBoothSystem;

public class DelawareEazyPassTollBooth extends AlleghenyTollBooth {

	
	public float calCulateToll(BenzeTruck T)throws  InvalidVehicleParameterException{
		scanBarcode( T);		
		calcCostPerTruck=(float) ((5*numAxels  +( (weightperTrck/1000)*2 )*10)*0.9);
		totalMoneyCollectd+=calcCostPerTruck;
		totalNumTrucks++;
		return calcCostPerTruck;
		};
}
