package DP.Comportamentale.Template;

public class EvaluareDauneBucatarie extends AEvaluareDaune{

	@Override
	void evaluareInitialaDauna() {
		System.out.println("Evaluare initiala dauna bucatarie");
	}

	@Override
	void trimitereEvaluareManager() {
		System.out.println("Trimitere evaluare daune bucatarie spre manager");
	}
}
