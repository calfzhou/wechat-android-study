package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnLongClickListener;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;

final class gk
  implements View.OnLongClickListener
{
  private View.OnCreateContextMenuListener fPK;
  private hd joF;

  public gk(View.OnCreateContextMenuListener paramOnCreateContextMenuListener, hd paramhd)
  {
    this.joF = paramhd;
    this.fPK = paramOnCreateContextMenuListener;
  }

  public final boolean onLongClick(View paramView)
  {
    if ((paramView.getTag() instanceof ms))
    {
      ms localms = (ms)paramView.getTag();
      if (localms.fjl == 1)
      {
        if (y.dc(this.joF.aUL()))
        {
          i locali = bg.qW().oT().ys(localms.cDi);
          this.joF.fpD.vD(this.joF.fpD.aBU() + "@" + locali.oc() + " ");
          this.joF.jsp = false;
          this.joF.fpD.setMode(1);
          paramView.postDelayed(new gl(this), 2000L);
        }
        return true;
      }
    }
    paramView.setOnCreateContextMenuListener(this.fPK);
    this.joF.openContextMenu(paramView);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gk
 * JD-Core Version:    0.6.2
 */