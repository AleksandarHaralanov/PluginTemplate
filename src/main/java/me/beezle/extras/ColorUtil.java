package me.beezle.extras;

import java.util.HashMap;
import java.util.Map;
import org.bukkit.ChatColor;

public enum ColorUtil {

    BLACK(0, ChatColor.BLACK),
    DARK_BLUE(1, ChatColor.DARK_BLUE),
    DARK_GREEN(2, ChatColor.DARK_GREEN),
    DARK_AQUA(3, ChatColor.DARK_AQUA),
    DARK_RED(4, ChatColor.DARK_RED),
    DARK_PURPLE(5, ChatColor.DARK_PURPLE),
    GOLD(6, ChatColor.GOLD),
    GRAY(7, ChatColor.GRAY),
    DARK_GRAY(8, ChatColor.DARK_GRAY),
    BLUE(9, ChatColor.BLUE),
    GREEN(10, ChatColor.GREEN),
    AQUA(11, ChatColor.AQUA),
    RED(12, ChatColor.RED),
    LIGHT_PURPLE(13, ChatColor.LIGHT_PURPLE),
    YELLOW(14, ChatColor.YELLOW),
    WHITE(15, ChatColor.WHITE);

    private final int code;
    private final ChatColor chatColor;

    private static final Map<Integer, ChatColor> colors;

    static {
        colors = new HashMap<>();
        for (ColorUtil color : values()) {
            colors.put(color.getCode(), color.getChatColor());
        }
    }

    ColorUtil(int code, ChatColor chatColor) {
        this.code = code;
        this.chatColor = chatColor;
    }

    public int getCode() {
        return this.code;
    }

    public ChatColor getChatColor() {
        return this.chatColor;
    }

    @Override
    public String toString() {
        return String.format("§%x", this.code);
    }

    public static ChatColor getByCode(int code) {
        return colors.get(code);
    }

    public static String stripColor(String input) {
        if (input == null) {
            return null;
        }
        return input.replaceAll("(?i)§[0-9A-F]", "");
    }

    /**
     * Translates alternate color codes in the given text to Minecraft color codes.
     *
     * @param colorChar The character used to denote color codes is '&'.
     * @param textToColorize The text containing the alternate color codes.
     * @return The text with the alternate color codes replaced by Minecraft color codes.
     */
    public static String colorText(char colorChar, String textToColorize) {
        char[] b = textToColorize.toCharArray();
        for (int i = 0; i < b.length - 1; i++) {
            if (b[i] == colorChar && "0123456789AaBbCcDdEeFf".indexOf(b[i + 1]) > -1) {
                b[i] = '\u00A7';
                b[i + 1] = Character.toLowerCase(b[i + 1]);
            }
        }
        return new String(b);
    }
}
