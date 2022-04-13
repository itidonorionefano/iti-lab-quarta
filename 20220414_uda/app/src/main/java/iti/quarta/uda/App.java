package iti.quarta.uda;

public class App {
    public static void main(String[] args) {
        for (String port : SerialPortList.getPortNames()) {
            System.out.println(port);
        }
    }
}
