package com.tencent.mm.ui.contact;

import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.ui.ao;

final class gc
  implements ao
{
  gc(SnsAddressUI paramSnsAddressUI)
  {
  }

  public final void vs(String paramString)
  {
    if (paramString != null)
    {
      SnsAddressUI.b(this.jCy).CI(paramString);
      if (!SnsAddressUI.b(this.jCy).aXx())
        break label105;
      this.jCy.t(1, true);
    }
    while (true)
    {
      SnsAddressUI localSnsAddressUI = this.jCy;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = this.jCy.getString(n.btQ);
      arrayOfObject[1] = Integer.valueOf(SnsAddressUI.b(this.jCy).aXK() + SnsAddressUI.c(this.jCy));
      arrayOfObject[2] = Integer.valueOf(SnsAddressUI.gvf);
      localSnsAddressUI.C(1, String.format("%s(%d/%d)", arrayOfObject));
      return;
      label105: this.jCy.t(1, false);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.gc
 * JD-Core Version:    0.6.2
 */