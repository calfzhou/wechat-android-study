package com.tencent.mm.d;

import android.os.Looper;
import com.tencent.mm.c.a.me;
import com.tencent.mm.k;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ay;

public final class b
{
  private me dwf;
  private g dwg = new c(this);
  private ay dwh = new ay(Looper.getMainLooper(), new d(this), true);

  public final void init()
  {
    a.aGB().a("Broadcast", this.dwg);
    this.dwf = new me();
    this.dwf.cPb.desc = "";
    this.dwf.cPb.url = "";
    this.dwf.cPb.cCB = 0;
    this.dwf.cPb.cHw = 30;
    this.dwf.cPb.visible = false;
    this.dwf.cPb.cCD = "";
    this.dwf.cPb.cHx = 0;
    this.dwf.cPb.cHy = k.bjL;
  }

  public final void mf()
  {
    a.aGB().b("Broadcast", this.dwg);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.b
 * JD-Core Version:    0.6.2
 */