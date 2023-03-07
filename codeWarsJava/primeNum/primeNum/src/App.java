public class App {
    public static void main(String[] args) {

        prime tryPrime = new prime(11);
        System.out.println(tryPrime.isPrime());
        prime tryPrime2 = new prime(0);
        System.out.println(tryPrime2.isPrime());
        prime tryPrime3 = new prime(1);
        System.out.println(tryPrime3.isPrime());
        prime tryPrime4 = new prime(2);
        System.out.println(tryPrime4.isPrime());
        prime tryPrime5 = new prime(73);
        System.out.println(tryPrime5.isPrime());
        prime tryPrime6 = new prime(75);
        System.out.println(tryPrime6.isPrime());
        prime tryPrime7 = new prime(-1);
        System.out.println(tryPrime7.isPrime());
        prime tryPrime8 = new prime(45);
        System.out.println(tryPrime8.isPrime());
        prime tryPrime9 = new prime(-8);
        System.out.println(tryPrime9.isPrime());
        prime tryPrime10 = new prime(4);
        System.out.println(tryPrime10.isPrime());
    }
}
