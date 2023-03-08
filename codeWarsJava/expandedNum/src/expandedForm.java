public class expandedForm {
    private int form;

    public expandedForm(int newForm){
        this.form = newForm;
    }

    public String expandedFormStr(){
        char[] strForm = Integer.toString(form).toCharArray();
        String resultStr = "";

        for (int i = 0; i < strForm.length; i++) {
            char[] strPrt= new char[strForm.length-i];
            strPrt[0] = strForm[i];

            if(strPrt[0] != '0'){
                for (int j = 1; j < strForm.length-i; j++) {
                    strPrt[j] = '0';
                }
                //System.out.println(strPrt); 
            }

            if(i == 0 || i ==  strForm.length - 1){
                resultStr += String.valueOf(strPrt);
            }
            else{
                resultStr += " + " +  String.valueOf(strPrt);
            }
        }


        return resultStr;
    }
    
}
