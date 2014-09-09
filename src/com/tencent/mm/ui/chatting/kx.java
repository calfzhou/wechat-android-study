package com.tencent.mm.ui.chatting;

import android.widget.ListView;
import com.tencent.mm.sdk.platformtools.z;

final class kx
  implements Runnable
{
  kx(kw paramkw)
  {
  }

  public final void run()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.juj.jui);
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "dz:does set selection:%d", arrayOfObject);
    hd.e(this.juj.jtA).setSelection(this.juj.jui);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.kx
 * JD-Core Version:    0.6.2
 */