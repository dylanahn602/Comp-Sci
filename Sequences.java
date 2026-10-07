public class Sequences {
    
    // Read REQ 02
    public int sumOfFirst(int n) {
        int total = 0;
        for (int control = 0; control <= n; control ++) {
            total = total + control;
        }
        return total;
    }

    // Read REQ 03
    public String countUp(int start, int limit) {
        String result = "";
        while (start < limit) {
            result = result+ start + " ";
            start ++;
        } if (start <= limit) {
            result = result + start;
        }
        return result;
    }

    // Read REQ 04
    public String countByThrees(int start, int limit) {
        String result = "";
        while (start < limit) {
            result = result + start + " ";
            start += 3;
        } if (start <= limit) {
            result = result + start;
        }
        return result;
    }

    // Read REQ 05
    public int productOfFirst(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    // Read REQ 06
    public int countMultiples(int n, int factor) {
        int count = 0;
        if (factor != 0) {
            for(int i = 1; i <= n; i++) {
                if ((i % factor)== 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // Read REQ 07
    public String repeat(String s, int times) {
        String result = "";
        for (int i = 1; i <= times; i++) {
            result = result + s;
        }
        return result;
    }

    // Read REQ 08
    public int power(int base, int exponent) {
        int result = 1;
        for(int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }

    public int sumOfSquares(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total = total + (i * i);
        }
        return total;
    }
    public int alternatingSum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                total -= i;
            } else {
                total += i;
            }
        }
        return total;
    }
    public String powersOfTwo(int count) {
        String total = "";
        for (int i = 0; i < count; i++) {
            total = total + (power( 2, i)) + " ";
        } total.stripTrailing();
        return total;
    }
    public String countBy(int start, int limit, int step) {
        String total = "";
        while (start <= limit) {
            total = total + start + " ";
            start = start + step;
        } total.stripTrailing();
        return total;
    }
}
