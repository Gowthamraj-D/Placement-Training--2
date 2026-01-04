s Solution {
    public boolean isHappy(int n) {
        Set<Integer> visit = new HashSet<>();
        
        while (!visit.contains(n)) {
            visit.add(n);
            n = getNextNumber(n);
            if (n == 1) {
                
