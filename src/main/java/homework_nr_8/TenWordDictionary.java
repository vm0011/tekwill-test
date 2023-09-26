package homework_nr_8;

import java.util.HashMap;

public class TenWordDictionary {
    HashMap<String,String> words = new HashMap<>();

    public void prepare() {
        words.put("time","timp, oră");
        words.put("is","este, a fi");
        words.put("money","bani");
        words.put("open","deschide");
        words.put("mind","minte, gândire");
        words.put("wide","larg");
        words.put("for","pentru");
        words.put("knowledge","cunoștințe");
    }

    public void translateWord(String word){
        prepare();
        System.out.println(word + " - (eng to ro): " + words.get(word));
    }
}
