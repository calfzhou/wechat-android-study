package com.tencent.mm.ui.base;

import android.app.ProgressDialog;
import android.content.Context;
import com.tencent.mm.sdk.platformtools.z;

public class dd extends ProgressDialog
{
  public dd(Context paramContext, int paramInt)
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
      z.e("!44@/B4Tb64lLpK+qNTh5lI0rQ2+i9dgkCmS8K9PUsUQ4IY=", "dismiss exception, e = " + localException.getMessage());
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.dd
 * JD-Core Version:    0.6.2
 */