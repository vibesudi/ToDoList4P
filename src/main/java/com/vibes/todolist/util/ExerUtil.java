package com.vibes.todolist.util;

import com.vibes.todolist.util.consts.Const;

public class ExerUtil {

    // 是否是单选, 多选
    public static boolean isOneOrMulti(String type) {
        return StringUtil.equals(Const.ExerciseType.ONE, type) || StringUtil.equals(Const.ExerciseType.MULTI, type);
    }

    // 是否是判断
    public static boolean isJudge(String type) {
        return StringUtil.equals(Const.ExerciseType.JUDGE, type);
    }

    // 是否是填空题
    public static boolean isFill(String type) {
        return type == Const.ExerciseType.FILL;
    }

    // 是否是会计分录
    public static boolean isAccount(String type) {
        return type == Const.ExerciseType.ACCOUNT;
    }

    // 是否是表格题
    public static boolean isTable(String type) {
        return type == Const.ExerciseType.TABLE;
    }

    /** for 试题导入 */
    // 是否是单选
    public static boolean strIsOne(String type) {
        return StringUtil.equals(Const.ExerciseStr.ONE, type);
    }

    // 是否是单选, 多选
    public static boolean strIsMulti(String type) {
        return StringUtil.equals(Const.ExerciseStr.MULTI, type);
    }

    // 是否是单选或多选
    public static boolean strIsOneOrMulti(String type) {
        return StringUtil.equals(Const.ExerciseStr.ONE, type) || StringUtil.equals(Const.ExerciseStr.MULTI, type);
    }

    // 是否是判断
    public static boolean strIsJudge(String type) {
        return StringUtil.equals(Const.ExerciseStr.JUDGE, type);
    }

    // 是否是填空题
    public static boolean strIsFill(String type) {
        return type == Const.ExerciseStr.FILL;
    }

}
