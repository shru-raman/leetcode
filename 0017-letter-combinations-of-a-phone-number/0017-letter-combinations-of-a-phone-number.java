class Solution {
    List<String> result = new ArrayList<>();
    String[] map = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return result;
        }
        result = rec(digits,"",digits);
        return result;
    }
    
    
    public List<String> rec(String digits,String prefix,String dig){
     //   System.out.println("Prefix formed :"+prefix);
        if(digits.length()==prefix.length()){
            result.add(prefix);
            return result;
        }
        char digi = dig.charAt(0);
        char[] arr = map[Integer.parseInt(digi+"")].toCharArray();
        for(char c: arr){
            rec(digits,prefix+c,dig.substring(1));
        }
        return result;
    }
}