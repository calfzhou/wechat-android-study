package com.tencent.mm.jdbiz;

import android.os.Looper;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dx;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.q;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

public final class c
  implements dx
{
  private com.tencent.mm.sdk.c.g dQt = new d(this);

  public final void b(q paramq)
  {
    z.i("!44@/B4Tb64lLpJaQq5yv+rBllYP/5t1rlvCJ2UKN8aiaag=", "receivemsg jd");
    if (paramq == null)
    {
      z.e("!44@/B4Tb64lLpJaQq5yv+rBllYP/5t1rlvCJ2UKN8aiaag=", "onPreAddMessage cmdAM is null");
      return;
    }
    f localf = new f();
    localf.iP(ai.a(paramq.hOS));
    z.i("!44@/B4Tb64lLpJaQq5yv+rBllYP/5t1rlvCJ2UKN8aiaag=", "bizType " + ch.Y(localf.dQw, ""));
    if (ch.jb(localf.dQw))
      z.e("!44@/B4Tb64lLpJaQq5yv+rBllYP/5t1rlvCJ2UKN8aiaag=", "bizTye is null or nil");
    while (true)
    {
      bg.qW().oQ().Ai();
      return;
      if (ch.jb(localf.dQx))
      {
        z.e("!44@/B4Tb64lLpJaQq5yv+rBllYP/5t1rlvCJ2UKN8aiaag=", "activity id is null");
      }
      else if (!localf.a(g.Cp().Cu()))
      {
        z.i("!44@/B4Tb64lLpJaQq5yv+rBllYP/5t1rlvCJ2UKN8aiaag=", "fo zu baoyou! the activityid is same");
      }
      else if (!g.Cx())
      {
        z.e("!44@/B4Tb64lLpJaQq5yv+rBllYP/5t1rlvCJ2UKN8aiaag=", "no entrance, ignore msg");
      }
      else
      {
        if (localf.dQw.equals("3"))
        {
          paramq.hOX = null;
          if ((ch.jb(localf.dQD)) || (ch.jb(localf.daK)) || (ch.jb(localf.dQE)) || (ch.jb(localf.dQF)) || (ch.jb(localf.dQC)))
            z.e("!44@/B4Tb64lLpJaQq5yv+rBllYP/5t1rlvCJ2UKN8aiaag=", "invalid params");
          while (true)
          {
            g.b(localf);
            break;
            if (localf.Cn())
            {
              z.i("!44@/B4Tb64lLpJaQq5yv+rBllYP/5t1rlvCJ2UKN8aiaag=", "ingore msg due to msg is expired");
            }
            else if (g.Cp().iR(localf.dQx))
            {
              z.i("!44@/B4Tb64lLpJaQq5yv+rBllYP/5t1rlvCJ2UKN8aiaag=", "activity id already show, " + localf.dQx);
            }
            else if (!localf.a(g.Cp().Cu()))
            {
              z.i("!44@/B4Tb64lLpJaQq5yv+rBllYP/5t1rlvCJ2UKN8aiaag=", "the remind activitid is same");
            }
            else
            {
              g.Cp().iQ(localf.dQx);
              z.i("!44@/B4Tb64lLpJaQq5yv+rBllYP/5t1rlvCJ2UKN8aiaag=", "add activity id" + localf.dQx);
              new cm(Looper.getMainLooper()).post(new e(this, localf));
            }
          }
        }
        if (localf.dQw.equals("1"))
          g.b(localf);
        else if (localf.dQw.equals("2"))
          g.b(localf);
      }
    }
  }

  public final void nv()
  {
    a.aGB().b("NotifyStartWebViewParams", this.dQt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.jdbiz.c
 * JD-Core Version:    0.6.2
 */