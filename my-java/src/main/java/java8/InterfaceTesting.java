package java8;

public class InterfaceTesting {
    public static void main(String[] args) {
	I k = new K();

    }
}

interface I {
    static void how() {
	System.out.println("I");
    }
}

interface J {
    static void how() {
	System.out.println("J");
    }
}

class K implements I, J {

}