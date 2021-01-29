/**
 * MapUtil.java
 * 
 * @author SinghLee
 * @version V1.0
 * @description Map相关工具类
 * @history
 * 20191217 xieyan created
 */
package com.vibes.todolist.util;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapUtil {

    /**
     * 将MAP值转到对应的bean中
     * 
     * @param map
     *            MAP
     * @param cls
     *            bean的class对象
     * @return
     */
    public static <T> T convertMap2Bean(Map<String, Object> map, Class<T> cls) {
        try {

            T t = cls.newInstance();

            Set<String> keys = map.keySet();
            Iterator<String> iterator = keys.iterator();

            String key = null;
            while (iterator.hasNext()) {
                key = iterator.next();
                if (StringUtil.isEmpty(key)) {
                    continue;
                }

                try {
                    cls.getMethod("set" + StringUtil.upFirstLetter(key), map.get(key).getClass()).invoke(t,
                            map.get(key));
                } catch (Exception e) {
                    continue;
                }
            }
            return t;
        } catch (Exception ex) {
            return null;
        }
    }
}
