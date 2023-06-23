package baitaptonghop.config;

import java.util.Scanner;

public class Config {
    private static final String ERROR_ALERT = "===>> Định dạng không hợp lệ, hoặc ngoài phạm vi! Vui lòng thử lại....";
    private static final String EMPTY_ALERT = "===>> Trường nhập vào không thể để trống! Vui lòng thử lại....";
    /*========================================Input Method Start========================================*/
    /**
     * getString()  Trả về một giá trị chuỗi từ người dùng.
     */
    public static String getString() {
        while (true) {
            String result = getInput();
            if (result.equals("")) {
                System.err.println(EMPTY_ALERT);
                continue;
            }
            return result;
        }
    }

    /**
     * getChar()  Trả về một giá trị ký tự từ người dùng.
     */
    public static char getChar() {
        return getString().charAt(0);
    }

    /**
     * getBoolean()  Trả về một giá trị boolean từ người dùng.
     */
    public static boolean getBoolean() {
        String result = getString();
        return result.equalsIgnoreCase("true");
    }

    /**
     * getByte()  Trả về một giá trị byte từ người dùng.
     */
    public static byte getByte() {
        while (true) {
            try {
                return Byte.parseByte(getString());
            } catch (NumberFormatException errException) {
                System.err.println(ERROR_ALERT);
            }
        }
    }

    /**
     * getShort()  Trả về một giá trị short từ người dùng.
     */
    public static short getShort() {
        while (true) {
            try {
                return Short.parseShort(getString());
            } catch (NumberFormatException errException) {
                System.err.println(ERROR_ALERT);
            }
        }
    }

    /**
     * getInteger()  Trả về một giá trị integer từ người dùng.
     */
    public static int getInteger() {
        while (true) {
            try {
                return Integer.parseInt(getString());
            } catch (NumberFormatException errException) {
                System.err.println(ERROR_ALERT);
            }
        }
    }

    /**
     * getLong()  Trả về một giá trị long từ người dùng.
     */
    public static long getLong() {
        while (true) {
            try {
                return Long.parseLong(getString());
            } catch (NumberFormatException errException) {
                System.err.println(ERROR_ALERT);
            }
        }
    }

    /**
     * getFloat()  Trả về một giá trị float từ người dùng.
     */
    public static float getFloat() {
        while (true) {
            try {
                return Float.parseFloat(getString());
            } catch (NumberFormatException errException) {
                System.err.println(ERROR_ALERT);
            }
        }
    }

    /**
     * getDouble()  Trả về một giá trị double từ người dùng.
     */
    public static double getDouble() {
        while (true) {
            try {
                return Double.parseDouble(getString());
            } catch (NumberFormatException errException) {
                System.err.println(ERROR_ALERT);
            }
        }
    }
    /*========================================Phương thức nhập kết thúc========================================*/

    /**
     * getInput()  Trả về một giá trị chuỗi bất kỳ từ người dùng.
     */
    private static String getInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * pressAnyKey()  Nhấn bất kỳ phím nào để tiếp tục....
     */
    public static void pressAnyKey() {
        getInput();
    }
    /*========================================Các phương thức khác========================================*/

}