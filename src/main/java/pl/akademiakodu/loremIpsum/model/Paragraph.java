package pl.akademiakodu.loremIpsum.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Paragraph {

    private String content;

    public Paragraph(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private List<Paragraph> allParagraphs(){
        List<Paragraph> list  = new ArrayList<>();
        list.add(new Paragraph("paragraph1"));
        list.add(new Paragraph("paragraph2"));
        list.add(new Paragraph("paragraph3"));
        return list;
    }

    public Paragraph getRandom(){
        Random rnd = new Random();
        Paragraph p = allParagraphs().get(rnd.nextInt(allParagraphs().size()));
        return p;
    }

    public List<Paragraph> generate(int size){
        List<Paragraph> list = new ArrayList<>();
        for (int i = 1; i <= size; i++){
            list.add(getRandom());
        }
        return list;
    }
}
