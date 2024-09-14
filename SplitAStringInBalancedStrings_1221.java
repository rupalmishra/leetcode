    class SplitAStringInBalancedStrings_1221 {
        public int balancedStringSplit(String s) {
            int count = 0; 
            int balancedCount = 0; 
    
            for (char c : s.toCharArray()) {
                if (c == 'L') {
                    count++;
                } else {
                    count--;
                }
    
                if (count == 0) {
                    balancedCount++;
                }
            }
    
            return balancedCount;
        }
    }

