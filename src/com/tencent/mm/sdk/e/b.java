package com.tencent.mm.sdk.e;

import android.os.Bundle;

public final class b
{
  public String iDn;
  public int iDo = -1;

  public final void e(Bundle paramBundle)
  {
    this.iDn = paramBundle.getString("_wxapi_payoptions_callback_classname");
    this.iDo = paramBundle.getInt("_wxapi_payoptions_callback_flags", -1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.e.b
 * JD-Core Version:    0.6.2
 */