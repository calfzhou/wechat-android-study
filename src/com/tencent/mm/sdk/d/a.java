package com.tencent.mm.sdk.d;

import android.os.Bundle;

public abstract class a
{
  public String ehE;
  public String hvw;

  public void d(Bundle paramBundle)
  {
    paramBundle.putInt("_wxapi_command_type", getType());
    paramBundle.putString("_wxapi_basereq_transaction", this.hvw);
    paramBundle.putString("_wxapi_basereq_openid", this.ehE);
  }

  public void e(Bundle paramBundle)
  {
    this.hvw = paramBundle.getString("_wxapi_basereq_transaction");
    this.ehE = paramBundle.getString("_wxapi_basereq_openid");
  }

  public abstract int getType();
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.d.a
 * JD-Core Version:    0.6.2
 */