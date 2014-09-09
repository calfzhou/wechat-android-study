package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.sdk.d.a;

public final class g extends a
{
  public String dqs;
  public String iDi;

  public g()
  {
  }

  public g(Bundle paramBundle)
  {
    e(paramBundle);
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putString("_wxapi_sendauth_req_scope", this.iDi);
    paramBundle.putString("_wxapi_sendauth_req_state", this.dqs);
  }

  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    this.iDi = paramBundle.getString("_wxapi_sendauth_req_scope");
    this.dqs = paramBundle.getString("_wxapi_sendauth_req_state");
  }

  public final int getType()
  {
    return 1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.modelmsg.g
 * JD-Core Version:    0.6.2
 */