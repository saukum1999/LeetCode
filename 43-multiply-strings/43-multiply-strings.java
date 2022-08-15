class Solution {
    public String multiply(String num1, String num2) {

        int len1 = num1.length();
        int len2 = num2.length();
        int[] position = new int[len1 + len2];

        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                // int index = len1 + len2 - i - j - 2;
                position[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                // position[index + 1] = position[index]/10;
                // position[index] = position[index] % 10;
            }
        }

        int carry = 0;
        for(int i = position.length -1; i>=0; i--){
            int temp = (position[i] + carry)%10;
            carry = (position[i] + carry)/10;
            position[i] = temp;
        }

        StringBuilder sb = new StringBuilder();
        // for (int i = position.length; i >= 0; i--) {
        //     if (sb.length() == 0 && position[i] == 0)
        //         continue;
        //     sb.append(position[i]);
        // }
        for(int a : position){
            sb.append(a);
        }
        while(sb.length()!=0 && sb.charAt(0) == '0') sb.deleteCharAt(0);
        if(sb.length() == 0 )
            return "0";
        return sb.toString();
    }
}