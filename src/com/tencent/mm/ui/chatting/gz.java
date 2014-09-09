package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.c.a.lx;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.MMTextView;

final class gz
  implements View.OnClickListener
{
  public hd joF;

  public gz(hd paramhd)
  {
    this.joF = paramhd;
  }

  public final void onClick(View paramView)
  {
    z.d("!56@/B4Tb64lLpKwUcOR+EdWcrEYD8dwvm3w0g11tTTOgHYkrbMRW/mIIw==", "tranlsate view clicked");
    if (!(paramView instanceof ChattingTranslateView));
    ChattingTranslateView localChattingTranslateView;
    MMTextView localMMTextView;
    ms localms;
    boolean bool;
    do
    {
      do
      {
        do
        {
          return;
          localChattingTranslateView = (ChattingTranslateView)paramView;
        }
        while (localChattingTranslateView.aVm());
        localMMTextView = (MMTextView)paramView.getTag();
      }
      while (localMMTextView == null);
      localms = (ms)localMMTextView.getTag();
      bool = localms.cMM.aJK();
      if (localChattingTranslateView.aVl())
      {
        localChattingTranslateView.aVi();
        this.joF.a(localms.cMM.kk(), hb.jrz);
        localMMTextView.setText(localms.cMM.getContent());
        this.joF.joh.jpY.c(localMMTextView);
        return;
      }
    }
    while (!localChattingTranslateView.aVn());
    if (bool)
    {
      localChattingTranslateView.aVk();
      this.joF.a(localms.cMM.kk(), hb.jrB);
      localMMTextView.setText(localms.cMM.kw());
      this.joF.joh.jpY.c(localMMTextView);
      return;
    }
    localChattingTranslateView.aVj();
    lx locallx = new lx();
    locallx.cOT.cOV = false;
    locallx.cOT.id = localms.cMM.kk();
    locallx.cOT.cOU = localms.cMM.getContent();
    locallx.cOT.type = 0;
    a.aGB().g(locallx);
    this.joF.a(localms.cMM.kk(), hb.jrA);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gz
 * JD-Core Version:    0.6.2
 */