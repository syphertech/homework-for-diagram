package tollBoothSystem;
public interface TollBooth  {

public int getNumberofTruckArrivals();//keeps a sum of trucks that have passed through tollbooth
public float getTotalAmount();//generates total amount received by tool booth before drawer is removed
public void scanBarcode(Truck T);//reads trucks data
public void displayData();//displays info on screen
public void makeAcollection();// makes a collection and reset data
public float calCulateToll(Truck T) throws InvalidVehicleParameterException ;//calculate toll each vehicle must pay
}
