import java.lang.Character;

public class missingLetter {
    public char chaseMissingLetter(char[] charArray) {
        char missingOne = ' ';
        int firstLetterPos = 0;
        int lastLetterPos = 0;
        
        char[] checkingArray = {};
        int checkingArraySize = 0;
        int checker = 0;

        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] alphabetUpper = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        if(Character.isUpperCase(charArray[0])){
            for (int i = 0; i < alphabetUpper.length; i++) {
                if(charArray[0] == alphabetUpper[i]){
                    firstLetterPos = i;
                }
                if(charArray[charArray.length - 1] == alphabetUpper[i]){
                    lastLetterPos = i;
                }
            }
            checkingArraySize = lastLetterPos - firstLetterPos;
            checkingArray = new char[checkingArraySize];
            
            for (int j = firstLetterPos ; j < lastLetterPos; j++) {
                checkingArray[checker] = alphabetUpper[j];
                checker++;
            }

            for (int z = 0; z < checkingArray.length; z++) {
                System.out.println(charArray[z] + "|" + checkingArray[z]);
                if(checkingArray[z] != charArray[z]){
                    missingOne = checkingArray[z];
                    break;
                }
            }
            return missingOne;
        }

        for (int i = 0; i < alphabet.length; i++) {
            if(charArray[0] == alphabet[i]){
                firstLetterPos = i;
            }
            if(charArray[charArray.length - 1] == alphabet[i]){
                lastLetterPos = i;
            }
        }

        checkingArraySize = lastLetterPos - firstLetterPos;
        checkingArray = new char[checkingArraySize];

        for (int j = firstLetterPos ; j < lastLetterPos; j++) {
            checkingArray[checker] = alphabet[j];
            checker++;
        }

        for (int z = 0; z < checkingArray.length; z++) {
            if(checkingArray[z] != charArray[z]){
                missingOne = checkingArray[z];
                break;
            }
        }

        return missingOne;
    }
}
