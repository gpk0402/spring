package com.epam.designpatterns.builder;

import java.util.Objects;

public class Bicycle {
	// required variables
	private String modelName;
	private String color;
	private double wheelDiameter;
	// optional parameters
	private boolean doubleStand;
	private GearType gearType;
	private Boolean doubleSeat;
	private CarrierType carrierType;

	public static BicycleBuilder builder() {
		return new BicycleBuilder();
	}


	public static class BicycleBuilder{
		private String modelName;
		private String color;
		private double wheelDiameter;
		// optional parameters
		private Boolean doubleStand;
		private GearType gearType;
		private Boolean doubleSeat;
		private CarrierType carrierType;

		public BicycleBuilder modelName(final String modelName) {
			this.modelName = modelName;
			return this;
		}
		public BicycleBuilder color(final String color) {
			this.color = color;
			return this;
		}
		public BicycleBuilder wheelDiameter(final double wheelDiameter) {
			this.wheelDiameter = wheelDiameter;
			return this;
		}
		public BicycleBuilder doubleStand(final Boolean doubleStand) {
			this.doubleStand = doubleStand;
			return this;
		}
		public BicycleBuilder gearType(final GearType gearType) {
			this.gearType = gearType;
			return this;
		}
		public BicycleBuilder doubleSeat(final Boolean doubleSeat) {
			this.doubleSeat = doubleSeat;
			return this;
		}
		public BicycleBuilder CarrierType(final CarrierType carrierType) {
			this.carrierType = carrierType;
			return this;
		}
		
		public Bicycle build() {
			if (!Objects.nonNull(this.modelName) || !Objects.nonNull(this.color)
					|| !Objects.nonNull(this.wheelDiameter)) {
				throw new RuntimeException("Missing Required Parameters");
			}
			Bicycle bicycle = new Bicycle();
			bicycle.color = color;
			bicycle.modelName = modelName;
			bicycle.wheelDiameter = wheelDiameter;
			bicycle.carrierType = carrierType;
			bicycle.doubleSeat = doubleSeat;
			bicycle.gearType = gearType;
			bicycle.doubleStand = doubleStand;
			return bicycle;
		}
	}


	@Override
	public String toString() {
		return "Bicycle [modelName=" + modelName + ", color=" + color + ", wheelDiameter=" + wheelDiameter
				+ ", doubleStand=" + doubleStand + ", gearType=" + gearType + ", doubleSeat=" + doubleSeat
				+ ", carrierType=" + carrierType + "]";
	}
	
}
