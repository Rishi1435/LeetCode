import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb=new StringBuilder();
        for(int d:digits){
            sb.append(d);
        }
        BigInteger n=new BigInteger(sb.toString());
        n=n.add(BigInteger.ONE);
        String str=String.valueOf(n);
        int[] result=new int[str.length()];
        for(int i=0;i<str.length();i++){
            result[i]=str.charAt(i)-'0';
        }
        return result;
    }
}