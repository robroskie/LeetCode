class Solution {
    public int getSum(int a, int b) {
		int result;

		do {
			result = a & b;
			a = a ^ b;
			b = result << 1;
		}
		while(b != 0);
        return a;
    }
}