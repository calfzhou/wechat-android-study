package com.tencent.mm.ui.contact;

import android.app.ProgressDialog;
import com.tencent.mm.c.a.fx;
import com.tencent.mm.c.a.fz;
import com.tencent.mm.model.bw;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.c.b;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.ui.dy;
import java.util.LinkedList;
import java.util.List;

final class dv extends b
{
  dv(SelectContactUI paramSelectContactUI)
  {
    super(0);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, e parame)
  {
    int i = 0;
    fx localfx;
    if ((parame instanceof fx))
    {
      localfx = (fx)parame;
      if (SelectContactUI.b(this.jBX) != null)
        break label29;
    }
    label29: 
    do
    {
      return;
      SelectContactUI.c(this.jBX);
      SelectContactUI.a(this.jBX, false);
      if (SelectContactUI.d(this.jBX) != null)
      {
        SelectContactUI.d(this.jBX).dismiss();
        SelectContactUI.e(this.jBX);
      }
    }
    while ((!ap.S(this.jBX)) || (dy.a(this.jBX, paramInt1, paramInt2, paramString, 4)));
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      SelectContactUI.a(this.jBX, paramInt1, paramInt2, localfx);
      return;
    }
    SelectContactUI.a(this.jBX, localfx.cKX.cLb);
    bw.a(SelectContactUI.f(this.jBX), SelectContactUI.g(this.jBX).aXv(), this.jBX.getString(n.byv), false, "");
    List localList = localfx.cKX.cLf;
    if ((localList != null) && (localList.size() > 0))
    {
      LinkedList localLinkedList = new LinkedList();
      while (i < localList.size())
      {
        localLinkedList.add(localList.get(i));
        i++;
      }
      String str = "weixin://findfriend/verifycontact/" + SelectContactUI.f(this.jBX) + "/";
      bw.a(SelectContactUI.f(this.jBX), localLinkedList, this.jBX.getString(n.byw), true, str);
    }
    if (SelectContactUI.h(this.jBX))
    {
      SelectContactUI.a(this.jBX, SelectContactUI.i(this.jBX), SelectContactUI.f(this.jBX));
      return;
    }
    SelectContactUI.b(this.jBX, SelectContactUI.f(this.jBX));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.dv
 * JD-Core Version:    0.6.2
 */