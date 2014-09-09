package com.tencent.mm.modelfriend;

import com.tencent.mm.protocal.a.qy;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.applet.f;

final class s
  implements f
{
  s(q paramq)
  {
  }

  public final String dv(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.dtG.getCount()))
      z.e("!32@/B4Tb64lLpKtUZnUqFd8jYERHC2aCXs9", "pos is invalid");
    qy localqy;
    do
    {
      return null;
      localqy = this.dtG.du(paramInt);
    }
    while (localqy == null);
    return localqy.gnq;
  }

  public final int vX()
  {
    return this.dtG.getCount();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.s
 * JD-Core Version:    0.6.2
 */