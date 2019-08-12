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

        List<Poker> pokerList1 = new ArrayList<>();
        List<Poker> pokerList2 = new ArrayList<>();
        pokerList1.add(new Poker(3,"D"));
        pokerList1.add(new Poker(3,"H"));
        pokerList2.add(new Poker(3,"C"));
        pokerList2.add(new Poker(3,"S"));
        Assert.assertEquals(null,pokerApp.playgame(pokerList1,pokerList2,2));
    }

    @Test
    public void should_return_poker2_when_call_playgame_function_given_2C3H4C7H8C_and_2D3S4D8S9D(){

        List<Poker> pokerList1 = createPokerList(new Poker(2,"C"),new Poker(3,"H"),new Poker(4,"C"),new Poker(7,"H"),new Poker(8,"C"));
        List<Poker> pokerList2 = createPokerList(new Poker(2,"D"),new Poker(3,"S"),new Poker(4,"D"),new Poker(8,"S"),new Poker(9,"D"));
        Assert.assertEquals(pokerList2,pokerApp.playgame(pokerList1,pokerList2,5));
    }

    @Test
    public void should_return_poker2_when_call_playgame_function_given_2C3H4C7H8C_and_2D3S4D7S8D(){

        List<Poker> pokerList1 = createPokerList(new Poker(2,"C"),new Poker(3,"H"),new Poker(4,"C"),new Poker(7,"H"),new Poker(8,"C"));
        List<Poker> pokerList2 = createPokerList(new Poker(2,"D"),new Poker(3,"S"),new Poker(4,"D"),new Poker(7,"S"),new Poker(8,"D"));
        Assert.assertEquals(null,pokerApp.playgame(pokerList1,pokerList2,5));
    }

    @Test
    public void should_return_poker2_when_call_playgame_function_given_2C3H4C7H8C_and_2D3S4D7S7D(){

        List<Poker> pokerList1 = createPokerList(new Poker(2,"C"),new Poker(3,"H"),new Poker( 4,"C"),new Poker(7,"H"),new Poker(8,"C"));
        List<Poker> pokerList2 = createPokerList(new Poker(2,"D"),new Poker(3,"S"),new Poker(4,"D"),new Poker(7,"S"),new Poker(7,"D"));
        Assert.assertEquals(pokerList2,pokerApp.playgame(pokerList1,pokerList2,5));
    }

    @Test
    public void should_return_null_when_call_playgame_function_given_2C3H4C7H7C_and_2D3S4D7S7D(){

        List<Poker> pokerList1 = createPokerList(new Poker(2,"C"),new Poker(3,"H"),new Poker(4,"C"),new Poker(7,"H"),new Poker(7,"C"));
        List<Poker> pokerList2 = createPokerList(new Poker(2,"D"),new Poker(3,"S"),new Poker(4,"D"),new Poker(7,"S"),new Poker(7,"D"));
        Assert.assertEquals(null,pokerApp.playgame(pokerList1,pokerList2,5));
    }

    @Test
    public void should_return_poker2_when_call_playgame_function_given_2C3H4C7H7C_and_2D3S5D7S7D(){

        List<Poker> pokerList1 = createPokerList(new Poker(2,"C"),new Poker(3,"H"),new Poker(4,"C"),new Poker(7,"H"),new Poker(7,"C"));
        List<Poker> pokerList2 = createPokerList(new Poker(2,"D"),new Poker(3,"S"),new Poker(5,"D"),new Poker(7,"S"),new Poker(7,"D"));
        Assert.assertEquals(pokerList2,pokerApp.playgame(pokerList1,pokerList2,5));
    }

    @Test
    public void should_return_poker2_when_call_playgame_function_given_2C3H3C4H4C_and_2D3S3D5S5D(){

        List<Poker> pokerList1 = createPokerList(new Poker(2,"C"),new Poker(3,"H"),new Poker(3,"C"),new Poker(4,"H"),new Poker(4,"C"));
        List<Poker> pokerList2 = createPokerList(new Poker(2,"D"),new Poker(3,"S"),new Poker(3,"D"),new Poker(5,"S"),new Poker(5,"D"));
        Assert.assertEquals(pokerList2,pokerApp.playgame(pokerList1,pokerList2,5));
    }

    @Test
    public void should_return_poker2_when_call_playgame_function_given_2C4H4C5H5C_and_3D4S4D5S5D(){

        List<Poker> pokerList1 = createPokerList(new Poker(2,"C"),new Poker(4,"H"),new Poker(4,"C"),new Poker(5,"H"),new Poker(5,"C"));
        List<Poker> pokerList2 = createPokerList(new Poker(3,"D"),new Poker(4,"S"),new Poker(4,"D"),new Poker(5,"S"),new Poker(5,"D"));
        Assert.assertEquals(pokerList2,pokerApp.playgame(pokerList1,pokerList2,5));
    }

    @Test
    public void should_return_poker2_when_call_playgame_function_given_2C4H4C5H6C_and_3D4S4D5S5D(){

        List<Poker> pokerList1 = createPokerList(new Poker(2,"C"),new Poker(4,"H"),new Poker(4,"C"),new Poker(5,"H"),new Poker(6,"C"));
        List<Poker> pokerList2 = createPokerList(new Poker(3,"D"),new Poker(4,"S"),new Poker(4,"D"),new Poker(5,"S"),new Poker(5,"D"));
        Assert.assertEquals(pokerList2,pokerApp.playgame(pokerList1,pokerList2,5));
    }

    @Test
    public void should_return_poker2_when_call_playgame_function_given_2C3H4C5H7C_and_3D4S4D5S5D(){

        List<Poker> pokerList1 = createPokerList(new Poker(2,"C"),new Poker(3,"H"),new Poker(4,"C"),new Poker(5,"H"),new Poker(7,"C"));
        List<Poker> pokerList2 = createPokerList(new Poker(3,"D"),new Poker(4,"S"),new Poker(4,"D"),new Poker(5,"S"),new Poker(5,"D"));
        Assert.assertEquals(pokerList2,pokerApp.playgame(pokerList1,pokerList2,5));
    }

    @Test
    public void should_return_poker2_when_call_playgame_function_given_2C3H3C5H5C_and_3D4S5D5S5D(){

        List<Poker> pokerList1 = createPokerList(new Poker(2,"C"),new Poker(3,"H"),new Poker(3,"C"),new Poker(5,"H"),new Poker(5,"C"));
        List<Poker> pokerList2 = createPokerList(new Poker(3,"D"),new Poker(4,"S"),new Poker(5,"D"),new Poker(5,"S"),new Poker(5,"D"));
        Assert.assertEquals(pokerList2,pokerApp.playgame(pokerList1,pokerList2,5));
    }

    @Test
    public void should_return_poker2_when_call_playgame_function_given_2C3H4C5H6C_and_3D4S5D5S5D(){

        List<Poker> pokerList1 = createPokerList(new Poker(2,"C"),new Poker(3,"H"),new Poker(4,"C"),new Poker(5,"H"),new Poker(6,"C"));
        List<Poker> pokerList2 = createPokerList(new Poker(3,"D"),new Poker(4,"S"),new Poker(5,"D"),new Poker(5,"S"),new Poker(5,"D"));
        Assert.assertEquals(pokerList1,pokerApp.playgame(pokerList1,pokerList2,5));
    }

    @Test
    public void should_return_poker2_when_call_playgame_function_given_2C3H4C5H6C_and_3D4S5D6S7D(){

        List<Poker> pokerList1 = createPokerList(new Poker(2,"C"),new Poker(3,"H"),new Poker(4,"C"),new Poker(5,"H"),new Poker(6,"C"));
        List<Poker> pokerList2 = createPokerList(new Poker(3,"D"),new Poker(4,"S"),new Poker(5,"D"),new Poker(6,"S"),new Poker(7,"D"));
        Assert.assertEquals(pokerList2,pokerApp.playgame(pokerList1,pokerList2,5));
    }

    @Test
    public void should_return_poker2_when_call_playgame_function_given_2C3C4C5C9C_and_3D4S5D6S7D(){

        List<Poker> pokerList1 = createPokerList(new Poker(2,"C"),new Poker(3,"C"),new Poker(4,"C"),new Poker(5,"C"),new Poker(9,"C"));
        List<Poker> pokerList2 = createPokerList(new Poker(3,"D"),new Poker(4,"S"),new Poker(5,"D"),new Poker(6,"S"),new Poker(7,"D"));
        Assert.assertEquals(pokerList1,pokerApp.playgame(pokerList1,pokerList2,5));
    }

    @Test
    public void should_return_poker2_when_call_playgame_function_given_2C3C4C5C9C_and_3D4D5D6D9D(){

        List<Poker> pokerList1 = createPokerList(new Poker(2,"C"),new Poker(3,"C"),new Poker(4,"C"),new Poker(5,"C"),new Poker(9,"C"));
        List<Poker> pokerList2 = createPokerList(new Poker(3,"D"),new Poker(4,"D"),new Poker(5,"D"),new Poker(6,"D"),new Poker(9,"D"));
        Assert.assertEquals(pokerList2,pokerApp.playgame(pokerList1,pokerList2,5));
    }

    @Test
    public void should_return_poker2_when_call_playgame_function_given_2C2D3H3S3D_and_4D5D6D7D9D(){

        List<Poker> pokerList1 = createPokerList(new Poker(2,"C"),new Poker(2,"D"),new Poker(3,"H"),new Poker(3,"S"),new Poker(3,"D"));
        List<Poker> pokerList2 = createPokerList(new Poker(4,"D"),new Poker(5,"D"),new Poker(6,"D"),new Poker(7,"D"),new Poker(9,"D"));
        Assert.assertEquals(pokerList1,pokerApp.playgame(pokerList1,pokerList2,5));
    }

    @Test
    public void should_return_poker2_when_call_playgame_function_given_2C2D3H3S3D_and_4D4C5D5C5H(){

        List<Poker> pokerList1 = createPokerList(new Poker(2,"C"),new Poker(2,"D"),new Poker(3,"H"),new Poker(3,"S"),new Poker(3,"D"));
        List<Poker> pokerList2 = createPokerList(new Poker(4,"D"),new Poker(4,"C"),new Poker(5,"D"),new Poker(5,"C"),new Poker(5,"H"));
        Assert.assertEquals(pokerList2,pokerApp.playgame(pokerList1,pokerList2,5));
    }

    @Test
    public void should_return_poker2_when_call_playgame_function_given_2C3S3H3S3D_and_4D4C5D5C5H(){

        List<Poker> pokerList1 = createPokerList(new Poker(2,"C"),new Poker(3,"S"),new Poker(3,"H"),new Poker(3,"S"),new Poker(3,"D"));
        List<Poker> pokerList2 = createPokerList(new Poker(4,"D"),new Poker(4,"C"),new Poker(5,"D"),new Poker(5,"C"),new Poker(5,"H"));
        Assert.assertEquals(pokerList1,pokerApp.playgame(pokerList1,pokerList2,5));
    }

    @Test
    public void should_return_poker2_when_call_playgame_function_given_2C3S3H3S3D_and_4D5S5D5C5H(){

        List<Poker> pokerList1 = createPokerList(new Poker(2,"C"),new Poker(3,"S"),new Poker(3,"H"),new Poker(3,"S"),new Poker(3,"D"));
        List<Poker> pokerList2 = createPokerList(new Poker(4,"D"),new Poker(5,"S"),new Poker(5,"D"),new Poker(5,"C"),new Poker(5,"H"));
        Assert.assertEquals(pokerList2,pokerApp.playgame(pokerList1,pokerList2,5));
    }

    @Test
    public void should_return_poker2_when_call_playgame_function_given_2C3C4C5C6C_and_4D5S5D5C5H(){

        List<Poker> pokerList1 = createPokerList(new Poker(2,"C"),new Poker(3,"C"),new Poker(4,"C"),new Poker(5,"C"),new Poker(6,"C"));
        List<Poker> pokerList2 = createPokerList(new Poker(4,"D"),new Poker(5,"S"),new Poker(5,"D"),new Poker(5,"C"),new Poker(5,"H"));
        Assert.assertEquals(pokerList1,pokerApp.playgame(pokerList1,pokerList2,5));
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
