package com.problem.yedam;

public class StandaradWeightInfo extends Human {
	
	StandaradWeightInfo(String nameString, int tall, int weight) {
		this.nameString = nameString;
		this.tall = tall;
		this.weight = weight;
	}
	public void weight(double standardWeight) {
		this.standardWeight = standardWeight;
	}
	public double getStandardWeight() {
		return (int)(tall-100)*0.9;
	}
}
