package org.epsi.pointbreak.domain;

public enum Surface {
	ACRYLIC('A', "Acrylic"),
	ACLAY('B', "Artificial clay"),
	AGRASS('C', "Artificial grass"),
	ASPHALT('D', "Asphalt"),
	CARPET('E', "Carpet"),
	CLAY('F', "Clay"),
	CONCRETE('G', "Concrete"),
	GRASS('H', "Grass"),
	OTHER('J', "Other");

	private Character dbChar;
	private String surfaceType;
	
	private Surface(Character dbChar, String surfaceType) {
		this.dbChar = dbChar;
		this.surfaceType = surfaceType;
	}

	public Character getDbChar() {
		return dbChar;
	}
	
	public String getSurfaceType() {
		return surfaceType;
	}
	
}