import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TDDTest {


    Poker poker = new Poker();
    PokerApp pokerApp = new PokerApp();

    @Test
    public void should_return_poker2_when_call_playgame_function_given_2D_and_3D(){

        Poker poker1 = new Poker(2,"D");
        Poker poker2 = new Poker(3,"D");
        Assert.assertEquals(poker2,pokerApp.playgame(poker1,poker2));
    }

    @Test
    public void should_return_null_when_call_playgame_function_given_2D_and_2H(){

        Poker poker1 = new Poker(3,"D");
        Poker poker2 = new Poker(3,"H");
        Assert.assertEquals(null,pokerApp.playgame(poker1,poker2));
    }

    @Test
    public void should_return_poker2_when_call_playgame_function_given_3D3H_and_2D3H(){

//        List<Poker> pokerList1 = createPokerList(new Poker(2,"D"),new Poker(3,"D"),new Poker(4,"D"),new Poker(5,"D"),new Poker(6,"D"));
//        List<Poker> pokerList2 = createPokerList(new Poker(2,"D"),new Poker(3,"D"),new Poker(4,"D"),new Poker(5,"D"),new Poker(7,"D"));
        List<Poker> pokerList1 = new ArrayList<>();
        List<Poker> pokerList2 = new ArrayList<>();
        pokerList1.add(new Poker(2,"D"));
        pokerList1.add(new Poker(3,"H"));
        pokerList2.add(new Poker(3,"D"));
        pokerList2.add(new Poker(3,"H"));
        Assert.assertEquals(pokerList2,pokerApp.playgame(pokerList1,pokerList2,2));
    }

    @Test
    public void should_return_null_when_call_playgame_function_given_3D3H_and_2D3H(){

//        List<Poker> pokerList1 = createPokerList(new Poker(2,"D"),new Poker(3,"D"),new Poker(4,"D"),new Poker(5,"D"),new Poker(6,"D"));
//        List<Poker> pokerList2 = createPokerList(new Poker(2,"D"),new Poker(3,"D"),new Poker(4,"D"),new Poker(5,"D"),new Poker(7,"D"));
        List<Poker> pokerList1 = new ArrayList<>();
        List<Poker> pokerList2 = new ArrayList<>();
        pokerList1.add(new Poker(3,"D"));
        pokerList1.add(new Poker(3,"H"));
        pokerList2.add(new Poker(3,"C"));
        pokerList2.add(new Poker(3,"S"));
        Assert.assertEquals(null,pokerApp.playgame(pokerList1,pokerList2,2));
    }



    private List<Poker> createPokerList(Poker poker1,Poker poker2,Poker poker3,Poker poker4,Poker poker5){
        List<Poker> pokerList = new ArrayList<>();
        pokerList.add(poker1);
        pokerList.add(poker2);
        pokerList.add(poker3);
        pokerList.add(poker4);
        pokerList.add(poker5);
        return pokerList;
    }

}
