import java.util.List;

public class PokerApp {
    private Poker poker;
    PokerApp(){
        this.poker = new Poker();
    }

    public Poker playgame(Poker poker1,Poker poker2){
        if(poker1.getNumber()>poker2.getNumber())
            return poker1;
        if(poker1.getNumber()<poker2.getNumber())
            return poker2;
        else
            return null;
    }

    public List<Poker> playgame(List<Poker> pokerList1,List<Poker> pokerList2){
        for(int i = 4; i>0; i--){
            if (pokerList1.get(i).getNumber() > pokerList2.get(i).getNumber())
                return pokerList1;
            if (pokerList1.get(i).getNumber() < pokerList2.get(i).getNumber())
                return pokerList2;
        }
        return null;
    }
}
