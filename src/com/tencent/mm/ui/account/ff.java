package com.tencent.mm.ui.account;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.widget.ImageView;
import com.tencent.mm.compatible.g.h;
import com.tencent.mm.compatible.g.j;
import com.tencent.mm.modelsimple.e;
import com.tencent.mm.sdk.platformtools.aq;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.MMFormInputView;

final class ff
  implements aq
{
  Bitmap bitmap;
  String duA;

  ff(RegByMobileRegAIOUI paramRegByMobileRegAIOUI)
  {
  }

  public final boolean rD()
  {
    this.duA = e.D(this.iQP);
    this.bitmap = e.E(this.iQP);
    if ((this.bitmap != null) && (!this.bitmap.isRecycled()));
    try
    {
      i.a(this.bitmap, 100, Bitmap.CompressFormat.PNG, h.dOS + "temp.avatar", false);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
        z.e("!44@/B4Tb64lLpLrFBPJPItazeC2EyRjy73us9HlrmPyGsI=", "save avatar fail." + localException.getMessage());
    }
  }

  public final boolean rE()
  {
    if ((!ch.jb(this.duA)) && (ch.jb(RegByMobileRegAIOUI.l(this.iQP).getText().trim())))
      RegByMobileRegAIOUI.l(this.iQP).setText(this.duA);
    if (!j.nI())
    {
      z.e("!44@/B4Tb64lLpLrFBPJPItazeC2EyRjy73us9HlrmPyGsI=", "SDcard is not available");
      return false;
    }
    if ((this.bitmap != null) && (!this.bitmap.isRecycled()) && (!RegByMobileRegAIOUI.m(this.iQP)))
    {
      RegByMobileRegAIOUI.n(this.iQP).setImageBitmap(this.bitmap);
      RegByMobileRegAIOUI.o(this.iQP).setVisibility(8);
      RegByMobileRegAIOUI.p(this.iQP);
    }
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ff
 * JD-Core Version:    0.6.2
 */