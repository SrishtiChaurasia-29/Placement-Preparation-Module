class Solution {
    public int romanToInt(String s) {
        char c;
        int i,sum=0;
        int l=s.length();
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                if((i+1)<l && s.charAt(i+1)=='X')
                {
                    sum=sum+9;
                    i=i+1;
                }
                else if((i+1)<l && s.charAt(i+1)=='V')
                {
                    sum=sum+4;
                    i++;
                }
                else
                    sum=sum+1;
            }
             else if(s.charAt(i)=='X' ){
                if((i+1)<l && s.charAt(i+1)=='L')
                {
                    sum=sum+40;
                    i++;
                } 
                 
                else if((i+1)<l && s.charAt(i+1)=='C')
                { 
                    sum=sum+90;
                    i++;
                }
                else
                    sum=sum+10;
             }
             else if(s.charAt(i)=='C'  ){
                if((i+1)<l && s.charAt(i+1)=='D')
                {
                    
                 sum=sum+400;
                    i++;
                }
                else if((i+1)<l && s.charAt(i+1)=='M')
                {
                     sum=sum+900;
                    i++;
                }
                else
                    sum=sum+100;
             }
           else if(s.charAt(i)=='L')
                sum=sum+50;
             
            else if(s.charAt(i)=='D')
                sum=sum+500;
             
           else if(s.charAt(i)=='M')
                sum=sum+1000;
             
            else if(s.charAt(i)=='V')
                sum=sum+5;
        
            
        }
            
       return sum;
        
        
    }
}