package com.tencent.mm.ui.bindgooglecontact;

import com.tencent.mm.modelfriend.ae;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.pluginsdk.ui.applet.h;
import com.tencent.mm.sdk.platformtools.z;

final class v
  implements h
{
  v(GoogleFriendUI paramGoogleFriendUI)
  {
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean1);
    arrayOfObject[1] = Boolean.valueOf(paramBoolean2);
    z.d("!56@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLR9cEovBG92K66fy5loyLJw==", "MicroMsg.AddContact ok:%b hasSentVerify:%b", arrayOfObject);
    if ((paramBoolean1) || (paramBoolean2))
    {
      z.d("!56@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLR9cEovBG92K66fy5loyLJw==", "gmailItem:%s", new Object[] { paramString2 });
      az.xh().n(paramString2, 1);
    }
    while (true)
    {
      GoogleFriendUI.a(this.jiK).DW();
      return;
      az.xh().n(paramString2, 2);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindgooglecontact.v
 * JD-Core Version:    0.6.2
 */