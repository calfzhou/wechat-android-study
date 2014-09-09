package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.e;

final class k
  implements View.OnLongClickListener
{
  k(FMessageListView paramFMessageListView, n paramn)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    z.d("!44@/B4Tb64lLpISOYcLaKm7W9VXCtUsfbzmlSwz61ihIus=", "jacks long click digest");
    Context localContext = this.hHg.getContext();
    String[] arrayOfString = new String[1];
    arrayOfString[0] = this.hHg.getContext().getString(com.tencent.mm.n.byG);
    e.a(localContext, null, arrayOfString, null, new l(this));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.k
 * JD-Core Version:    0.6.2
 */