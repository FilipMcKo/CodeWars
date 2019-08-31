package com.mucko.filip.codewars.TdaTools;

import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;

public class MmcMessage {

    private static final int MURMUR_SEED = 123;

    public static long getMmcMessageId4Tmc(String market, int tmcLocID, String plusOrMinus) {
        long messageID = 0;

        long extendedCountryCode = Long.parseLong(market.substring(0,2), 16);
        long tableID = Long.parseLong(market.substring(3,5),10);
        long countryCode = Long.parseLong(market.substring(2,3),16);

        messageID = messageID | tmcLocID;
        // delete everything beyond the 15th bit
        messageID = messageID & 0xFFFF;

        if ("+".equals(plusOrMinus)) {
            messageID = messageID | (1 << 16);
        }

        messageID = messageID | (tableID << 17);
        messageID = messageID | (countryCode << 23);
        messageID = messageID | (((extendedCountryCode >> 0) & 1) << 27);
        messageID = messageID | (((extendedCountryCode >> 4) & 1) << 28);

        return messageID;
    }

    public static long getMmcMessageId4Tec(long messageId) {
        messageId = messageId % 4294967295L;
        return messageId;
    }

    public static long getMessageId4OpenLR(String olrValue) {
        String urlTableId = "E0D01";
        long messageId = 0;
        try {
            String urlTableIdWithOpenLr = urlTableId + '-' + olrValue;
            byte[] bytes = urlTableIdWithOpenLr.getBytes(StandardCharsets.US_ASCII);
            HashCode hashCode = Hashing.murmur3_32(MURMUR_SEED).hashBytes(bytes);
            messageId = hashCode.padToLong();
        } catch (NumberFormatException e) {
            System.out.println("Failed creation of message id for: {}");
        }
        return messageId;
    }


    public static void main(String[] args) {
        System.out.println(getMessageId4OpenLR("CCkBEAAlJAmPKiVeowAJBQQDAxQACgUEA4JjAAEDARYACQUEAwOVADAAAA=="));
    }
}
