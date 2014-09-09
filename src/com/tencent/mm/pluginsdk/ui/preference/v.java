package com.tencent.mm.pluginsdk.ui.preference;

import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.cn;
import com.tencent.mm.storage.i;

final class v
  implements Runnable
{
  v(NormalUserHeaderPreference paramNormalUserHeaderPreference, cn paramcn)
  {
  }

  public final void run()
  {
    if ((NormalUserHeaderPreference.b(this.hHW) != null) && (this.hHX != null) && (NormalUserHeaderPreference.b(this.hHW).getUsername().equals(this.hHX.field_encryptUsername)))
    {
      NormalUserHeaderPreference.b(this.hHW).aT(this.hHX.field_conRemark);
      if (!NormalUserHeaderPreference.h(this.hHW))
        z.e("!44@/B4Tb64lLpLSOpQlr7qYXcVBnXDUVF3vgYB+xEVv4/8=", "initView : bindView = " + NormalUserHeaderPreference.i(this.hHW) + "contact = " + NormalUserHeaderPreference.b(this.hHW).getUsername());
    }
    else
    {
      return;
    }
    NormalUserHeaderPreference.d(this.hHW);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.v
 * JD-Core Version:    0.6.2
 */