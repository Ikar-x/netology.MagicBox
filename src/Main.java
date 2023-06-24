public class Main {
    public static void main(String[] args) {

        MagicBox<String> mbs = new MagicBox<>(3);
        mbs.add("один");
        mbs.add("два");
        mbs.add("три");
        System.out.println(mbs.pick());
        MagicBox<Integer> mbi = new MagicBox<>(3);
        mbi.add(1);
        mbi.add(2);
        mbi.add(3);
        System.out.println(mbi.pick());

    }
}