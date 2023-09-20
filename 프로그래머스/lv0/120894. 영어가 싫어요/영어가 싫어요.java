class Solution {
    public long solution(String numbers) {
        
        char[] cArr = numbers.toCharArray();
        String s = "";
        
        int i = 0;
        while(i < cArr.length){
                switch(cArr[i]){

                    case 'o': 
                        s += "1";
                        i += 2;
                        break;
                    case 't':
                        s += cArr[i+1] == 'w' ? "2" : "3";
                        i += cArr[i+1] == 'w' ? 2 : 4;
                        break;
                    case 'f':
                        s += cArr[i+1] == 'o' ? "4" : "5";
                        i += cArr[i+1] == 'o' ? 3 : 3;
                        break;
                    case 's':
                        s += cArr[i+1] == 'i' ? "6" : "7";
                        i += cArr[i+1] == 'i' ? 2 : 4;
                        break;
                    case 'e':
                        s += "8";
                        i += 4;
                        break;
                    case 'n':
                        s += "9";
                        i += 3;
                        break;
                    case 'z':
                        s += "0";
                        i += 3;
                        break;
                }
            i++;
        }
        return Long.parseLong(s);
    }
}