package net.xmeter;

public class BytesUtil {
    public static String byteArrayToString(byte[] data) {
        System.out.println(data.length);
        if(data.length == 0){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (byte item : data) {
            sb.append(String.format("%02X ", item));
        }

        return sb.toString();
    }
}
