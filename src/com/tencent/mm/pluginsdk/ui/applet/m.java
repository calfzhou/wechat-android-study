package com.tencent.mm.pluginsdk.ui.applet;

import android.app.Activity;
import android.app.ProgressDialog;
import com.tencent.mm.g.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.al;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.xb;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;

final class m
  implements com.tencent.mm.o.m
{
  m(j paramj)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (j.f(this.hAS) != null)
      bg.qX().b(106, j.f(this.hAS));
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(paramInt1);
      arrayOfObject1[1] = Integer.valueOf(paramInt2);
      z.e("!44@/B4Tb64lLpKN6K/THdLZyfhssx5i4XqJeW6IFVaMNdw=", "searchContact onSceneEnd, errType = %d, errCode = %d", arrayOfObject1);
      j.a(this.hAS, -1);
      return;
    }
    if (j.b(this.hAS) == null)
    {
      z.e("!44@/B4Tb64lLpKN6K/THdLZyfhssx5i4XqJeW6IFVaMNdw=", "searchContact, context is null, msghandler has already been detached!");
      j.a(this.hAS, -1);
      return;
    }
    if (((j.b(this.hAS) instanceof Activity)) && (((Activity)j.b(this.hAS)).isFinishing()))
    {
      z.e("!44@/B4Tb64lLpKN6K/THdLZyfhssx5i4XqJeW6IFVaMNdw=", "searchContact, context isFinishing");
      j.a(this.hAS, -1);
      return;
    }
    xb localxb = ((al)paramx).zG();
    String str = ai.a(localxb.hVf);
    if (ch.jb(str))
    {
      z.e("!44@/B4Tb64lLpKN6K/THdLZyfhssx5i4XqJeW6IFVaMNdw=", "searchContact, user is null");
      j.a(this.hAS, -1);
      return;
    }
    if ((j.g(this.hAS) == null) || (!j.g(this.hAS).equals(str)))
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = j.g(this.hAS);
      arrayOfObject2[1] = str;
      z.w("!44@/B4Tb64lLpKN6K/THdLZyfhssx5i4XqJeW6IFVaMNdw=", "user not the same, %s, %s", arrayOfObject2);
    }
    if (j.a(this.hAS) != null)
      j.a(this.hAS).dismiss();
    j.a(this.hAS, bg.qW().oT().ys(str));
    if ((j.e(this.hAS) == null) || ((int)j.e(this.hAS).dhv == 0))
    {
      z.i("!44@/B4Tb64lLpKN6K/THdLZyfhssx5i4XqJeW6IFVaMNdw=", "searchContact, no contact with username = " + str + ", try get by alias");
      j.a(this.hAS, bg.qW().oT().yp(str));
      if ((j.e(this.hAS) == null) || ((int)j.e(this.hAS).dhv == 0))
      {
        z.i("!44@/B4Tb64lLpKN6K/THdLZyfhssx5i4XqJeW6IFVaMNdw=", "searchContact, no contact with alias, new Contact");
        j.a(this.hAS, new i(str));
        j.e(this.hAS).aR(localxb.dti);
        j.e(this.hAS).aU(ai.a(localxb.ifj));
        j.e(this.hAS).aV(ai.a(localxb.hUY));
        j.e(this.hAS).aW(ai.a(localxb.hUZ));
        j.e(this.hAS).bj(localxb.dtf);
        j.e(this.hAS).bn(RegionCodeDecoder.v(localxb.dtm, localxb.Ks, localxb.Kt));
        j.e(this.hAS).bh(localxb.dtg);
        j.e(this.hAS).bg(localxb.ifO);
        j.e(this.hAS).bo(localxb.ifP);
        j.e(this.hAS).bf(localxb.ifS);
        j.e(this.hAS).aY(localxb.ifR);
        j.e(this.hAS).bl(localxb.ifQ);
      }
    }
    while (true)
    {
      j.b(this.hAS, j.e(this.hAS));
      return;
      z.i("!44@/B4Tb64lLpKN6K/THdLZyfhssx5i4XqJeW6IFVaMNdw=", "searchContact, contact in db, %s", new Object[] { str });
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.m
 * JD-Core Version:    0.6.2
 */