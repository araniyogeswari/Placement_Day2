 interface Printable {
    void printDocument();
 }
 interface Scannable {
    void scanDocument();
 }
 class SmartPrinter implements Printable, Scannable {
    @Override
    public void printDocument() {
        System.out.println("Printing document...");
    }
    @Override
    public void scanDocument() {
        System.out.println("Scanning document...");
    }
 }
class Task_15 {
    public static void main(String[] args) {
        SmartPrinter printer = new SmartPrinter();
        printer.printDocument();
        printer.scanDocument();
    }
}