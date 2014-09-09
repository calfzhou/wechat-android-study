package com.tencent.mm.pluginsdk.wallet;

import com.tencent.mm.sdk.platformtools.ch;
import java.util.Map;

public final class b
{
  public String appId;
  public String grh;
  public int hML;
  public int hMM;
  public String hMP;
  public String hMT;
  public String hMU;
  public String hMV;
  public String hMW;
  public String hMX;
  public int hMY;
  public String url;

  public b(Map paramMap)
  {
    this.appId = ((String)paramMap.get("appId"));
    this.hMP = ((String)paramMap.get("partnerId"));
    this.hMT = ((String)paramMap.get("signType"));
    this.hMU = ((String)paramMap.get("nonceStr"));
    this.hMV = ((String)paramMap.get("timeStamp"));
    this.hMW = ((String)paramMap.get("package"));
    this.hMX = ((String)paramMap.get("paySign"));
    this.url = ((String)paramMap.get("url"));
    this.grh = ((String)paramMap.get("src_username"));
    this.hMM = ch.getInt((String)paramMap.get("scene"), 0);
    this.hMY = ch.getInt((String)paramMap.get("pay_channel"), 0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.wallet.b
 * JD-Core Version:    0.6.2
 */