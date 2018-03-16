package pl.akademiakodu.loremIpsum.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Word {

    private String content;

    public Word(String content) {
        this.content = content;
    }

    private List<Word> allWords(){ // male repository
        List<Word> list  = new ArrayList<>();
        list.add(new Word("word1"));
        list.add(new Word("word2"));
        list.add(new Word("word3"));
        return list;
    }

    public Word getRandom(){
        Random rnd = new Random();
        Word w = allWords().get(rnd.nextInt(allWords().size()));
        return w;
    }

    public List<Word> generate(int size){
        List<Word> list = new ArrayList<>();
        for (int i = 0; i <= size; i++){
            list.add(getRandom());
        }
        return list;
    }


}
