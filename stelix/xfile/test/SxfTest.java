package stelix.xfile.test;

import stelix.xfile.SxfBlock;
import stelix.xfile.SxfBlockBuilder;
import stelix.xfile.SxfStructBuilder;
import stelix.xfile.WriteStyle;
import stelix.xfile.reader.SxfReader;

public class SxfTest {

    public static void main(String[] args) {

/*
        SxfBlockBuilder sxfBuilder =  SxfBlockBuilder.create().setStyle(WriteStyle.NORMAL)
                .variable("name", "cats").build()
                .variable("$", 123).build()
                .variable("ez", SxfStructBuilder.create().setStyle(WriteStyle.NORMAL)
                        .add("cats").comment("cats are cool??").build()
                        .add(false).build()
                        .add(123).build()
                        .add(SxfBlockBuilder.create()
                                .variable("like the cats", true).build()
                                .variable("pizza", "yes").build()
                                .buildBlock()).comment(":DDDD").build()
                        .add("test").build()).comment("lol ez dog")
                .build();
*/

    }
}
