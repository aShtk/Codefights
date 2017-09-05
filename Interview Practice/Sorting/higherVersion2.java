int higherVersion2(String ver1, String ver2) {
    String[] part1 = ver1.split("\\.");
    String[] part2 = ver2.split("\\.");
    int comp = 0;
    for(int i=0; i<part1.length; i++){
        comp = Integer.parseInt(part1[i])-Integer.parseInt(part2[i]);
        if(comp < 0) return -1; if(comp > 0) return 1;
    }
    return 0;
}