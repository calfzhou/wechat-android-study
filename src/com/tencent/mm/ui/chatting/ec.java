package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ProgressBar;
import com.tencent.mm.n;
import com.tencent.mm.r.a;
import com.tencent.mm.r.b;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.MMTextView;

final class ec extends ej
{
  private hd joF;

  public ec()
  {
    super(37);
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    this.joF = paramhd;
    ov localov = (ov)paramck;
    b localb = b.fN(paramar.getContent());
    localov.jws.setText(a.a(localb));
    if (paramar.getStatus() >= 2)
      localov.fIh.setVisibility(8);
    while (true)
    {
      paramhd.joh.jpY.c(localov.jws);
      localov.jws.setTag(new ms(paramar, paramhd.iWI, paramInt, null, 0, (byte)0));
      localov.jws.setOnClickListener(paramhd.joh.jqc);
      localov.jws.setOnLongClickListener(paramhd.joh.jqe);
      a(paramInt, localov, paramar, paramhd.joh.dnT, paramhd.iWI, paramhd.joh.jqc);
      return;
      localov.fIh.setVisibility(0);
    }
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
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ec
 * JD-Core Version:    0.6.2
 */