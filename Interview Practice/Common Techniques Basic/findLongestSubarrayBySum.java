int[] findLongestSubarrayBySum(int s, int[] arr) {
    int bleft = 0;
    int bright = 0;
    int pointer = 0;
    int sum = 0;

    for(int i = 0; i<arr.length; i++){
        sum += arr[i];
        while(sum > s){
            sum -= arr[pointer];
            pointer++;
        }
        if(sum == s && ((bright == 0) || ((i - pointer) > (bright - bleft)))){
            bright = i+1;
            bleft = pointer + 1;
        } 
    }
    
    if(bright == 0) return new int[] {-1};
    else return new int[] {bleft, bright};

}
