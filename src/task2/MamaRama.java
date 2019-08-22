package task2;

import java.util.HashMap;
import java.util.Map;

public class MamaRama{
    public static void main(String[] args) {

        Map<String, Integer> mamaRama = new HashMap<>();
        mamaRama.put("\n m", 3);
        mamaRama.put("\n a", 4);
        mamaRama.put("\n m", 1);
        mamaRama.put("\n  ", 4);
        mamaRama.put("\n ы", 1);
        mamaRama.put("\n л", 1);
        mamaRama.put("\n р", 1);
        mamaRama.put("\n у", 1);

        System.out.println(mamaRama);

    }
}