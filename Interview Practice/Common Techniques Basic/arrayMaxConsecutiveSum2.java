int arrayMaxConsecutiveSum2(int[] inputArray) {
    int sum = -1001;
    int max = -1001;
    for(int i : inputArray){
        if(i > (sum+i)) sum = i;
        else sum += i;
        max = Math.max(max, sum);
    }
    return sum;
}
