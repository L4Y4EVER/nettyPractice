package codec;

import bean.ProtoMsg;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @author hongyan
 * @date 2021/2/8
 */
public class ProtobufEncoder extends MessageToByteEncoder<ProtoMsg.Message> {
    @Override
    protected void encode(ChannelHandlerContext ctx, ProtoMsg.Message message, ByteBuf byteBuf) throws Exception {
        byte[] bytes = message.toByteArray();
        int length = bytes.length;

        byteBuf.writeShort(length);

        byteBuf.writeBytes(message.toByteArray());
    }
}
