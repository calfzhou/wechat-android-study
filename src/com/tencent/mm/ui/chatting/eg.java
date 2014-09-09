package com.tencent.mm.ui.chatting;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.storage.ar;

final class eg extends cj
{
  public eg()
  {
    super(5);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = paramLayoutInflater.inflate(k.bcK, null);
      eh localeh = new eh(this, this.fjl);
      localeh.eTC = ((TextView)paramView.findViewById(i.amj));
      localeh.jpB = ((TextView)paramView.findViewById(i.alp));
      paramView.setTag(localeh);
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    eh localeh = (eh)paramck;
    localeh.jpB.setText(paramar.getContent());
    paramhd.joh.jpY.a(localeh.jpB, (int)localeh.jpB.getTextSize(), 0, false, false);
    localeh.jpB.invalidate();
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    return false;
  }

  public final boolean a(MenuItem paramMenuItem, hd paramhd, ar paramar)
  {
    return false;
  }

  public final boolean a(View paramView, hd paramhd, ar paramar)
  {
    return false;
  }

  protected final boolean aUQ()
  {
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.eg
 * JD-Core Version:    0.6.2
 */