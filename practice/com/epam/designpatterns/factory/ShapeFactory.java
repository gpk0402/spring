package com.epam.designpatterns.factory;

public class ShapeFactory {
	public Shape getShape(String shapeType) {

		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase("TRAINGLE")) {
			return new Traingle();
		}

		return null;
	}
}
