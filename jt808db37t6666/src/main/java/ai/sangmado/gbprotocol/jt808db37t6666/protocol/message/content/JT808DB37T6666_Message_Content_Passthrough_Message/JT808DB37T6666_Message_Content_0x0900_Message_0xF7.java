package ai.sangmado.gbprotocol.jt808db37t6666.protocol.message.content.JT808DB37T6666_Message_Content_Passthrough_Message;

import ai.sangmado.gbprotocol.jt808.protocol.ISpecificationContext;
import ai.sangmado.gbprotocol.jt808.protocol.message.content.JT808_Message_Content_Passthrough_Message.JT808_Message_Content_0x0900_Base;
import ai.sangmado.gbprotocol.jt808.protocol.serialization.IJT808MessageBufferReader;
import ai.sangmado.gbprotocol.jt808.protocol.serialization.IJT808MessageBufferWriter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 透传消息 - 状态查询
 */
@NoArgsConstructor
public class JT808DB37T6666_Message_Content_0x0900_Message_0xF7 extends JT808_Message_Content_0x0900_Base {
    public static final JT808DB37T6666_Message_Content_Passthrough_MessageType MESSAGE_TYPE =
            JT808DB37T6666_Message_Content_Passthrough_MessageType.JT808DB37T6666_Passthrough_Message_0xF7;

    @Override
    public JT808DB37T6666_Message_Content_Passthrough_MessageType getPassthroughMessageType() {
        return MESSAGE_TYPE;
    }

    /**
     * 外设ID
     */
    @Getter
    @Setter
    private JT808DB37T6666_Message_Content_Passthrough_PeripheralId peripheralId;
    /**
     * 消息长度
     */
    @Getter
    @Setter
    private Integer messageLength;
    /**
     * 工作状态
     */
    @Getter
    @Setter
    private Integer workState;
    /**
     * 报警状态
     */
    @Getter
    @Setter
    private Integer warningStatus;

    @Override
    public void serialize(ISpecificationContext ctx, IJT808MessageBufferWriter writer) {

    }

    @Override
    public void deserialize(ISpecificationContext ctx, IJT808MessageBufferReader reader) {

    }

    public static JT808DB37T6666_Message_Content_0x0900_Message_0xF7 decode(ISpecificationContext ctx, IJT808MessageBufferReader reader) {
        JT808DB37T6666_Message_Content_0x0900_Message_0xF7 content = new JT808DB37T6666_Message_Content_0x0900_Message_0xF7();
        content.deserialize(ctx, reader);
        return content;
    }
}
