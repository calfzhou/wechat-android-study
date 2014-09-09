package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.widget.Toast;
import com.tencent.mm.a.c;
import com.tencent.mm.a.f;
import com.tencent.mm.compatible.g.h;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.i;
import com.tencent.mm.sdk.platformtools.p;
import com.tencent.mm.ui.base.y;

final class t
  implements y
{
  t(s params)
  {
  }

  public final void onClick(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return;
    case 0:
    }
    String str = h.dOL + "hdImg_" + f.d(GetHdHeadImageGalleryView.c(this.hyv.hys).getBytes()) + ".jpg";
    c.deleteFile(str);
    p.bA(GetHdHeadImageGalleryView.b(this.hyv.hys), str);
    i.e(str, this.hyv.hys.getContext());
    Context localContext1 = this.hyv.hys.getContext();
    Context localContext2 = this.hyv.hys.getContext();
    int i = n.bNa;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = h.dOL;
    Toast.makeText(localContext1, localContext2.getString(i, arrayOfObject), 1).show();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.t
 * JD-Core Version:    0.6.2
 */