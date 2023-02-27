public class BraceChecker {
    String bracesList; 
        public BraceChecker(String braces){
        this.bracesList = braces;
    }


public boolean checkParentheses(){
    int strt = 0;
    int fnsh = 0;
    boolean reslt = true;

    for (int i = 0; i < bracesList.length(); i++){
        if( bracesList.charAt(i) == '('){
            strt = i;
        }
    }

    for (int j = strt; j < bracesList.length(); j++){
        if( bracesList.charAt(j) == ')'){
            reslt = true;
            fnsh = j;
            for (int k = strt; k < fnsh; k++) {
                /*if(bracesList.charAt(k) != '('){

                }
                */
            }
        
        }
    }
    if( bracesList.charAt(fnsh) != ')'){
        reslt = false;
    }
    return reslt;
/*
    for(int j = strt; j < fnsh; j++){
            if (condition) {
                
            }
            else if(){

            }
            
    }
        //System.out.printf("%d\n%d",strt,fnsh);
    return true;
     */
    }



    /*
    public boolean checkingBraces(){
        if( checkParentheses(0) == true && checkCurly(0) == true && checkBrackets(0) == true){
            return true;
        }
        return false;
    }
     */
/*
    public boolean checkParentheses(char braces){

        for(int i=0; i < bracesList.length(); i++){
            if(bracesList.charAt(i) == braces){
                for(int j=i; j < bracesList.length(); j++){
                    if(bracesList.charAt(j) == braces){
                        
                        }
                    }
                } 
            }
            return false;
        } 
 */
/* 
    public boolean checkParentheses(int charat){
        for(int i=charat; i < bracesList.length(); i++){
            if(bracesList.charAt(i) == '('){
                    for(int j=i; j < bracesList.length(); j++){
                        if(bracesList.charAt(j) == ')'){
                                for(int k = i; k < j; k++){
                                    if(bracesList.charAt(k) == '['){
                                        checkBrackets(k);
                                    }
                                    else if(bracesList.charAt(k) == '{'){
                                        checkCurly(k);
                                    }
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }
                return true;
            } 
*/


/*
    public boolean checkBrackets(int charat){
        for(int i=charat; i < bracesList.length(); i++){
            if(bracesList.charAt(i) == '['){
                for(int j=i; j < bracesList.length(); j++){
                    if(bracesList.charAt(j) == ']'){
                            for(int k = i; k < j; k++){
                                if(bracesList.charAt(k) == '('){
                                    checkParentheses(k);
                                }
                                else if(bracesList.charAt(k) == '{'){
                                    checkCurly(k);
                                }
                                return true;
                            }
                        }
                    }
                    return false;          
                }
            } 
        return true; 
        }

    public boolean checkCurly(int charat){
        for(int i=charat; i < bracesList.length(); i++){
            if(bracesList.charAt(i) == '{'){
                for(int j=i; j < bracesList.length(); j++){
                    if(bracesList.charAt(j) == '}'){
                        for(int k = i+1; k < j-1; k++){
                            if(bracesList.charAt(k) == '('){
                                checkParentheses(k);
                            }
                            else if(bracesList.charAt(k) == '['){
                                checkBrackets(k);
                            }
                            return true;
                            }
                        }                        
                    }
                return false; 
                } 
            }
        return true;
    }
*/
}

