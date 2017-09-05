int possibleSums(int[] coins, int[] quantity) {
        Set<Integer> set = new HashSet<>();
        for( int i=0; i<coins.length; i++ ) {
            Set<Integer> tmpSet = new HashSet<>();
            for( int sum : set ) {
                for( int j=1; j<=quantity[i]; j++ ) {
                    tmpSet.add(sum + coins[i] * j);
                }
            }
            set.addAll(tmpSet);
            for( int j=1; j<=quantity[i]; j++ ) {
                set.add(coins[i] * j);
            }
        }
        return set.size();
    }
