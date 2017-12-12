package GameDevCompanyName.Game.Logic.Utilities;

public class Messages {

    //Фразы, используемые в бою
    private static final String CHARACTER_DODGED = " увернулся от удара.";
    private static final String CHARACTER_BLOCKED = " заблокировал удар.";
    private static final String CHARACTER_BLOCK_FAILED = " не смог заблокировать удар и получил урона: ";
    private static final String CHARACTER_DAMAGED = " получил урона: ";
    private static final String CHARACTER_MISTURN = " переводит дух и копит силы.";
    private static final String CHARACTER_IS_DEAD = " мёртв.";
    private static final String CHARACTER_BLOCKING = " ставит блок.";
    private static final String CHARACTER_UNABLE_TO_ACTION = " не может совершить это дейстие.";

    private static final String ACTION_FORBIDDEN_TARGET = "Невозможно применить к данной цели.";


    public static String getCharacterBlockFailed() {
        return CHARACTER_BLOCK_FAILED;
    }

    public static String getCharacterDamaged() {
        return CHARACTER_DAMAGED;
    }

    public static String getCharacterBlocked() {
        return CHARACTER_BLOCKED;
    }

    public static String getCharacterDodged() {
        return CHARACTER_DODGED;
    }

    public static String getCharacterMisturn() {
        return CHARACTER_MISTURN;
    }

    public static String getCharacterIsDead() {
        return CHARACTER_IS_DEAD;
    }

    public static String getCharacterBlocking() {
        return CHARACTER_BLOCKING;
    }

    public static String getCharacterUnableToAction() {
        return CHARACTER_UNABLE_TO_ACTION;
    }

    public static String getWrongTarget() {
        return ACTION_FORBIDDEN_TARGET;
    }
}
