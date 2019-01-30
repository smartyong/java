import java.util.ArrayList;
import java.util.List;

public class StrategyTest {

	public static void main(String[] args) {
		
		Order order=new Order();
		List<Iterm> iterms =new ArrayList<Iterm>();
		Iterm iterm1=new Iterm("orange", 100.00, new HappyPriceStrategy());
		Iterm iterm2=new Iterm("apple",200.00,new NomalPriceStrategy());
		iterms.add(iterm1);
		iterms.add(iterm2);
		order.setIterms(iterms);
		Double totalPrice=0.0;
        for (Iterm iterm : iterms) {
        	totalPrice=totalPrice+iterm.getPriceStrategy().getPrice(iterm.getPrice());
		}
		System.out.println("Order totalPrice is:"+totalPrice);
		
	}

}
