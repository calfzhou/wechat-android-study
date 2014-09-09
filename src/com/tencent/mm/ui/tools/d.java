package com.tencent.mm.ui.tools;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.mm.sdk.platformtools.z;

final class d
  implements View.OnFocusChangeListener
{
  d(ActionBarSearchView paramActionBarSearchView)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    z.v("!44@/B4Tb64lLpL4/IPflj+tleANqnL7qi1AFYpzfZUCVoE=", "on edittext focus changed, hasFocus %B", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.d
 * JD-Core Version:    0.6.2
 */