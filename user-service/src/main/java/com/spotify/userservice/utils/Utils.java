package com.spotify.userservice.utils;

import java.util.concurrent.ThreadLocalRandom;

public class Utils {
    public static Long uniqueId() {
        return Long.parseLong(String.valueOf(System.currentTimeMillis()) + String.valueOf(ThreadLocalRandom.current().nextInt(111, 1000)));
    }

}
