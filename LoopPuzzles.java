public class LoopPuzzles {
     // Read REQ 02
    public int stepsToOne(int start) {
        int steps = 0;
        if (start > 0) {
            while (start != 1) {
                if ((start % 2) == 0) {
                    start = start / 2;
                    steps ++;
                } else {
                    start = (start * 3) + 1;
                    steps ++;
                }
            }
            return steps;
        } 
        return -1;
        
        
    }

    // Read REQ 03
    public int sumDigits(int n) {
        int div = 10;
        int sum = 0;
        if (n < 0) {
            n = -n;
        }
        while (n >= div) {
            sum = sum + ((n % div) / (div / 10));
            div = div * 10;
        } 
        sum = sum + (n / (div / 10));
        
        return sum;
    }

    // Read REQ 04
    public int reverseDigits(int n) {
        int fin = 0;
        int div = 10;
        int mult = 10;
        if (n < 0) {
            n = -n;
            while (n > div) {
                div = div * 10;
            }
            fin = fin + (n / (div / 10));
            div = div / 10;
            while (div >= 10) {
                fin = fin + (((n % div) / (div / 10)) * mult);
                mult = mult * 10;
                div = div / 10;
            }
            fin = -fin; 
        } else {
            while (n > div) {
                div = div * 10;
            }
            fin = fin + (n / (div / 10));
            div = div / 10;
            while (div >= 10) {
                fin = fin + (((n % div) / (div / 10)) * mult);
                mult = mult * 10;
                div = div / 10;
            }
        }
        


        return fin;
    }

    // Read REQ 05
    public boolean isPowerOfThree(int n) {
        boolean stop = false;
        int og = 0;
        if (n == 1) {
            return true;
        }
        if (n >= 0) {
            while (stop == false) {
                og = n;
                n = n / 3;
                if (n == 3 && n * 3 == og) {
                    stop = true;
                    return true;
                } else if (n == 2) {
                    return false;
                } else if (n == 1) {
                    return false;
                } else if (n == 3) {
                    return false;
                } else if (n == 0) {
                    return false;
                }
            }
        }
        return false;
    }

    // Read REQ 06
    public int firstRunningTotalAbove(int limit) {
        int total = 0;
        int runs = 0;
        while (total <= limit) {
            total = total + runs;
            runs ++;
        }
        return total;
    }

    // Read REQ 07
    public String readUntilSentinel(String csv, String sentinel) {
        String fin = "";
        int commaIndex = csv.indexOf(",");
        if (commaIndex == -1) {
            return "";
        }
        String token = csv.substring(0, commaIndex);
        if (csv.indexOf(sentinel) == -1) {
            while (!csv.equals("")) {
                token = csv.substring(0, commaIndex);
                if (token.equals(sentinel)) {
                    return fin;
                }
                if (fin.equals("")) {
                    csv = csv.substring(commaIndex + 1);
                    fin = token;
                } else if (!fin.equals("")) {
                csv = csv.substring(commaIndex + 1);
                fin = fin +  " " + token; } }
            return fin;
        }
        while (!token.equals(sentinel)) { 
            commaIndex = csv.indexOf(",");  
            if (commaIndex == -1) {
                token = csv;
                csv = "";
                return fin;
            } else {
                token = csv.substring(0, commaIndex);
                if (token.equals(sentinel)) {
                    return fin;
                }
                if (fin.equals("")) {
                    csv = csv.substring(commaIndex + 1);
                    fin = token;
                } else if (!fin.equals("")) {
                csv = csv.substring(commaIndex + 1);
                fin = fin +  " " + token; 
            }
            }
            
            }
            return fin;
        }
}
