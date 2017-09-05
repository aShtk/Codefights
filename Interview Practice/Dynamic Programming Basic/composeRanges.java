String[] composeRanges(int[] nums) {
    if (nums.length == 0) return new String[0];

    ArrayList<String> al = new ArrayList<>();
    int start = nums[0];
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[i-1] + 1) {
            if (start == nums[i-1]) {
                al.add(start+"");
            } else {
                al.add(start + "->" + nums[i-1]);
            }
            start = nums[i];
        }

    }
    int last = nums[nums.length-1];
    if (start == last) {
         al.add(start+"");
    } else {
        al.add(start + "->" + last);
    }
    return al.toArray(new String[0]);
}
