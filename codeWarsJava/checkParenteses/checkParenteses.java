public class checkParenteses {
    private String PStr;
    public checkParenteses(String PStr){
        this.PStr = PStr;
    }
/*
    public boolean checker(int entrance, int lght){
        boolean ans = true;
        int strt = 0;
        int fnsh = 0;

        for (int i = entrance; i < lght; i++) {
            if(this.PStr.charAt(i) == '('){
                ans = false;
                strt = i;
                break;
            }
        } 
        for (int i = strt; i < lght; i++) {
            if(this.PStr.charAt(i) == ')' && ans == false){
                ans = true;
                fnsh = i;
                break;
            }
        }



        System.out.printf("%d\n%d",fnsh, strt);
        return ans;        
    }

    public String geCh(){
        return this.PStr;
    } */

        /*
        public boolean checker(int pos){
            int counter = pos;
            boolean ans = false;

            if(this.PStr.charAt(counter) == '(' && counter < this.PStr.length()){
                counter ++;
                System.out.println(this.PStr.charAt(counter));
                if(this.PStr.charAt(counter) == ')'){
                    ans = true;
                    System.out.println(this.PStr.charAt(counter));
                }
                else{
                    //System.out.println(this.PStr.charAt(counter));
                    this.checker(counter);
                }
            }
            else if(counter < this.PStr.length()-1){
                //System.out.println(this.PStr.charAt(counter));
                this.checker(counter+1);
            }
            return ans;
        } */

        public boolean checker(int pos){
            int counter = pos;
            int start = 0;
            int fnsh = 0;
            boolean ans = false;

            if(this.PStr.charAt(counter) == '(' && counter < this.PStr.length()){
                start = counter;
                counter ++;
                //System.out.println(this.PStr.charAt(counter));
                if(this.PStr.charAt(counter) == ')'){
                    ans = true;
                    //System.out.println(this.PStr.charAt(counter));
                }
                else{
                    //System.out.println(this.PStr.charAt(counter));
                    this.checker(counter);
                }

            return ans;
        }


}
