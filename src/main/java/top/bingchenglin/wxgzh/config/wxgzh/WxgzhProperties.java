package top.bingchenglin.wxgzh.config.wxgzh;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author linbingcheng
 * @version V1.0
 * @Title: WxgzhProperties
 * @Description: TODO
 * @email bclin@coremail.cn
 * @date 2018/4/11
 */
@ConfigurationProperties(prefix = "wxgzh.config")
@Setter
@Getter
public class WxgzhProperties {

    /**
     * 设置微信公众号的appid
     */
    private String appId;

    /**
     * 设置微信公众号的app secret
     */
    private String secret;

    /**
     * 设置微信公众号的token
     */
    private String token;

    /**
     * 设置微信公众号的EncodingAESKey
     */
    private String aesKey;


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.MULTI_LINE_STYLE);
    }
}
