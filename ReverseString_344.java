    class ReverseString_344 {
        public void reverseString(char[] s) {
            StringBuilder sb = new StringBuilder(new String(s));
            sb.reverse();
            for (int i = 0; i < s.length; i++) {
                s[i] = sb.charAt(i);
            }
        }
    }

