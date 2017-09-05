String findProfession(int level, int pos){
    return profesion(level, pos) == 'E' ? "Engineer" : "Doctor";
}
char profesion(int level, int pos)
{
    if (level == 1)
        return 'E';
    if (profesion(level - 1, (pos + 1) / 2) == 'D')
        return (pos % 2)==1 ? 'D' : 'E';
    return (pos % 2)==1 ? 'E' : 'D';
}