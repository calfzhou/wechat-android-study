package com.tencent.mm.ak;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.tencent.mm.o.f;

public final class a
{
  String cEF = null;
  Context context = null;
  c dFA = null;
  String dFB = null;
  String dFC = null;
  final AsyncTask dFD = new b(this);
  int duration = 0;
  Intent intent = null;
  String rI = null;

  public final void a(Context paramContext, Intent paramIntent, c paramc)
  {
    this.context = paramContext;
    this.intent = paramIntent;
    this.rI = r.ia((String)f.c(2, ""));
    this.cEF = m.AL().ic(this.rI);
    this.dFC = m.AL().ib(this.rI);
    this.dFA = paramc;
    this.dFD.execute(new String[0]);
  }

  public final void cancel()
  {
    this.dFA = null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ak.a
 * JD-Core Version:    0.6.2
 */