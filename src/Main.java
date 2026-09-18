public class Main {
    public static void main(String[] args) {
        PowerOutlet[] devices = {
            new LaptopAdapter(new Laptop()),
            new RefrigeratorAdapter(new Refrigerator()),
            new SmartphoneAdapter(new SmartphoneCharger())
        };

        for (PowerOutlet device : devices) {
            device.plugIn();
        }
    }
}