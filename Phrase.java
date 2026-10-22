public class Phrase {
    
    private String text;

    public Phrase(String newText) {
        this.text = newText;
    }

    public String getText() {
        return text;
    }

    // Read REQ 03
    public String reversed() {
        String fin = "";
        if (text.length() == 1) {
            return text;
        }
        for (int i = text.length() - 1; i >= 0; i = i-1) {
            fin = fin + text.charAt(i);
        }
        return fin;
    }

    // Read REQ 04
    public int countChar(char target) {
        int count = 0;
        for (int i = text.length() - 1; i >= 0; i --) {
            if (text.charAt(i) == target) {
                count ++;
            }
        }
        
        
        return count;
    }

    // Read REQ 05
    public boolean isAllDigits() {
        int num = 0;
        if (!text.equals("")) {
            for (int i = text.length() - 1; i >= 0; i --) {
                num = (int) text.charAt(i);
                if (num < 48 || num > 57) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    // Read REQ 06
    public int countAdjacentPairs() {
        int count = 0;
        for (int i = text.length() - 1; i >= 1; i = i - 1) {
            if (text.charAt(i) == text.charAt(i - 1)) {
                count ++;
            }
        }
        
        return count;
    }

    // Read REQ 07
    public int countOccurrences(String target) {
        int count = 0;
        if (text.equals(target)) {
            return 1;
        }
        for (int i = 0; i < text.length() - 1; i = i + 1) {
            String t = text.substring(i, i+2);
            if (t.equals(target)) {
                count ++;
            }
        }
        return count;
    }

    // Read REQ 08
    public String capitalizeWords() {
        String fin = "";
        boolean start = true;
        for (int i = 0; i < text.length(); i ++) {
            char c = text.charAt(i);
            if (c == ' ') {
                fin = fin + c;
                start = true;
            } else {
                if (start) {
                int uc = (int) c - 32;
                char ufin = (char) uc;
                fin = fin + ufin;
                start = false;
            } else {
                fin = fin + c;
            } }
        }
        
        
            return fin;
    }

    // Read REQ 09
    public boolean isPalindrome() {
        String work = text.toLowerCase();
        String fin = "";
        if (work.length() == 1) {
            return true;
        } else if (work.length() == 0) {
            return true;
        }
        for (int i = work.length() - 1; i >= 0; i = i-1) {
            fin = fin + work.charAt(i);
        }
        if (fin.equals(work)) {
            return true;
        }
        
        return false;
    }

    public String everyNthChar(int n) {
        String fin = "";
        
        for (int i = 0; i * n <= text.length() - 1; i ++) {

            fin = fin + text.charAt(i * n);

        }

        return fin;
    }

    public boolean isPalindromeIgnoringSpaces() {
        String fint = "";
        for (int i = 0; i < text.length(); i ++) {
            char c = text.charAt(i);
            if (!(c == ' ')) {
                fint = fint + c;
            }
        }
        
        String work = fint.toLowerCase();
        String fin = "";
        if (work.length() == 1) {
            return true;
        } else if (work.length() == 0) {
            return false;
        }
        for (int i = work.length() - 1; i >= 0; i = i-1) {
            fin = fin + work.charAt(i);
        }
        if (fin.equals(work)) {
            return true;
        }
        
        return false;
        
        
    }


}
