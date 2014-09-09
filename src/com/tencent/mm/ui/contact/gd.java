package com.tencent.mm.ui.contact;

import com.tencent.mm.pluginsdk.ui.ap;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

final class gd
  implements ap
{
  gd(SnsAddressUI paramSnsAddressUI)
  {
  }

  public final void vt(String paramString)
  {
    z.d("!32@/B4Tb64lLpLI3JJoWXimvSAB0KTsifPc", "onSearchTextChange  %s", new Object[] { paramString });
    String str = ch.iV(paramString.toString());
    SnsAddressUI.b(this.jCy, str);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.gd
 * JD-Core Version:    0.6.2
 */