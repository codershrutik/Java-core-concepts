public class Main{
    public static void main(String[] args) {
        Samsung phone1 = new Samsung();
        String p = phone1.processor();
        System.out.println(p);

        iPhone phone2 = new iPhone();
        String i = phone2.processor();
        System.out.println(i);
    }
}