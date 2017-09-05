String minSubstringWithAllChars(String s, String t) {
    Set<Character> chars = new HashSet<>();
    for (int i = 0; i < t.length(); i++) {
        chars.add(t.charAt(i));
    }
    
    Map<Character, Integer> idxs = new HashMap<>();
    
    int from = 0;
    int to = 0;
    
    int dst = Integer.MAX_VALUE;
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (!chars.contains(c)) continue;
        idxs.put(c, i);
        
        if (idxs.size() == t.length()) {
            int minIdx = idxs.values().stream().min(Comparator.naturalOrder()).get();
            int len = i - minIdx + 1;
            if (len < dst) {
                dst = len;
                from = minIdx;
                to = i + 1;
            }
        }
    }
    
    return s.substring(from, to);
}
