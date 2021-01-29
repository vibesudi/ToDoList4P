package com.vibes.todolist.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class BigDecimalUtil {

    public static final BigDecimal divide(final BigDecimal a, final BigDecimal b) {
        if ((a == null) || (b == null)) {
            return BigDecimal.ZERO;
        }
        if (b.intValue() == 0) {
            return BigDecimal.ZERO;
        }
        return a.divide(b, 2, RoundingMode.UP);
    }

    public static final BigDecimal divide(final BigDecimal a, final BigDecimal b, final int scale) {
        if ((a == null) || (b == null)) {
            return BigDecimal.ZERO;
        }
        if (b.intValue() == 0) {
            return BigDecimal.ZERO;
        }
        return a.divide(b, scale, RoundingMode.UP);
    }
}
