int firstDuplicate(std::vector<int> a) {
    int* indexes = new int[a.size()-1];
    for (auto &i : a)
        if (++indexes[i-1]==2)
        return i;
    return -1;
}