package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.widget.Toast;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.pluginsdk.model.p;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.cr;
import java.util.LinkedList;
import junit.framework.Assert;

public final class a
  implements m
{
  private Context context;
  private cr dWq;
  private LinkedList fLB;
  private LinkedList fLC;
  private h hAD;
  private i hAE;
  private String hAF;
  private String hAG = "";
  private boolean hAH = false;
  private String hAI = "";
  private boolean hAJ = false;
  private String hAK = "";
  private boolean hAL = true;
  private String hfH = "";

  public a(Context paramContext, h paramh)
  {
    a(paramContext, paramh);
  }

  public a(Context paramContext, h paramh, String paramString)
  {
    a(paramContext, paramh);
    this.hAH = true;
    this.hAI = paramString;
  }

  private void a(Context paramContext, h paramh)
  {
    this.context = paramContext;
    this.hAD = paramh;
    this.fLB = new LinkedList();
    this.dWq = null;
  }

  private String aAH()
  {
    String str;
    if (this.hAH)
      str = this.hAI;
    boolean bool;
    do
    {
      return str;
      bool = this.hAJ;
      str = null;
    }
    while (!bool);
    return this.hAK;
  }

  private void c(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
  {
    if (this.hAD != null)
      this.hAD.a(paramBoolean1, paramBoolean2, paramString1, paramString2);
  }

  private void onStart()
  {
    bg.qX().a(30, this);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.d("!32@/B4Tb64lLpKN6K/THdLZybvP+afE3jBu", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
    if (paramx.getType() != 30)
      z.w("!32@/B4Tb64lLpKN6K/THdLZybvP+afE3jBu", "not expected scene,  type = " + paramx.getType());
    int i;
    do
    {
      return;
      if (this.dWq != null)
      {
        this.dWq.dismiss();
        this.dWq = null;
      }
      bg.qX().b(30, this);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.hAG = ((p)paramx).ayu();
        c(true, false, this.hAG, aAH());
        return;
      }
      if (paramInt2 == -44)
      {
        String str = aAH();
        if (this.hAE != null)
        {
          i locali = this.hAE;
          locali.aAJ();
          c(false, false, this.hAG, str);
          return;
        }
        ar localar = new ar(this.context, new g(this));
        if (this.hAF != null)
          localar.vu(this.hAF);
        if ((this.hAH) || (this.hAJ) || (this.hAL))
        {
          localar.c(this.fLB, this.fLC);
          return;
        }
        localar.b(this.fLB, this.fLC);
        return;
      }
      if (paramInt2 == -87)
      {
        com.tencent.mm.ui.base.e.o(this.context, this.context.getString(n.bBh), "");
        return;
      }
      if ((paramInt2 == -101) && (!ch.jb(paramString)))
      {
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf(paramInt2);
        arrayOfObject2[1] = paramString;
        z.d("!32@/B4Tb64lLpKN6K/THdLZybvP+afE3jBu", "jacks catch add Contact errCode: %d && errMsg: %s", arrayOfObject2);
        com.tencent.mm.ui.base.e.o(this.context, paramString, "");
        return;
      }
      if (paramInt2 != -302)
        break;
      i = ((p)paramx).ayw();
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(i);
      z.d("!32@/B4Tb64lLpKN6K/THdLZybvP+afE3jBu", "onSceneEnd, verify relation out of date, opCode = %d", arrayOfObject1);
    }
    while (i != 3);
    com.tencent.mm.ui.base.e.a(this.context, this.context.getString(n.bDn), this.context.getString(n.buo), this.context.getString(n.bsG), this.context.getString(n.bsK), new f(this, paramx), null);
    return;
    if ((paramInt1 == 4) && (paramInt2 == -22))
      Toast.makeText(this.context, this.context.getString(n.brL), 1).show();
    while (true)
    {
      c(false, false, this.hAG, aAH());
      return;
      Toast.makeText(this.context, this.context.getString(n.brK), 1).show();
    }
  }

  public final void a(i parami)
  {
    this.hAE = parami;
  }

  public final void a(String paramString, LinkedList paramLinkedList, boolean paramBoolean)
  {
    boolean bool1;
    if ((paramString != null) && (paramString.length() > 0))
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      boolean bool2 = false;
      if (paramLinkedList != null)
        bool2 = true;
      Assert.assertTrue(bool2);
      this.hAL = paramBoolean;
      onStart();
      if (!this.hAJ)
        break label147;
      Context localContext2 = this.context;
      this.context.getString(n.buo);
      this.dWq = com.tencent.mm.ui.base.e.a(localContext2, this.context.getString(n.bBb), true, new b(this));
    }
    while (true)
    {
      this.fLC = paramLinkedList;
      this.fLB.add(paramString);
      this.hAG = paramString;
      bg.qX().d(new p(1, this.fLB, paramLinkedList, "", this.hfH));
      return;
      bool1 = false;
      break;
      label147: if (!this.hAH)
      {
        Context localContext1 = this.context;
        this.context.getString(n.buo);
        this.dWq = com.tencent.mm.ui.base.e.a(localContext1, this.context.getString(n.bBb), true, new c(this));
      }
    }
  }

  public final void aAI()
  {
    this.hAJ = true;
  }

  public final void f(String paramString, LinkedList paramLinkedList)
  {
    a(paramString, paramLinkedList, false);
  }

  public final void k(String paramString1, String paramString2, int paramInt)
  {
    boolean bool;
    if ((paramString1 != null) && (paramString1.length() > 0))
    {
      bool = true;
      Assert.assertTrue("username is null", bool);
      onStart();
      if (!this.hAJ)
        break label102;
      Context localContext2 = this.context;
      this.context.getString(n.buo);
      this.dWq = com.tencent.mm.ui.base.e.a(localContext2, this.context.getString(n.bBb), true, new d(this));
    }
    while (true)
    {
      bg.qX().d(new p(paramString1, paramString2, paramInt));
      return;
      bool = false;
      break;
      label102: if (!this.hAH)
      {
        Context localContext1 = this.context;
        this.context.getString(n.buo);
        this.dWq = com.tencent.mm.ui.base.e.a(localContext1, this.context.getString(n.bBb), true, new e(this));
      }
    }
  }

  public final void vu(String paramString)
  {
    this.hAF = paramString;
  }

  public final void vv(String paramString)
  {
    this.hfH = paramString;
  }

  public final void vw(String paramString)
  {
    this.hAK = paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.a
 * JD-Core Version:    0.6.2
 */