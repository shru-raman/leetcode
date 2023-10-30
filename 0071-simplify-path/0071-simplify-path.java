class Solution {
    public String simplifyPath(String path) {
        path = path.replaceAll("//","/");
        Stack<String> stk = new Stack<>();
        String[] arr = path.split("\\/");
        int i = 0;
        while(i<arr.length) {
            if(arr[i].equals(".") || arr[i].equals("")){
                //doNothing
            } else if(arr[i].equals("..") && !stk.isEmpty()) {
                stk.pop();
            } else if (arr[i].equals("..") && stk.isEmpty()) {
                //doNothing
            } else {
                stk.add(arr[i]);
            }
            i++;
        }
        if(stk.isEmpty()){
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.insert(0, stk.pop());
            sb.insert(0,"/");
        }
        
        String result =  sb.toString();
        result = result.replaceAll("//","/");
        return result;
    }
}


//home is invalid path
//home/ is invalid path
//"" is invalid path
//"/home/../" should have "/"
