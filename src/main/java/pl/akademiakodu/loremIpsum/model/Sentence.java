package pl.akademiakodu.loremIpsum.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sentence {

    private String content;

    public Sentence(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private List<Sentence> allSentences(){ // male repository
        List<Sentence> list  = new ArrayList<>();
        list.add(new Sentence("bleble bleble bleble1"));
        list.add(new Sentence("bleble bleble bleble2"));
        list.add(new Sentence("bleble bleble bleble3"));

        return list;
    }

    public Sentence getRandom(){
        Random rnd = new Random();
        Sentence s = allSentences().get(rnd.nextInt(allSentences().size()));
        return s;
    }

    public List<Sentence> generate(int size){
        List<Sentence> list = new ArrayList<>();
        for (int i = 1; i <= size; i++){
            list.add(getRandom());
        }
        return list;
    }
}
