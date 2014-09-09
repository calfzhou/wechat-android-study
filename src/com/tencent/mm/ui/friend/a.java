package com.tencent.mm.ui.friend;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import java.util.LinkedList;

public final class a
  implements View.OnClickListener
{
  private Context context;
  private c jHT;

  public a(Context paramContext, c paramc)
  {
    this.context = paramContext;
    this.jHT = paramc;
  }

  public final void onClick(View paramView)
  {
    d locald = (d)paramView.getTag();
    String str = locald.username;
    int i = locald.jza;
    int j = locald.position;
    i locali = bg.qW().oT().ys(str);
    if (ch.jb(locali.getUsername()))
      locali.setUsername(str);
    com.tencent.mm.pluginsdk.ui.applet.a locala = new com.tencent.mm.pluginsdk.ui.applet.a(this.context, new b(this, locali, j, str));
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(Integer.valueOf(i));
    locala.f(str, localLinkedList);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.a
 * JD-Core Version:    0.6.2
 */