package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.sdk.d.a;

public final class b extends a
{
  public String dAo;
  public String dCE;
  public String username;

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putString("_wxapi_getmessage_req_lang", this.dAo);
    paramBundle.putString("_wxapi_getmessage_req_country", this.dCE);
  }

  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    this.dAo = paramBundle.getString("_wxapi_getmessage_req_lang");
    this.dCE = paramBundle.getString("_wxapi_getmessage_req_country");
  }

  public final int getType()
  {
    return 3;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.modelmsg.b
 * JD-Core Version:    0.6.2
 */