package top.bingchenglin.wxgzh.handler;

import lombok.extern.log4j.Log4j2;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpMessageHandler;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.springframework.stereotype.Component;
import top.bingchenglin.wxgzh.builder.TextBuilder;

import java.util.Map;

import static me.chanjar.weixin.common.api.WxConsts.XmlMsgType;


@Component
@Log4j2
public class LocationHandler implements WxMpMessageHandler {

  @Override
  public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage,
                                  Map<String, Object> context, WxMpService wxMpService,
                                  WxSessionManager sessionManager) {
    if (wxMessage.getMsgType().equals(XmlMsgType.LOCATION)) {
      //TODO 接收处理用户发送的地理位置消息
      try {
        String content = "感谢反馈，您的的地理位置已收到！";
        return new TextBuilder().build(content, wxMessage, null);
      } catch (Exception e) {
        log.error("位置消息接收处理失败", e);
        return null;
      }
    }

    //上报地理位置事件
    log.info("\n上报地理位置 。。。 ");
    log.info("\n纬度 : " + wxMessage.getLatitude());
    log.info("\n经度 : " + wxMessage.getLongitude());
    log.info("\n精度 : " + String.valueOf(wxMessage.getPrecision()));

    //TODO  可以将用户地理位置信息保存到本地数据库，以便以后使用

    return null;
  }

}