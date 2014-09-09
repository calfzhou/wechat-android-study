package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.sdk.d.b;

public final class h extends b
{
  public String code;
  public String dAo;
  public String dCE;
  public String dqs;
  public String url;

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putString("_wxapi_sendauth_resp_token", this.code);
    paramBundle.putString("_wxapi_sendauth_resp_state", this.dqs);
    paramBundle.putString("_wxapi_sendauth_resp_url", this.url);
    paramBundle.putString("_wxapi_sendauth_resp_lang", this.dAo);
    paramBundle.putString("_wxapi_sendauth_resp_country", this.dCE);
  }

  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    this.code = paramBundle.getString("_wxapi_sendauth_resp_token");
    this.dqs = paramBundle.getString("_wxapi_sendauth_resp_state");
    this.url = paramBundle.getString("_wxapi_sendauth_resp_url");
    this.dAo = paramBundle.getString("_wxapi_sendauth_resp_lang");
    this.dCE = paramBundle.getString("_wxapi_sendauth_resp_country");
  }

  public final int getType()
  {
    return 1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.modelmsg.h
 * JD-Core Version:    0.6.2
 */