package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.r.a;
import com.tencent.mm.r.b;
import com.tencent.mm.storage.ar;

final class eb extends ei
{
  private hd joF;

  public eb()
  {
    super(36);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bcJ);
      paramView.setTag(new mw(this.fjl).aB(paramView));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    this.joF = paramhd;
    mw localmw = (mw)paramck;
    b localb = b.fN(paramar.getContent());
    String str = localb.diG;
    a(localmw, paramhd, str);
    b(localmw, paramhd, str);
    localmw.jpB.setText(a.a(localb));
    paramhd.joh.jpY.c(localmw.jpB);
    localmw.jpB.setTag(new ms(paramar, paramhd.iWI, paramInt, null, 0, (byte)0));
    localmw.jpB.setOnClickListener(paramhd.joh.jqc);
    localmw.jpB.setOnLongClickListener(paramhd.joh.jqe);
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    if (paramar.aJJ())
    {
      int i = ((ms)paramView.getTag()).position;
      if (paramar.getStatus() == 5)
        paramContextMenu.add(i, 103, 0, paramView.getContext().getString(n.bAb));
      if (!this.joF.aVS())
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(n.bzz));
    }
    return true;
  }

  protected final boolean aUQ()
  {
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.eb
 * JD-Core Version:    0.6.2
 */