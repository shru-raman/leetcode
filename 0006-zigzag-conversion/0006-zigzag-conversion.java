class Solution {
    public String convert(String s, int numRows) {
        int cols = s.length();
        int sindex = 0;
        char[] sarr = s.toCharArray();
        if(numRows == 1){
            return s;
        }
        
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i = 0 ; i<numRows;i++){
            sb[i] = new StringBuilder();
        }
        int row = 0;
        while(sindex<cols){
            for(int i = row;i<numRows && sindex<cols;i++){
                sb[i].append(sarr[sindex++]);
            }
            row = numRows - 2;
            for(int i = row;i>=0 && sindex<cols;i--){
                 sb[i].append(sarr[sindex++]);
            }
            row = 1;
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i<numRows;i++){
            res.append(sb[i]);
        }
        return res.toString();
    }
    
     //1 PAH
        //2 APLS
        //3 YI
        //P          A        H       N
          //  A    P    L   S   I   I   G
            //   Y        I       R
}