package com.problem.yedam;

public class ObesityInfo extends StandaradWeightInfo {
 
	ObesityInfo(String nameString, int tall, int weight) {
		super(nameString, tall, weight);
	}
	public void getInformation(String nameString, int tall, int weight) {
		this.nameString= nameString;
		this.tall = tall;
		this.weight = weight;	
	}
	public void getObesity(double standardWeight) {
		this.standardWeight = standardWeight;
	}
	public double getObesity() {
		return (int)(weight-getStandardWeight())/getStandardWeight()*100;
	}
	

}
