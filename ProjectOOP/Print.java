
class Print {
		public String delimiter = "";
		public Print(String delimiter) {//클레스와 이름이 메서드로 정의-> 생성자.
			this.delimiter=delimiter;
		}
		public void A() {
			System.out.println(this.delimiter);
			System.out.println("A");
			System.out.println("A");
		}
		
		public void B() {
			System.out.println(this.delimiter);
			System.out.println("B");
			System.out.println("B");
		}
}