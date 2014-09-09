package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.storage.o;
import java.util.LinkedList;

final class jl
  implements View.OnClickListener
{
  jl(hd paramhd, LinearLayout paramLinearLayout)
  {
  }

  public final void onClick(View paramView)
  {
    if (((int)this.jtA.jnf.dhv == 0) && (bg.qW().oT().G(this.jtA.jnf) != -1))
      this.jtA.jnf = bg.qW().oT().ys(hd.p(this.jtA));
    com.tencent.mm.pluginsdk.ui.applet.a locala = new com.tencent.mm.pluginsdk.ui.applet.a(this.jtA.agh(), new jm(this));
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(Integer.valueOf(3));
    locala.f(hd.p(this.jtA), localLinkedList);
    n localn = n.fTF;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = hd.p(this.jtA);
    arrayOfObject[1] = Integer.valueOf(3);
    localn.d(11004, arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.jl
 * JD-Core Version:    0.6.2
 */