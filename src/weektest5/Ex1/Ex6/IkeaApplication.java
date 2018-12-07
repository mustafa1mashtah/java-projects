package weektest5.Ex1.Ex6;

import evaluationweek5.TvTableBuilder;



public class IkeaApplication {
    public static void main(String[] args) {
        WardrobeBuilder wardrobeBuilder=new WardrobeBuilder();
        System.out.println(wardrobeBuilder.build());
        TvTableBuilder tvTableBuilder=new TvTableBuilder();
        System.out.println(tvTableBuilder.build());

    }
}
