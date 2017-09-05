int productExceptSelf(int[] nums, int m) {
    int p = 1;
    int g = 0;
    for(int i=0; i<nums.length; i++){
        g = (g * nums[i] + p)%m;
        p = (p * nums[i]) % m;
    }
    return g;
}