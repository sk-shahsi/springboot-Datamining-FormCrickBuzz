public class TestAnonimas {
    public static void main(String[] args) {
        Anonimas an = new Anonimas() {
            @Override
            public void show() {
                System.out.println("Anonimas class printed");
            }

            @Override
            public void printnum(int x) {

                System.out.println(x);
            }
        };
        an.show();
        an.printnum(5);
    }
}
