package com.haralanov.utilities;

public class ColorUtil {

    /**
     * Translates alternate color codes in the given text to Minecraft color codes.
     *
     * @param colorChar The character used to denote color codes '&'.
     * @param textToColorize The text containing the alternate color codes.
     * @return The text with the alternate color codes replaced by Minecraft color codes.
     */
    public static String translateAlternateColorCodes(char colorChar, String textToColorize) {
        char[] charArray = textToColorize.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == colorChar && "0123456789AaBbCcDdEeFf".indexOf(charArray[i + 1]) > -1) {
                charArray[i] = '\u00A7';
                charArray[i + 1] = Character.toLowerCase(charArray[i + 1]);
            }
        }
        return new String(charArray);
    }
}
