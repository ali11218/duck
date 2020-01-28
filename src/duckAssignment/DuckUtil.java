package duckAssignment;

import java.util.Scanner;

public class DuckUtil {

	@SuppressWarnings("resource")
	public static DuckInterface duckInfoFromUser() {
		DuckInterface dif = null;
		GetterSetter setter = new GetterSetter();
		Scanner scan = new Scanner(System.in);

		System.out.println("Please provide the duck name: i.e. Mallard or Steamer");
		String duckName = scan.next();
		checkNullOrEmpty(duckName);
		DuckEnum inputFromUser = DuckEnum.getTypeFromUser(duckName);

		if (inputFromUser == DuckEnum.INVALID) {
			throw new IllegalArgumentException("Duck name should be: " + DuckEnum.MALLARD.getDuckType() + " or "
					+ DuckEnum.STEAMER.getDuckType() + "!");
		}

		setter.setDuckType(inputFromUser);

		if (inputFromUser == DuckEnum.MALLARD) {
			dif = new Mallard();
		} else if (inputFromUser == DuckEnum.STEAMER) {
			dif = new Steamer();
		}
		return dif;

	}

	public static void printResult(DuckInterface dif) {
		System.out.println("Can breed: "+dif.canBreed());
		System.out.println("Can fly: "+dif.canFly());
	}

	private static void checkNullOrEmpty(String value) {
		if (value == null || value.isEmpty()) {
			throw new IllegalArgumentException("Eror msg: Field cannot be null or empty!");

		}
	}

}
