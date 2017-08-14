package Misc;

import java.util.Random;

public class Generator {
	
	Random r = new Random();
	private String[] first = {
			"Тайчо",
			"Гиргозар",
			"Годзила",
			"Евстати",
			"Тина",
			"Дриско",
			"Пешо",
			"Евлоги"
	};
	
	private String[] surname = {
			"Тайчев",
			"Георгиев",
			"Портокалов",
			"Хайверов",
			"Тоалетков",
			"Поаков",
			"Повръщиян",
			"Торосян"
	};
	
	private String[] medicines = {
			"Алказалцер",
			"Аспирин",
			"Прескурин",
			"Диарин",
			"Кракозараствалин Плюс Ултра",
			"Простанол Уно"
	};
	
	public String genName(){
		int first = r.nextInt(8);
		int second = r.nextInt(8);
		
		return this.first[first] + " " + this.surname[second];
	}
	
	public String genDiagnosis(){
		int guess = r.nextInt(3) + 1;
		
		switch(guess){
		case 1:
			return "Кардиологичен случай";
		case 2:
			return "Вирусологичен случай";
		default:
			return "Ортопедичен случай";
		}
	}
	
	public String getMedicines(){
		return medicines[r.nextInt(6)];
	}

}
