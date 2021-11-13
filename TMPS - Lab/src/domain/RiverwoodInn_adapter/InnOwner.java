package domain.RiverwoodInn_adapter;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class InnOwner extends InnDetails implements Interface {
    public void giveInnDetails(){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Customer Name:");
            String customername=br.readLine();
            System.out.print("\n");

            System.out.print("Enter the amount of septim: ");
            long septim=Long.parseLong(br.readLine());
            System.out.print("\n");

            System.out.print("Enter the Inn name: ");
            String bankname=br.readLine();

            setCustomerName(customername);
            settCustomerAmount(septim);
            setInnName(bankname);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public String getSeptimAmount() {
        long septim= getCustomerAmount();
        String accholdername=getCustomerName();
        String bname=getInnName();

        return ("The septim amount of "+septim+" of "+accholdername+" for "+bname+ " is enough to sleep a night. ");
    }
}