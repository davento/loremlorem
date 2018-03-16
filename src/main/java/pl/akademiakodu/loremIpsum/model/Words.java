package pl.akademiakodu.loremIpsum.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Words {

    private String content;

    public Words(String content) {
        this.content = content;
    }

    private List<Words> allWords(){ // male repository
        List<Words> list  = new ArrayList<>();
        return list;
    }

    public Words getRandom(){
        Random rnd = new Random();
        Words w = allWords().get(rnd.nextInt(allWords().size()));
        return w;
    }

    public List<Words> generate(int size){
        List<Words> list = new ArrayList<>();
        for (int i = 0; i <= size; i++){
            list.add(getRandom());
        }
        return list;
    }


}
