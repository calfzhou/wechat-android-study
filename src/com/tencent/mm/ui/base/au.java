package com.tencent.mm.ui.base;

import android.app.Dialog;
import android.content.Context;
import com.tencent.mm.sdk.platformtools.z;

public class au extends Dialog
{
  public au(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }

  public void dismiss()
  {
    try
    {
      super.dismiss();
      return;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpJ93Ympv7FhFV0Og0UsIWxy", "dismiss exception, e = " + localException.getMessage());
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.au
 * JD-Core Version:    0.6.2
 */