package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.tencent.mm.am.a;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.q.r;
import com.tencent.mm.storage.ar;

final class dz extends cm
{
  private hd joF;

  public dz()
  {
    super(17);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bcU);
      paramView.setTag(new mt(this.fjl).e(paramView, false));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    this.joF = paramhd;
    mt.a((mt)paramck, paramar, false, paramInt, paramhd);
    mt localmt = (mt)paramck;
    if (aUS())
    {
      if ((paramar.getStatus() != 2) || (!cR(paramar.kk())))
        break label93;
      if (localmt.jms != null)
        localmt.jms.setVisibility(0);
    }
    while (true)
    {
      a(paramInt, localmt, paramar, paramhd.joh.dnT, paramhd.iWI, paramhd.joh.jqc);
      return;
      label93: if (localmt.jms != null)
        localmt.jms.setVisibility(8);
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    if (paramar.getType() == 48)
    {
      int i = ((ms)paramView.getTag()).position;
      if (paramar.getStatus() == 5)
        paramContextMenu.add(i, 103, 0, paramView.getContext().getString(n.bAb));
      paramContextMenu.add(i, 126, 0, paramView.getContext().getString(n.cag));
      if ((r.uK()) && (!this.joF.aVS()))
        paramContextMenu.add(i, 114, 0, paramView.getContext().getString(n.bzv));
      if (a.to("favorite"))
        paramContextMenu.add(i, 116, 0, paramView.getContext().getString(n.bUO));
      if ((!paramar.aJv()) && (paramar.aJC()) && ((paramar.getStatus() == 2) || (paramar.kD() == 1)) && (aUR()) && (cR(paramar.kk())) && (Cd(paramar.kt())))
        paramContextMenu.add(i, 123, 0, paramView.getContext().getString(n.bzE));
      if (!this.joF.aVS())
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(n.bzz));
    }
    return true;
  }

  public final boolean a(MenuItem paramMenuItem, hd paramhd, ar paramar)
  {
    return false;
  }

  public final boolean a(View paramView, hd paramhd, ar paramar)
  {
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.dz
 * JD-Core Version:    0.6.2
 */