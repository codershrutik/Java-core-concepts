

public class Main{
    public static void main(String[] args) {
        // iPhone phone1 = new iPhone();
        // String p = phone1.processor();
        // System.out.println(p);

        // iPhone phone2 = new iPhone();
        // String i = phone2.processor();
        // System.out.println(i);
        // System.out.println(phone1.airdrop());

        // Person john = new John();
        // john.eat();
        // john.speak();

        // Person pooja = new Pooja();
        // pooja.eat();
        // pooja.speak();

        // Person p2 = new Person() {
        //     public void eat(){
        //         System.out.println("Eat food!");
        //     }
        // };

        // Shop shop = new Shop();
        // shop.shopStatus();
        // shop.getLock();
        

        // Lock lock = new Lock();
        // if(lock.getCode() == "123456789"){
        //     System.out.println("The door is now open");
        // } else{
        //     System.out.println("the door is closed");
        // }

  	//Outer outer = new Outer();
	// outer.Inner.message();

	// Child child = new Child(3);
	// System.out.println(child.getX());
	// // child.setX(99);
	// Child child2 = new Child(102);
	// System.out.println(child.getX());

	// Child child = new Child();
	// child.India();
	// child.USA();
	// Main main = new Main();
	// main.case1(10, 5);
	// main.case2(10, 0);

	int x;
	int y=0;

	// try {
	// 	System.out.println("before exception");
	// 	x=(y=10*10)/0;
	// 	System.out.println("after exception");
	// } catch (ArithmeticException e) {
	// 	System.out.println("arithmatic exception");
	// } catch (Exception e){
	// 	System.out.println("exception");
	// } finally{
	// 	System.out.println(y);
	// }
	Main main = new Main();
	// try{
	// 	main.doSomething();
	// } catch(FileNotFoundException e){
	// 	e.printStackTrace();
	// }
	try {
		main.doSomething();
	} finally{
		System.out.println("Meh");
	}
	
    }
	public void doSomething() throws FileNotFoundException{
		// FileReader in = new FileReader("text.txt");
		// System.out.println("Do something!");
		String x = "zero";
		if(x.equals("zero")){
			throw new RuntimeException();
		}
		System.out.println("Do something!");
	}

	// public void case1(int x, int y){
	// 	if(y!=0){
	// 		System.out.println("x/y="+(x/y));
	// 	} else{
	// 		System.out.println("The value of y is 0, a possible exception");
	// 	}
	// }

	// public void case2(int x, int y){
	// 	try {
	// 		System.out.println("x/y="+(x/y));
	// 	} catch (Exception e) {
	// 		System.out.println("The value of y is 0, a possible exception"+e);
	// 	}
	// }
}
