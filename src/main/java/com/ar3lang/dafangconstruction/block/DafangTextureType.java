package com.ar3lang.dafangconstruction.block;

import java.util.HashMap;
import java.util.Map;

public enum DafangTextureType {
    // 连续型纹理，传递 rows 和 columns 参数
    PATTERN1(TextureMode.CONTINUOUS,new Props().set("rows",1).set("columns",1)),
    PATTERN1_5(TextureMode.CONTINUOUS, new Props().set("rows", 3).set("columns", 3)),
    PATTERN2(TextureMode.CONTINUOUS, new Props().set("rows", 2).set("columns", 2)),
    PATTERN4(TextureMode.CONTINUOUS, new Props().set("rows", 4).set("columns", 4)),
    PATTERN8(TextureMode.CONTINUOUS, new Props().set("rows", 8).set("columns", 8)),
    RECTANGLE4_2(TextureMode.CONTINUOUS, new Props().set("rows", 2).set("columns", 4)),

    // 随机型纹理，传递 rows, columns 以及 count
    RANDOM2(TextureMode.RANDOM, new Props().set("rows", 2).set("columns", 2)),
    RANDOM3(TextureMode.RANDOM, new Props().set("rows", 3).set("columns", 3));

    public enum TextureMode {
        CONTINUOUS,
        RANDOM
    }

    private final TextureMode mode;
    private final Props properties;

    DafangTextureType(TextureMode mode, Props properties) {
        this.mode = mode;
        this.properties = properties;
    }

    public TextureMode getMode() {
        return mode;
    }

    public Props getProperties() {
        return properties;
    }


    public static class Props {
        private final Map<String, Object> map = new HashMap<>();

        public Props set(String key, Object value) {
            map.put(key, value);
            return this;
        }

        public int getInt(String key, int defaultValue) {
            Object val = map.get(key);
            return val instanceof Integer ? (Integer) val : defaultValue;
        }

        public boolean has(String key) {
            return map.containsKey(key);
        }
    }
}
