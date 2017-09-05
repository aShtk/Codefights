int mapDecoding(String message) {
    
    int prev = 0, count = 0, curr = 1;
    
    for (int i = 0; i < message.length(); i++) {
           
        int digit = message.charAt(i) - 48;
        int number = 0;
        if(i > 0) number = (message.charAt(i - 1) - 48) * 10 + digit;

        if(digit > 0) count = curr;
        if(number <= 26 && number > 9) count += prev;
            
        prev = curr;
        
        curr = count % 1000000007;
            
        count = 0;
    
    }

    return curr;
}