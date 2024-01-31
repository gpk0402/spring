package com.epam.designpatterns.builder;


public class BicycleApp {
	public static void main(String[] args) {
		Bicycle bicycle = Bicycle.builder()
				.modelName("BMX")
				.color("yellow")
				.wheelDiameter(12)
				.doubleSeat(true)
				.CarrierType(CarrierType.HITCH_MOUNT)
				.gearType(GearType.FIXED_GEAR)
				.doubleStand(false)
				.build();
		System.out.println(bicycle);
	}

}
