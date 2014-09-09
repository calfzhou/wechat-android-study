package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.an;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.f.c.n;

final class fs
  implements View.OnClickListener
{
  fs(fn paramfn)
  {
  }

  private static boolean df(long paramLong)
  {
    an localan = bg.ii();
    boolean bool1 = false;
    if (localan != null)
    {
      String str = bg.ii().kQ();
      bool1 = false;
      if (str != null)
      {
        int i = bg.ii().kP();
        bool1 = false;
        if (i != 0);
      }
    }
    try
    {
      long l = Long.parseLong(bg.ii().kQ());
      boolean bool2 = paramLong < l;
      bool1 = false;
      if (!bool2)
        bool1 = true;
      return bool1;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public final void onClick(View paramView)
  {
    ft localft;
    if ((paramView.getTag() instanceof ft))
    {
      localft = (ft)paramView.getTag();
      if (!df(localft.cDM))
        break label67;
      n.fTF.q(10231, "1");
      if (bg.ii() != null)
        bg.ii().release();
    }
    while (true)
    {
      this.jqO.jmH.joh.notifyDataSetChanged();
      return;
      label67: com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.iS(localft.cPq);
      if (localb != null)
      {
        n.fTF.q(10090, "0,1");
        if (bg.ii() != null)
        {
          bg.ii().release();
          bg.ii().a(bg.qW().pu(), String.valueOf(localft.cDM), localb, localft.dnQ);
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.fs
 * JD-Core Version:    0.6.2
 */