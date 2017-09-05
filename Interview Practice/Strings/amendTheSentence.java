String amendTheSentence(String s) {
    return s.replaceAll("(\\p{Lu})", " $1").toLowerCase().trim();
}
