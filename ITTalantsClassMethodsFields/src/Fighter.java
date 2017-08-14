
public class Fighter {
	String name;
	double health = 100.0;
	int damage = 15;
	double reducedDamage = ((double) damage * 0.6);
	int criticalDamage = 2 * damage;
	private int counterHits = 0;
	private int counterBlocks = 0;
	private int counterCriticalHit = 0;

	void hit(Fighter enemy) {
		health -= enemy.damage;
		++counterHits;
		if (counterHits == 20) {
			counterHits = 0;
			counterBlocks = 0;
			counterCriticalHit = 0;
		}
	}

	void block(Fighter enemy) {
		if (counterBlocks != 6) {
			health -= enemy.reducedDamage;
			counterBlocks++;
		}

	}

	void criticalHit(Fighter enemy) {
		if (counterCriticalHit != 1) {
			health -= enemy.criticalDamage;
			counterCriticalHit++;
		}
	}
}
