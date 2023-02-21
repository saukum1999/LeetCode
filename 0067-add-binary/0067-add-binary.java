class Solution {
    public String addBinary(String a, String b) {
        int la = a.length() - 1;
        int lb = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(la >= 0 || lb >= 0){
            int sum = carry;
            if(la >= 0) sum += a.charAt(la--) - '0';
            if(lb >= 0) sum += b.charAt(lb--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if(carry > 0)
            sb.append(carry);
        return sb.reverse().toString();
        
    }
}