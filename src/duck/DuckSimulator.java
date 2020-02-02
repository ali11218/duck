package duck;

public class DuckSimulator {
	public static void main(String[] args) {

		try {
			DuckService duckInfoFromUser = DuckUtil.duckInfoFromUser();

			DuckUtil.printResult(duckInfoFromUser);

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {

			System.out.println("program has been executed. Please start again.");
		}

	}
}