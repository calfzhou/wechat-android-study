package com.tencent.mm.ui.chatting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;

final class fw
  implements DialogInterface.OnClickListener
{
  fw(fu paramfu, ar paramar)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.dxM.aJw())
    {
      fu.a(this.jqQ).S(this.dxM);
      return;
    }
    if (this.dxM.aJA())
    {
      fu.a(this.jqQ).T(this.dxM);
      return;
    }
    if (this.dxM.aJF())
    {
      fu.a(this.jqQ).U(this.dxM);
      return;
    }
    if (this.dxM.aJD())
    {
      fu.a(this.jqQ).V(this.dxM);
      return;
    }
    if (this.dxM.aJC())
    {
      fu.a(this.jqQ).Y(this.dxM);
      return;
    }
    if (this.dxM.aJG())
    {
      fu.a(this.jqQ).X(this.dxM);
      return;
    }
    if (this.dxM.aJB())
    {
      fu.a(this.jqQ).W(this.dxM);
      return;
    }
    z.e("!56@/B4Tb64lLpKwUcOR+EdWcik3L5UqfFb8jMHkIb1EO8Tn8j+imdtF5g==", "uknown msg type");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.fw
 * JD-Core Version:    0.6.2
 */