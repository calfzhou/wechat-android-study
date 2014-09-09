package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import com.tencent.mm.am.a;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.q.r;
import com.tencent.mm.storage.ar;

final class dy extends cl
{
  private hd joF;

  public dy()
  {
    super(16);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bcA);
      paramView.setTag(new mt(this.fjl).e(paramView, true));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    this.joF = paramhd;
    mt.a((mt)paramck, paramar, true, paramInt, paramhd);
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    if (paramar.getType() == 48)
    {
      int i = ((ms)paramView.getTag()).position;
      paramContextMenu.add(i, 126, 0, paramView.getContext().getString(n.cag));
      if ((r.uK()) && (!this.joF.aVS()))
        paramContextMenu.add(i, 114, 0, paramView.getContext().getString(n.bzv));
      if (a.to("favorite"))
        paramContextMenu.add(i, 116, 0, paramView.getContext().getString(n.bUO));
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
 * Qualified Name:     com.tencent.mm.ui.chatting.dy
 * JD-Core Version:    0.6.2
 */