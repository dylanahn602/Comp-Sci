public class ArrayOps {
    
    // Read REQ 02
    public String toText(int[] nums) {
        String s = "[";
        int n = 0;
        if (nums.length == 1) {
            s = "[" + nums[0] + "]";
            return s;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            s = s + nums[i] + ", ";
            n = i;
        }
        if (n >= 1) {
            s = s + nums[n + 1] + "]";
            return s;
        } else {
            return "[]";
        }
        
    }

    // Read REQ 03
    public int[] numbersFrom(int start, int end) {
        int len = end - start;
        int [] e = {};
        if (len >= 0) 
            
        
         {int [] a = new int[len];
        int ind = 0;
        if (end > start) {
            for (int i = start; i < end; i++) {
                a[ind] = i;
                ind ++;
            }
            return a;
        } else {
            return a;
        } } else {
            return e;
        }

    }

    // Read REQ 04
    public double averageLength(String[] words) {
        double ave = 0.0;
        double div = 0;
        double total = 0;
        for (int i = 0; i < words.length; i++) {
            total = total + (words[i]).length();
            div = i;
        }
        div ++;
        ave = total / div;
        return ave;
    }

    // Read REQ 05
    public boolean hasWord(String[] words, String target) {
        if (words.length > 0) {
            for (int i = 0; i < words.length; i++) {
                if (target.equals(words[i])) {
                    return true;
                }
            }
        } else {
            return false;
        }
        return false;
    }

    // Read REQ 06
    public int indexOfLongest(String[] words) {
        int ind = 0;
        int max = 0;
        if (words.length > 0) {
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > max) {
                    max = words[i].length();
                    ind = i;
                }
            }
        } else {
            return -1;
        }
        return ind;
    }

    // Read REQ 07
    public boolean isIncreasing(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (last >= nums[i]) {
                return false;
            }
            last = nums[i];
        }
        
        return true;
    }

    // Read REQ 08
    public int[] reversed(int[] nums) {
        int st = 0;
        int [] a = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            a[st] = nums[i];
            st ++;
        }
        return a;
    }

    // Read REQ 09
    public int[] removeAndShift(int[] nums, int index) {
        for (int i = index; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[(nums.length - 1)] = 0;
        
        return nums;
    }

    // Read REQ 10
    public int[] valuesInRange(int[] nums, int low, int high) {
        int [] a = new int[nums.length];
        int ind = 0;
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= low && nums[i] <= high) {
                a[ind] = nums[i];
                ind ++;
                num ++;
            }
        }
        int [] b = new int[num];
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }
        return b;
    }
}
