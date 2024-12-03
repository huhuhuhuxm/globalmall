package com.globalmall.util;

import java.util.UUID;

/**
 * 去除横杠的UUID
 * @author huxuanming
 * @version 1.0
 * @date 2024/12/3 10:26
 */
public class UUIDUtil {
    /**
     * 去除横杠的uuid
     * @return
     */
    public static String generateUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
