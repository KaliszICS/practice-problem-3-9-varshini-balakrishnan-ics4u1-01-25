public class PracticeProblem {

	public static void main(String args[]) {
		String[] moves = towerOfHanoi(3);
		for (int i = 0; i < moves.length; i++) {
			System.out.println(moves[i]);
		}

	}
	public static String[] towerOfHanoi(int num) {
		int size = (int)Math.pow(2, num) - 1;
		String[] result = new String[size];
		int[] index = new int[1];
		hanoiHelper(num, "L", "M", "R", result, index);
		return result;
	}
	public static void hanoiHelper(int num, String from, String middle, String to, String[] result, int[] index) {
		if (num == 0) {
			return;
		}
		hanoiHelper(num - 1, from, to, middle, result, index);
		result[index[0]] = from + to;
		index[0]++;
		hanoiHelper(num - 1, middle, from, to, result, index);

	}

}
