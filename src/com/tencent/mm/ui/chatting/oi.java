package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.c.a.aa;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.z;

final class oi
  implements View.OnClickListener
{
  oi(ShortVideoView paramShortVideoView)
  {
  }

  public final void onClick(View paramView)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = ShortVideoView.f(this.jwa);
    z.d("!32@/B4Tb64lLpI1d+8HkdT3mC3T0G5ZK8MW", "on item click path %s", arrayOfObject);
    aa localaa = new aa();
    localaa.cHD.type = 2;
    localaa.cHD.cHE = ShortVideoView.g(this.jwa);
    a.aGB().g(localaa);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.oi
 * JD-Core Version:    0.6.2
 */