public class Cars {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.PrintInfo();

        Engine engine_v12 = new Engine(2000);
        engine_v12.PrintInfo();

        Engine engine_v8 = new Engine(2003);
        engine_v8.PrintInfo();

        Engine engine_v6 = new Engine(800);
        engine_v6.PrintInfo();

    }
}
