package top.bingchenglin.wxgzh;

import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author linbingcheng
 * @version V1.0
 * @Title: WxgzhTest
 * @Description: TODO
 * @email bclin@coremail.cn
 * @date 2018/4/11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WxgzhTest {


    @Autowired
    private WxMpService wxMpService;

    /**
     * 获取access_token
     */
    @Test
    public void testGetAccessToken(){
        try {
            String accessToken = wxMpService.getAccessToken();
            System.out.println(accessToken);
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
    }


}
