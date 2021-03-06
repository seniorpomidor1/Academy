package HW1;

public class Cat {
		private int age;
		private String nickname;
		private int initials;
		private int isHomeAnimal;
		
		public Cat() {
			super();
		}
		public Cat(int age) {
			super();
			this.age = age;
		}

		public Cat(int age, String nickname, int initials, int isHomeAnimal) {
			super();
			this.age = age;
			this.nickname = nickname;
			this.initials = initials;
			this.setIsHomeAnimal(isHomeAnimal);
		}

		public int getGrow() {
			System.out.println("Кот растет :" + nickname);
			return age;
		}

		public int[] getSleep() {
			System.out.println("Кот спит :" + nickname);
			return null;
		}

		public int[] getEat() {
			System.out.println("Кот ест :" + nickname);
			return null;
		}

		public int[] getNickname() {
			System.out.println("Имя кота :" + nickname);
			return null;
		}
		public int[] getWalk() {
			System.out.println("Кот гуляет :" + nickname);
			return null;
		}
		public int getInitial() {
			System.out.println("S-superman");
			return initials;
		}
		public int getIsHomeAnimal() {
			System.out.println("IsHomeAnimal - Yes");
			return isHomeAnimal;
		}
		public void setIsHomeAnimal(int isHomeAnimal) {
			this.isHomeAnimal = isHomeAnimal;
		}
	}