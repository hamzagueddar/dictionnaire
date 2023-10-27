// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ArabicToBuckwalter.java



import java.util.HashMap;

public class ArabicToBuckwalter extends HashMap
{

    public ArabicToBuckwalter()
    {
        put("\u0621", new String("'"));
        put("\u0622", new String("|"));
        put("\u0623", new String(">"));
        put("\u0624", new String("&"));
        put("\u0625", new String("<"));
        put("\u0626", new String("}"));
        put("\u0627", new String("A"));
        put("\u0628", new String("b"));
        put("\u0629", new String("p"));
        put("\u062A", new String("t"));
        put("\u062B", new String("v"));
        put("\u062C", new String("j"));
        put("\u062D", new String("H"));
        put("\u062E", new String("x"));
        put("\u062F", new String("d"));
        put("\u0630", new String("*"));
        put("\u0631", new String("r"));
        put("\u0632", new String("z"));
        put("\u0633", new String("s"));
        put("\u0634", new String("$"));
        put("\u0635", new String("S"));
        put("\u0636", new String("D"));
        put("\u0637", new String("T"));
        put("\u0638", new String("Z"));
        put("\u0639", new String("E"));
        put("\u063A", new String("g"));
        put("\u0640", new String("_"));
        put("\u0641", new String("f"));
        put("\u0642", new String("q"));
        put("\u0643", new String("k"));
        put("\u0644", new String("l"));
        put("\u0645", new String("m"));
        put("\u0646", new String("n"));
        put("\u0647", new String("h"));
        put("\u0648", new String("w"));
        put("\u0649", new String("Y"));
        put("\u064A", new String("y"));
        put("\u064B", new String("F"));
        put("\u064C", new String("N"));
        put("\u064D", new String("K"));
        put("\u064E", new String("a"));
        put("\u064F", new String("u"));
        put("\u0650", new String("i"));
        put("\u0651", new String("~"));
        put("\u0652", new String("o"));
        put("\u0670", new String("`"));
        put("\u0652", new String("{"));
    }

    public String transliterate(String s)
    {
        String ret = "";
        for(long i = 0; i < s.length(); i++)
            ret = (new StringBuilder(String.valueOf(ret))).append(get((new StringBuilder()).append(s.charAt((int)i)).toString())).toString();

        return ret;
    }
}
