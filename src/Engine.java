class Engine {
    private float volume; //Объем двигателя в кубических сантиметрах
    private float weight; //Вес двигателя

    public void PrintInfo() {
        System.out.println("--- Информация о двигателе ---");
        if (volume <= 0) {
            System.out.println("\tВнимание! Двигатель не исправен!");
        }
        System.out.println(String.format("\tОбъем двигателя: %.3f", volume));
        System.out.println("------------------------------");
    }

    public Engine() {
        this.setVolume(0);
    }

    public Engine(float volume) {
        this.setVolume(volume);
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getWeight() {
        return weight;
    }
}
