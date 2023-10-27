// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BuckwalterToArabic.java



import java.util.HashMap;

public class BuckwalterToArabic extends HashMap
{

    public BuckwalterToArabic()
    {
        put("'", "\u0621");
        put("|", "\u0622");
        put(">", "\u0623");
        put("&", "\u0624");
        put("<", "\u0625");
        put("}", "\u0626");
        put("A", "\u0627");
        put("b", "\u0628");
        put("p", "\u0629");
        put("t", "\u062A");
        put("v", "\u062B");
        put("j", "\u062C");
        put("H", "\u062D");
        put("x", "\u062E");
        put("d", "\u062F");
        put("*", "\u0630");
        put("r", "\u0631");
        put("z", "\u0632");
        put("s", "\u0633");
        put("$", "\u0634");
        put("S", "\u0635");
        put("D", "\u0636");
        put("T", "\u0637");
        put("Z", "\u0638");
        put("E", "\u0639");
        put("g", "\u063A");
        put("_", "\u0640");
        put("f", "\u0641");
        put("q", "\u0642");
        put("k", "\u0643");
        put("l", "\u0644");
        put("m", "\u0645");
        put("n", "\u0646");
        put("h", "\u0647");
        put("w", "\u0648");
        put("Y", "\u0649");
        put("y", "\u064A");
        put("F", "\u064B");
        put("N", "\u064C");
        put("K", "\u064D");
        put("a", "\u064E");
        put("u", "\u064F");
        put("i", "\u0650");
        put("~", "\u0651");
        put("o", "\u0652");
        put("`", "\u0670");
        put("{", "\u0652");
    }

    public String transliterate(String s)
    {
        String ret = "";
        for(int i = 0; i < s.length(); i++)
            ret = (new StringBuilder(String.valueOf(ret))).append(get((new StringBuilder()).append(s.charAt(i)).toString())).toString();

        return ret;
    }
}
