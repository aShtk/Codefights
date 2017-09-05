ArrayList<Integer> mergeKArrays(int[][] arrays) {
  int[] firstUnused = new int[arrays.length];
  ArrayList<Integer> result = new ArrayList<>();
  int n = 0;
  for (int i = 0; i < arrays.length; i++) {
    n += arrays[i].length;
  }
  for (int i = 0; i < n; i++) {
    int minIndex = -1,
        minValue = 0;
    for (int j = 0; j < arrays.length; j++) {
      if (firstUnused[j] < arrays[j].length) {
        if (minIndex == -1 || minValue > arrays[j][firstUnused[j]]) {
          minIndex = j;
          minValue = arrays[j][firstUnused[j]];
        }
      }
    }
    result.add(minValue);
    firstUnused[minIndex]++;
  }
  return result;
}
