package teste;

public class ReceberValor<X extends Object> {    
    private X x;
    
    public ReceberValor(X x) {
        this.x = x;
    }
    
    private double getDouble() {
        return ((Double) x).doubleValue();
    }
    
    public static void main(String args[]) {
    	ReceberValor<Double> a = new ReceberValor<Double>(2.0);
        System.out.print(a.getDouble());
    }
}