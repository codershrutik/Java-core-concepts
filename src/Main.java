

public class Main{
    public static void main(String[] args) {
        iPhone phone1 = new iPhone();
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

        Person p2 = new Person() {
            public void eat(){
                System.out.println("Eat food!");
            }
        };
    }
}