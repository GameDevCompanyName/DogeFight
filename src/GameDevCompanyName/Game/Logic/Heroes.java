package GameDevCompanyName.Game.Logic;

import java.util.ArrayList;
import java.util.List;

public class Heroes {

    private static List<Character> heroes = new ArrayList<>();

    public static List<Character> getHeroes(){
        heroes.add(new Character("...",
                "Dogger",
                10,
                10,
                10,
                100,
                100));
        heroes.add(new Character("...",
                "PESEL'",
                10,
                10,
                10,
                100,
                100));
        return heroes;
    }

}
