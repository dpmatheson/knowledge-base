package uk.co.dpmatheson.datatypes;

public class DataTypes {

    public static void main(String[] args) {

    }

    public static void primitives(){
        // boolean can be true or false
        boolean boolTrue = true;
        boolean boolFalse = false;
        // char can hold 2 bytes for a single unicode character
        char char_a = 'a';
        char char_a_unicode = '\u0061';
        // byte can hold values from -128 to +127
        byte minByte = -128;
        byte maxByte = 127;
        // short can hold 2 bytes, values from -32,768 to 32,767
        short minShort = -32_768;
        short maxShort = 32_767;
        // int can hold 4 bytes, values from -2,147,483,648 to 2,147,483,647
        int minInt = -2_147_483_648;
        int maxInt = 2_147_483_647;
        // long can hold 8 bytes, values from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long minLong = -9_223_372_036_854_775_808L;
        long maxLong = 9_223_372_036_854_775_807L;
        // float can hold 4 bytes
        float f = 0.0f;
        // double can hold 8 bytes
        double d = 0.0d;
    }

    public static void wrappers(){

        Boolean boolTrue = Boolean.TRUE;
        Boolean boolFalse = Boolean.FALSE;
        Boolean boolAutoboxTrue = true;
        Boolean boolAutoboxFalse = false;

        Character char_a = Character.valueOf('a');
        Character char_a_unicode = Character.valueOf('\u0061');
        Character char_autobox_a = 'a';
        Character char_autobox_a_unicode = '\u0061';

        Byte minByteAutobox = -128;
        Byte maxByteAutobox = 127;

        Short minShortAutobox = -32_768;
        Short maxShortAutobox = 32_767;

        Integer minIntAutobox = -2_147_483_648;
        Integer maxIntAutobox = 2_147_483_647;

        Long minLongAutobox = -9_223_372_036_854_775_808L;
        Long maxLongAutobox = 9_223_372_036_854_775_807L;

        Float floatAutobox = 0.0f;

        Double doubleAutobox = 0.0d;
    }

}
