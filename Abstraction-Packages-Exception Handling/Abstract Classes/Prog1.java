/*
1.1. Create a class called GeneralBank which acts as base class for all banks. This class has functionality getSavingInterestRate and getFixedInterestRate methods, which return the saving a/c rate of interest and fixed account rate of interest the specific bank gives. Since GeneralBank cannot say what percentage which bank would give, make it abstract.

1.2. Create 2 subclasses of GeneralBank called ICICIBank and KotMBank. Override the methods from base class. ICICI - Savings 4% Fixed 8.5% and KotMBank.  - Savings 6% Fixed 9%

1.3. Create a main method to test the above classes. Try one by one and absorb your finding.
a) ICICIBank object reference instantiated with ICICIBank class.
b) KotMBank object reference instantiated with KotMBank class.
c) GeneralBank object reference instantiated with KotMBank class.
d) GeneralBank object reference instantiated with ICICIBank class.
*/

abstract class GeneralBank {
    public abstract double getSavingInterestRate();
    public abstract double getFixedInterestRate();
}

class ICICIBank extends GeneralBank {
    public double getSavingInterestRate() { return 0.04; }

    public double getFixedInterestRate() { return 0.085; }
}

class KotMBank extends GeneralBank {
    public double getSavingInterestRate() { return 0.06; }

    public double getFixedInterestRate() { return 0.09; }
}

class Test {
    public static void main(String[] args) {
        ICICIBank ic = new ICICIBank();
        KotMBank kot = new KotMBank();
        System.out.println(ic.getSavingInterestRate()*100 + "%");
        System.out.println(ic.getFixedInterestRate()*100 + "%");
        System.out.println(kot.getSavingInterestRate()*100 + "%");
        System.out.println(kot.getFixedInterestRate()*100 + "%");
        GeneralBank gb1 = new ICICIBank();
        GeneralBank gb2 = new KotMBank();
        System.out.println(gb1.getSavingInterestRate()*100 + "%");
        System.out.println(gb1.getFixedInterestRate()*100 + "%");
        System.out.println(gb2.getSavingInterestRate()*100 + "%");
        System.out.println(gb2.getFixedInterestRate()*100 + "%");
    }
}