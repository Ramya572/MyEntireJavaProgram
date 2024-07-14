package encapsulation;

class Amazon_prog {
private String un="contact@grotechminds.com";
	
		public String getUn() {
			return un;
		}
		public void setUn(String un) {
			this.un=un;
		}
}
class Encapsulation_prog{
	public static void main(String[] args) {
		Amazon_prog a=new Amazon_prog();
		a.setUn("stmkt@grotechminds.com");
		System.out.println(a.getUn());
	}
}