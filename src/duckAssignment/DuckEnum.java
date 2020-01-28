package duckAssignment;

public enum DuckEnum {
	MALLARD("Mallard"), STEAMER("Steamer"), INVALID("Invalid");
	 
	private String duckType;

	private DuckEnum(String duckType) {
		this.duckType = duckType;
	}

	public static DuckEnum getTypeFromUser(String typeOfDuck) {
		DuckEnum[] values = DuckEnum.values();
		for (DuckEnum duckEnum : values) {
			if (duckEnum.getDuckType().equalsIgnoreCase(typeOfDuck)) {
				return duckEnum;
			}
		}
		return INVALID;
	}

	public String getDuckType() {
		return duckType;
	}
}
