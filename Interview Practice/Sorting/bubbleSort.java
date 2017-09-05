int[] bubbleSort(int[] items) {

  class SwapClass {
    void swap(int[] items, int firstIndex, int secondIndex) {
      int temp = items[firstIndex];
      items[firstIndex] = items[secondIndex];
      items[secondIndex] = temp;
    }
  }
  SwapClass sw = new SwapClass();

  int len =  items.length;

  for (int i = 0; i < len; i++) {
    for (int j = 0, stop = len - i; j < stop - 1; j++) {
      if (items[j] > items[j + 1]) {
        sw.swap(items, j, j + 1);
      }
    }
  }

  return items;
}

