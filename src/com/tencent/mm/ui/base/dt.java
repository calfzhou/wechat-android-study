package com.tencent.mm.ui.base;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.mm.sdk.platformtools.z;

final class dt
  implements View.OnFocusChangeListener
{
  dt(MMTagPanel paramMMTagPanel)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    z.d("!32@/B4Tb64lLpL4fhNdmBV+Mf4yaXXb52KA", "on edittext focus changed %B", arrayOfObject);
    if ((paramBoolean) && (MMTagPanel.e(this.jcy) != null))
      MMTagPanel.e(this.jcy).RQ();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.dt
 * JD-Core Version:    0.6.2
 */