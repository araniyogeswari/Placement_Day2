class Printer{
void print(String text)
{
System.out.println("Text:"+text);
}
void print(int number)
{
System.out.println("Number:"+number);
}
void print(double decimal)
{
System.out.println("Decimal:"+decimal);
}
}
class Printer_Main {
public static void main (String[] args){
    Printer p = new Printer();
    p.print("Arani Yogeswari");
    p.print(3003);
    p.print(3.14);
}
}