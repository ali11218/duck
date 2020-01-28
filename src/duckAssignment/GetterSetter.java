package duckAssignment;

public class GetterSetter {
	//pojo
	private DuckEnum duckType;

	public GetterSetter(DuckEnum duckType) {
		super();
		this.duckType = duckType;
	}

	public GetterSetter() {
		super();
	}

	public DuckEnum getDuckType() {
		return duckType;
	}

	public void setDuckType(DuckEnum duckType) {
		this.duckType = duckType;
	}	
	

}
