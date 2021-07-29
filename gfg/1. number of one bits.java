/*samsung interview question */


class Solution {
    static int setBits(int N) {
        int remainder;
        int count=0;
        int quotient;
        StringBuilder s = new StringBuilder();
        
        while(N!=0){
            quotient =N/2;
            remainder=N%2;
            s.append(Integer.toString(remainder));
            N= quotient;
        }
        
        String nwres ="";
        
        for(int i=s.length()-1;i>=0;i--){
            nwres+=s.charAt(i);
        }
        
        for(int i=0;i<s.length();i++){
            if(nwres.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
