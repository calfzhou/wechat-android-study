package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.sdk.d.a;

public final class j extends a
{
  public int cCn;
  public WXMediaMessage iDh;

  public j()
  {
  }

  public j(Bundle paramBundle)
  {
    e(paramBundle);
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putAll(o.b(this.iDh));
    paramBundle.putInt("_wxapi_sendmessagetowx_req_scene", this.cCn);
  }

  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    this.iDh = o.w(paramBundle);
    this.cCn = paramBundle.getInt("_wxapi_sendmessagetowx_req_scene");
  }

  public final int getType()
  {
    return 2;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.modelmsg.j
 * JD-Core Version:    0.6.2
 */