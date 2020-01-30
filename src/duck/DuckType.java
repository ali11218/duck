package duck;

public enum DuckType {
	MALLARD("Mallard"), STEAMER("Steamer"), INVALID("Invalid");

	private String duckType;

	private DuckType(String duckType) {
		// this.duckType = duckType;
	}

	public static DuckType getTypeFromUser(String typeOfDuck) {
		DuckType[] values = DuckType.values();
		for (DuckType duckValue : values) {
			if (duckValue.getDuckType().equalsIgnoreCase(typeOfDuck)) {
				return duckValue;
			}
		}
		return INVALID;
	}

	public String getDuckType() {
		return duckType;
	}
}
