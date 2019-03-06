package pl.SpringLearning;

public class Main {
    public static void main(String[] args) {
        MessageProducer fileMessageProducer = new FileMessageProducer();
        MessagePrinter filePrinter = new MessagePrinter(fileMessageProducer);
        filePrinter.printMessage();

        MessageProducer simpleMessageProducer = new SimpleMessageProducer();
        MessagePrinter simplePrinter = new MessagePrinter(simpleMessageProducer);
        simplePrinter.printMessage();

    }
}
