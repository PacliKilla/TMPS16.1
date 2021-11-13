package domain.RiverwoodInn_adapter;

public class PatternDemo {
    public static void main(String args[]) {
        Interface targetInterface = new InnOwner();
        targetInterface.giveInnDetails();
        System.out.print(targetInterface.getSeptimAmount());
    }
}