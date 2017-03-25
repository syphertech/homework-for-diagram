package tollBoothSystem;

public class FordTruck implements Truck{
	private int numAxles;
	private String typeOfTruck;
	private float weight;
	
	//constructor
	public FordTruck (int axle, float weights){
		numAxles=axle;
		weight=weights;
		typeOfTruck="ford";
	}
	//getter sand setters
	public float getWeight(){
		return weight;
		
	};
	public int getNumberOfAxles(){
		return numAxles;
	};
	public String getMake(){
		return typeOfTruck;
	};

	public void  setWeight(float weight){
		 this.weight=weight;
		
	};
	public void setNumberOfAxles(int axle){
		numAxles=axle;
	};
	public void setMake(String make){
		 typeOfTruck=make;
	};
}
