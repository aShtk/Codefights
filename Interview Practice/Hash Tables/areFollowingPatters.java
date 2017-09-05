boolean areFollowingPatterns(String[] strings, String[] patterns) {
    Map keys = new HashMap();
    Map values = new HashMap();
    for(int i = 0; i < strings.length; i++){
        if(keys.containsKey(strings[i]) && !keys.get(strings[i]).equals(patterns[i]))
            return false;    
        else
            keys.put(strings[i], patterns[i]);
        if(values.containsKey(patterns[i]) && !values.get(patterns[i]).equals(strings[i]))
            return false;
        else
            values.put(patterns[i], strings[i]);
    }
    return true;
}
