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
    protected void encode(ChannelHandlerContext channelHandlerContext, ProtoMsg.Message message, ByteBuf byteBuf) throws Exception {

    }
}
