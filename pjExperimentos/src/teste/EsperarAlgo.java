package teste;

public class EsperarAlgo {

	public void esperaAlgo() {
		Orcamento o = new Orcamento();
		synchronized (o) {
			//o.wait();
			o.notify();         
		}
	}

}
