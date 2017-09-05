int sumInRange(int[] nums, int[][] queries) {
    int m=1000000007;
    int[] prefsum = new int[nums.length];
    int sum = 0;
    for(int i = 0; i < nums.length; i++){
        sum += nums[i];
        prefsum[i] += sum;
    }
    
    sum = 0;
    for(int[] c : queries){
        sum += prefsum[c[1]];
        if(c[0] > 0) sum -= prefsum[c[0]-1];
        sum %= m;
    }    
    return sum>0?sum%=m:m+sum;
}