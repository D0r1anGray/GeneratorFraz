class GeneratorFraz{
	static public void main(String[] args){
		//Создание списков слов для генератора
		String[] podl = {"Жожек", "Нечаев", "Баб Зина",
		 "Сева", "Даня", "Cтас Ай как просто", "Лютик",
		  "Ёбаный пирог", "Геральт", "Плотва", "Грёбаный Пехтура",
		  "Робот-долбоёб"};
		String[] skaz = {"ел", "пел", "ахуевал", "скакал", "лгал",
		"срал", "мечтал", "фигачил", "ебашил", "кринжанул", "уснул",
		 "пиздел", "шёл в ананас"};
		String[] mesto = {"на заводе", "в сортире", "на речке", "на берегу",
		"в атомик харт", "в СССР", "в Оксенфурте", "на коробле", 
		"на СоловьёвLive", "на СтасLive"};
		String[] nar = {"ценой шизы", "опрометчиво", "хуёво", ",блять,", ",сука,", "хай Марк", "пиздец"};

		//Считаем количество элементов в каждом списке
		int kpodl = podl.length;
		int kskaz = skaz.length;
		int kmesto = mesto.length;
		int knar = nar.length;

		//Ставим рандом на выбор элемента из списков
		int rpodl = (int) (Math.random() * kpodl);
		int rskaz = (int) (Math.random() * kskaz);
		int rmesto = (int) (Math.random() * kmesto);
		int rnar = (int) (Math.random() * knar);

		//Строим фразу
		String fraz = podl[rpodl] + " " + nar[rnar] + " " + skaz[rskaz] + " " + 
		mesto[rmesto];

		//Выводим на экран фразу
		System.out.println("История началась, когда " + fraz);


	}
}