package gr.upatras.junit.first;

public class myClass {
	public String substrack(int x, int y) {
		int z = x - y;
		if (z > 0) {
			return "POSITIVE";
		}
		else if (z < 0) {
			return "NEGATIVE";
		}
		else {
			return "ZERO";
		}
	}
}

