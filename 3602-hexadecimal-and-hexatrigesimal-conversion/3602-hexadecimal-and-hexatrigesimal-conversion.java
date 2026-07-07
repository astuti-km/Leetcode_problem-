class Solution {
    public String concatHex36(int n) {
        long square = 1L * n * n;
        long cube = 1L * n * n * n;

        return convert(square, 16) + convert(cube, 36);
    }

    private String convert(long num, int base) {
        if (num == 0) return "0";

        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            int rem = (int)(num % base);

            if (rem < 10) {
                sb.append((char)('0' + rem));
            } else {
                sb.append((char)('A' + (rem - 10)));
            }

            num /= base;
        }

        return sb.reverse().toString();
    }
}