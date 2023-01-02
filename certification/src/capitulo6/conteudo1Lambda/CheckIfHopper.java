package capitulo6.conteudo1Lambda;

public class CheckIfHopper implements CheckTrait {
	public boolean test(Animal a) {
		return a.canHop();
	}
}
