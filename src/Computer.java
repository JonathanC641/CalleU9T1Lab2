public class Computer {
    private int memory;
    private int screenSize;

    public Computer(int screenSize, int memory){
        this.screenSize = screenSize;
        this.memory = memory;
    }

    public int getMemory(){
        return memory;
    }
    public int getScreenSize(){
        return screenSize;
    }

    public void installOperatingSystem() {
        System.out.println("installing OS...");
    }
}
