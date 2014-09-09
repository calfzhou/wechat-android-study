package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.sdk.d.a;

public final class m extends a
{
  public String dAo;
  public String dCE;
  public WXMediaMessage iDh;

  public final void d(Bundle paramBundle)
  {
    Bundle localBundle = o.b(this.iDh);
    super.d(localBundle);
    paramBundle.putString("_wxapi_showmessage_req_lang", this.dAo);
    paramBundle.putString("_wxapi_showmessage_req_country", this.dCE);
    paramBundle.putAll(localBundle);
  }

  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    this.dAo = paramBundle.getString("_wxapi_showmessage_req_lang");
    this.dCE = paramBundle.getString("_wxapi_showmessage_req_country");
    this.iDh = o.w(paramBundle);
  }

  public final int getType()
  {
    return 4;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.modelmsg.m
 * JD-Core Version:    0.6.2
 */