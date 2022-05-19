class Solution {
    public void setZeroes(int[][] m) {

        int[] ar_i = new int[m.length];
        int[] ar_j = new int[m[0].length];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] == 0) {
                    ar_i[i]++;
                    ar_j[j]++;
                }
            }
        }

        for(int i=0 ; i<ar_i.length ; i++){
            if(ar_i[i] > 0){
                for(int j = 0; j<ar_j.length; j++){
                    m[i][j] = 0;
                }
            }
        }

        for(int j=0 ; j<ar_j.length ; j++){
            if(ar_j[j] > 0){
                for(int i = 0; i<ar_i.length; i++){
                    m[i][j] = 0;
                }
            }
        }

    }
}