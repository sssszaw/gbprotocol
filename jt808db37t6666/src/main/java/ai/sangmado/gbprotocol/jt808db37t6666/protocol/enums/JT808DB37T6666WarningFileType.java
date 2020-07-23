package ai.sangmado.gbprotocol.jt808db37t6666.protocol.enums;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * 报警附件文件类型
 */
@Getter
public enum JT808DB37T6666WarningFileType {
    Image(0x00, "图片"),
    Audio(0x01, "音频"),
    Video(0x02, "视频"),
    Text(0x03, "文本"),
    Other(0x04, "其他"),
    ;

    @JsonInclude
    private Integer value;

    @JsonIgnore
    private String description;

    JT808DB37T6666WarningFileType(int value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public String toString() {
        return this.name();
    }

    private static final Map<Integer, JT808DB37T6666WarningFileType> mapping = new HashMap<>();

    static {
        for (JT808DB37T6666WarningFileType item : values()) {
            mapping.put(item.getValue(), item);
        }
    }

    public static JT808DB37T6666WarningFileType cast(int value) {
        JT808DB37T6666WarningFileType item = mapping.get(value);
        if (item == null) {
            throw new IllegalArgumentException(String.format(
                    "Cannot cast integer [%s] to [%s] enum.",
                    value, JT808DB37T6666WarningFileType.class.getSimpleName()));
        }
        return item;
    }

    public static JT808DB37T6666WarningFileType parse(String name) {
        if (name == null || name.length() == 0) {
            return null;
        }
        for (JT808DB37T6666WarningFileType item : values()) {
            if (item.name().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }
}
