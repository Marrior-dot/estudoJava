public class Main{
    public static void main(String[] args){

        No no1 = new No("Cont1");
        No no2 = new No("Cont2");
        No no3 = new No("Cont3");
        No no4 = new No("Cont4");

        no1.setNextNo(no2);
        no2.setNextNo(no3);
        no3.setNextNo(no4);

        System.out.println(no1.getNextNo());
        System.out.println(no1.getNextNo().getNextNo());
        System.out.println(no1.getNextNo().getNextNo().getNextNo());
        System.out.println(no1.getNextNo().getNextNo().getNextNo().getNextNo());

}
}