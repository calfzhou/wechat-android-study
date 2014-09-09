package com.tencent.mm.ui.contact;

import android.view.View;
import android.widget.LinearLayout;
import com.tencent.mm.g.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.q.q;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import java.util.List;
import java.util.Map;

final class cm
  implements Runnable
{
  cm(cl paramcl, q paramq)
  {
  }

  public final void run()
  {
    i locali = bg.qW().oT().ys(this.jzM.dqM);
    View localView;
    if ((cl.a(this.jzN) != null) && (cl.a(this.jzN).size() > 0) && (cl.a(this.jzN).contains(this.jzM.dqM)))
      if ((locali == null) || ((int)locali.dhv <= 0) || (!a.cv(locali.getType())))
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.jzM.dqM;
        z.d("!44@/B4Tb64lLpIXzeB5NZbbB0Dbk9yEMsmyuH6azdalesY=", "remove enterprise biz view item, %s", arrayOfObject);
        cl.a(this.jzN).remove(this.jzM.dqM);
        if (cl.a(this.jzN).size() <= 0)
          break label211;
        localView = (View)cl.b(this.jzN).get(this.jzM.dqM);
        if ((localView != null) && (cl.c(this.jzN) != null))
          cl.c(this.jzN).removeView(localView);
      }
    label211: 
    do
    {
      do
      {
        cl.b(this.jzN).remove(localView);
        do
          return;
        while (cl.d(this.jzN) == null);
        if (cl.b(this.jzN) != null)
          cl.b(this.jzN).clear();
        if (cl.c(this.jzN) != null)
          cl.c(this.jzN).removeAllViews();
        cl.d(this.jzN).qq(cl.a(this.jzN).size());
        return;
      }
      while ((locali == null) || ((int)locali.dhv <= 0) || (!a.cv(locali.getType())));
      if (cl.a(this.jzN) != null)
        cl.a(this.jzN).clear();
      if (cl.b(this.jzN) != null)
        cl.b(this.jzN).clear();
      if (cl.c(this.jzN) != null)
        cl.c(this.jzN).removeAllViews();
      cl.e(this.jzN);
    }
    while (cl.d(this.jzN) == null);
    cl.d(this.jzN).qq(cl.a(this.jzN).size());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.cm
 * JD-Core Version:    0.6.2
 */