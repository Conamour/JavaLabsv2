package com.helpme;

public class TagsGenerator {
    public static String makeTags() {
        String[] TagsListOne = {"учеба в сша", "учеба в америке", "магистратура в сша", "влог студента", "будни студента", "учеба в сша", "учеба за границей", "учеба в англии", "поступить в сша", "поступить за границу", "образование за рубежом", "видеоблоггер нью-йорке", "русские в нью-йорке"};
        String[] TagsListTwo = {"приколы с котами", "смешные коты", "приколы с котами и кошками", "смешные коты и кошки", "приколы коты", "смешные кошки", "коты приколы", "приколы кошки", "самые смешные коты и кошки 2017", "коты приколы 2017", "приколы с котами 2017"};
        String[] TagsListThree = {"топ 10", "топ смартфонов", "смартфоны", "топ китайских смартфонов", "2017", "топ смартфонов 2016", "смартфоны 2017", "xperia xz premium", "топ телефонов", "лучший смартфон"};

        int rand1 = (int) (Math.random() * TagsListOne.length);
        int rand2 = (int) (Math.random() * TagsListTwo.length);
        int rand3 = (int) (Math.random() * TagsListThree.length);

        String Tags = "Ваши теги по первому видео " + TagsListOne[rand1];
        String Tags2 = "Ваши теги по второму видео " + TagsListOne[rand2];
        String Tags3 = "Ваши теги по третьему видео " + TagsListOne[rand3];

        return (Tags);
    }
}
