package pl.SpringLearning.beans;

public class MessagePrinter {

    private MessageProducer producer;

    public MessagePrinter() {
    }

    public MessagePrinter(MessageProducer messageProducer){
        this.producer = messageProducer;
    }

    public void printMessage(){
        String message = producer.getMessage();
        System.out.println(message);
    }

    public MessageProducer getProducer() {
        return producer;
    }

    public void setProducer(MessageProducer producer) {
        this.producer = producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MessagePrinter that = (MessagePrinter) o;

        return producer != null ? producer.equals(that.producer) : that.producer == null;
    }

    @Override
    public int hashCode() {
        return producer != null ? producer.hashCode() : 0;
    }

}
