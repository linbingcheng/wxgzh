package top.bingchenglin.wxgzh.handler;

import lombok.extern.log4j.Log4j2;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpMessageHandler;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.springframework.stereotype.Component;
import top.bingchenglin.wxgzh.utils.JsonUtils;

import java.util.Map;


@Component
@Log4j2
public class LogHandler  implements WxMpMessageHandler {
  @Override
  public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage,
                                  Map<String, Object> context, WxMpService wxMpService,
                                  WxSessionManager sessionManager) {
    log.info("\n接收到请求消息，内容：{}", JsonUtils.toJson(wxMessage));
    return null;
  }

}
