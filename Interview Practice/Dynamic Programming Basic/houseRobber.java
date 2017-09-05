int houseRobber(int[] h) {
    int a = 0, b = 0;
    
    for (int m : h) {
        b = Math.max(m + a, a = b);
    }
    
    return b;
}
