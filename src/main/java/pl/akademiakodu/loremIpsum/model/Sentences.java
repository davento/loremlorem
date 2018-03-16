package pl.akademiakodu.loremIpsum.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sentences {

    private String content;

    public Sentences(String content) {
        this.content = content;
    }

    private List<Sentences> allSentences(){ // male repository
        List<Sentences> list  = new ArrayList<>();
        return list;
    }

    public Sentences getRandom(){
        Random rnd = new Random();
        Sentences s = allSentences().get(rnd.nextInt(allSentences().size()));
        return s;
    }

    public List<Sentences> generate(int size){
        List<Sentences> list = new ArrayList<>();
        for (int i = 0; i <= size; i++){
            list.add(getRandom());
        }
        return list;
    }

}
