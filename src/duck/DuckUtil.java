package duck;

import java.util.Scanner;

public class DuckUtil {

	static String duckName;

	@SuppressWarnings("resource")
	public static DuckService duckInfoFromUser() {
		DuckService duckService = null;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please provide the duck name: i.e. Mallard or Steamer");
		duckName = scan.nextLine();
		checkNullOrEmpty(duckName);
		DuckType inputFromUser = DuckType.getTypeFromUser(duckName);

		if (inputFromUser == DuckType.INVALID) {
			throw new IllegalArgumentException("Duck name should be: " + DuckType.MALLARD.getDuckType() + " or "
					+ DuckType.STEAMER.getDuckType() + "!");
		}

		if (inputFromUser == DuckType.MALLARD) {
			duckService = new Mallard();
		} else if (inputFromUser == DuckType.STEAMER) {
			duckService = new Steamer();
		}
		return duckService;

	}

	public static void printResult(DuckService dif) {
		System.out.println(duckName + " can breed- " + dif.canBreed());
		System.out.println(duckName + " can fly- " + dif.canFly());
	}

	private static void checkNullOrEmpty(String value) {
		if (value == null || value.isEmpty()) {
			throw new IllegalArgumentException("Eror msg: Field cannot be null or empty!");

		}
	}

}
