package Assignment;

public class output {
	
	        private String name;
			private String discription;
	        private String strategies;

	        public output(String name, String description, String strategies) {
	            this.name = name;
	            this.discription = description;
	            this.strategies = strategies;
	        }
		
		
		public String Name() {
			return name;
		}
		
		public String Disc() {
			return discription;
		}
		
		public String Stra() {
			return strategies;
		}
		
		public static void disaster(String name, String disc, String stra) {
			disaster.add(new output(name,disc,stra));
		}
		
		public static void out() {
			System.out.println("========================");
			System.out.println("Name:");
			System.out.println("Discription: ");
			System.out.println("Strategy: ");
			System.out.println("========================");
			
		}
}
	        

