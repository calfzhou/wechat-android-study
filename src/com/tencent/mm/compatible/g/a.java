package com.tencent.mm.compatible.g;

import android.content.Context;

public final class a
{
  private d dOB = null;
  private final String dip = "audio_lock";
  private Context mContext = null;

  public a(Context paramContext)
  {
    this.mContext = paramContext;
    com.tencent.mm.compatible.a.a.a(8, new b(this));
  }

  public final void a(c paramc)
  {
    if (this.dOB != null)
      this.dOB.a(paramc);
  }

  public final boolean nH()
  {
    try
    {
      if (this.dOB == null)
        return false;
      boolean bool = this.dOB.nH();
      return bool;
    }
    finally
    {
    }
  }

  public final boolean requestFocus()
  {
    try
    {
      if (this.dOB == null)
        return false;
      boolean bool = this.dOB.requestFocus();
      return bool;
    }
    finally
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.g.a
 * JD-Core Version:    0.6.2
 */