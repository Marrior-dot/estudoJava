public class Bit<T>{
    private int intToBinary;

    public Bit(int intToBinary){
        this.intToBinary = intToBinary;
    }

    public int bitCount(){
        int numberOf = 0;
        String strBin = Integer.toBinaryString(intToBinary);
        for (int i = 0; i < strBin.length(); i++) {
            if(strBin.charAt(i) == '1'){
                numberOf++;
            }
        }
        return numberOf;
    }
}