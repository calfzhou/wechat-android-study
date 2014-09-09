package com.tencent.mm.ui.tools;

import android.content.Context;
import android.content.res.ColorStateList;
import com.tencent.mm.aq.a;
import com.tencent.mm.f;
import junit.framework.Assert;

public final class gx
{
  private static gx jVn = null;
  private ColorStateList[] jFh = new ColorStateList[2];
  private boolean jVo = false;

  private gx(Context paramContext)
  {
    this.jFh[0] = a.m(paramContext, f.Oz);
    this.jFh[1] = a.m(paramContext, f.OA);
  }

  private static gx cD(Context paramContext)
  {
    if (paramContext != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      if ((jVn == null) || (!jVn.jVo))
        jVn = new gx(paramContext);
      return jVn;
    }
  }

  public static ColorStateList cE(Context paramContext)
  {
    return cD(paramContext).jFh[0];
  }

  public static ColorStateList cF(Context paramContext)
  {
    return cD(paramContext).jFh[1];
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gx
 * JD-Core Version:    0.6.2
 */