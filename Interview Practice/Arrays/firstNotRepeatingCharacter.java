char firstNotRepeatingCharacter(String s) {
      
      int index = 0;
      int[] letters = new int[26];
      int[] order = new int[26];
      
      for(int i : s.getBytes()){
            letters[i-97]++;
            order[i-97]+=index;
            index++;
      }
      
      int minindex = s.length();
      int result = -2;

      for(int i = 0; i < letters.length; i++){
            if(letters[i] == 1 && order[i] < minindex){
                  minindex = order[i];
                  result = i;
                  }
      }
      return (char) (result+97);
}
