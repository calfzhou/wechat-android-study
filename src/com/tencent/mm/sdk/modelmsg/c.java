package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.sdk.d.b;

public final class c extends b
{
  public WXMediaMessage iDh;

  public c()
  {
  }

  public c(Bundle paramBundle)
  {
    e(paramBundle);
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putAll(o.b(this.iDh));
  }

  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    this.iDh = o.w(paramBundle);
  }

  public final int getType()
  {
    return 3;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.modelmsg.c
 * JD-Core Version:    0.6.2
 */