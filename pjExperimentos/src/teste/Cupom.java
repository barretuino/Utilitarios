package teste;

class Cumpom {
    public Cumpom() {
        System.out.print("a ");
    }
}

class Cumpom2  extends Cumpom {
    public Cumpom2() {
        System.out.print("b ");
    }
}

class Cumpom3 extends Cumpom2 {
    public Cumpom3() {
        System.out.print("c ");
    }
}