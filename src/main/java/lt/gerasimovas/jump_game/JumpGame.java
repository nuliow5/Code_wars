package lt.gerasimovas.jump_game;

public class JumpGame {
    public static void main(String[] args) {
        int[] jumpMap = {2, 3, 1, 1, 4}; //true
        int[] jumpMap2 = {3, 2, 1, 0, 4}; //true

        System.out.println(passageMap(jumpMap2));

    }

    public static Boolean passageMap(int[] gameMap) {
        int x = 0;
        int move = gameMap[x];

        while (true) {
            x = x + move;
            if (x > gameMap.length || move == 0){
                return false;
            }
            move = gameMap[x];

            if (x == gameMap.length - 1) {
                return true;
            }

        }

    }


}
