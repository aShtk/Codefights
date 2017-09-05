boolean sudoku2(char[][] grid) {
    Set<Integer> rows = new HashSet<>();
    Set<Integer> columns = new HashSet<>();
    Set<Integer> quadrant = new HashSet<>();
    
    for(int i = 0; i < grid.length; i++){
        for(char j : i){
            if(Character.isDigit(j)){
                lines[j-49]++;  
                if(lines[j-49] > 1) return false;
            } 
        }
    }
    return true;
}
