package com.tencent.mm.ui.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.bp;
import com.tencent.mm.storage.bq;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"HandlerLeak"})
public final class a
  implements m
{
  private Context context = null;
  private cm gAT = new b(this);
  private c.a.e.b jYU = null;
  private c.a.d.i jYV = null;
  private c.a.d.i jYW = null;
  private boolean jYX = false;
  private boolean jYY = false;
  public i jYZ = null;
  public h jZa = null;

  public a()
  {
    String str1 = (String)bg.qW().oQ().get(69377);
    String str2 = (String)bg.qW().oQ().get(69378);
    if ((ch.jb(str1)) || (ch.jb(str2)));
    for (c.a.d.i locali = null; ; locali = new c.a.d.i(str1, str2))
    {
      this.jYV = locali;
      return;
    }
  }

  private static void a(c.a.d.i parami)
  {
    ak.getContext().getSharedPreferences(ak.aHi(), 0);
    if (parami == null)
    {
      bg.qW().oQ().set(69377, "");
      bg.qW().oQ().set(69378, "");
      return;
    }
    bg.qW().oQ().set(69377, parami.atX());
    bg.qW().oQ().set(69378, parami.bfP());
  }

  private void c(j paramj)
  {
    this.jYX = false;
    this.jYW = null;
    if (this.jYZ != null)
      this.jYZ.a(paramj);
  }

  private static void gl(boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramBoolean);
    for (String str = "1"; ; str = "2")
    {
      localArrayList.add(new bq(10251, str));
      bg.qW().oS().a(new bp(localArrayList));
      return;
    }
  }

  public final void a(Bundle paramBundle)
  {
    bg.qQ().n(new e(this, paramBundle));
  }

  public final void a(h paramh)
  {
    if (this.jYY)
      return;
    this.jZa = paramh;
    this.jYY = true;
    new d(this).start();
  }

  public final void a(i parami, Context paramContext)
  {
    if (this.jYX)
      return;
    this.jYZ = parami;
    this.context = paramContext;
    this.jYX = true;
    new c(this).start();
  }

  public final c.a.d.i apP()
  {
    return this.jYV;
  }

  public final boolean bbY()
  {
    return this.jYV != null;
  }

  public final void bbZ()
  {
    gl(false);
    c(j.jZf);
  }

  public final void onCancel()
  {
    gl(false);
    c(j.jZg);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.f.a
 * JD-Core Version:    0.6.2
 */