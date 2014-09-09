package com.tencent.mm.n;

import android.graphics.Bitmap;
import android.os.Looper;
import com.tencent.mm.a.d;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.protocal.a.pf;
import com.tencent.mm.protocal.a.sk;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.o;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

public final class e
  implements com.tencent.mm.o.m
{
  private boolean dmO = false;
  private Set dmP = new HashSet();
  private d dmQ = new d(400);
  private Stack dmR = new Stack();
  private bp dmS = null;
  private bp dmT = null;
  private String dmU = null;
  private ay dmV = new ay(Looper.getMainLooper(), new h(this), false);

  public e()
  {
    bg.qX().a(123, this);
    this.dmO = false;
    this.dmU = com.tencent.mm.model.x.pG();
    q.dnn = new f(this);
  }

  private int a(br parambr)
  {
    if (parambr == null)
      return -1;
    if ((parambr instanceof i))
    {
      if (this.dmS == null)
        this.dmS = new bp(1, "getavatar", 2, bg.qQ().getLooper());
      return this.dmS.c(parambr);
    }
    if (this.dmT == null)
      this.dmT = new bp(1, "readsave", 1, bg.qQ().getLooper());
    return this.dmT.c(parambr);
  }

  private static x eP(String paramString)
  {
    x localx1 = af.sJ().fg(paramString);
    if ((localx1 != null) && (localx1.getUsername().equals(paramString)));
    byte[] arrayOfByte;
    do
    {
      return localx1;
      com.tencent.mm.storage.i locali = bg.qW().oT().ys(paramString);
      if ((locali == null) || (!locali.getUsername().equals(paramString)))
        return null;
      if (locali.ji() == 4)
      {
        c.k(paramString, locali.ji());
        return null;
      }
      localx1 = new x();
      localx1.setUsername(paramString);
      localx1.bi(3);
      arrayOfByte = bg.qW().oT().yx(paramString);
    }
    while (ch.B(arrayOfByte));
    try
    {
      x localx2 = c.a(paramString, new sk().bY(arrayOfByte));
      return localx2;
    }
    catch (Exception localException)
    {
    }
    return localx1;
  }

  private static m sh()
  {
    if (bg.oE())
      return af.sh();
    return null;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    if (paramx.getType() != 123);
    do
    {
      return;
      z localz = (z)paramx;
      HashSet localHashSet = new HashSet();
      if (localz.sA() != null)
      {
        Iterator localIterator2 = localz.sA().iterator();
        while (localIterator2.hasNext())
        {
          pf localpf = (pf)localIterator2.next();
          String str2 = localpf.ifh.getString();
          if ((localpf.hOU != null) && (localpf.hOU.aLL() != null) && (localpf.hOU.aLL().getBytes() != null))
          {
            localHashSet.add(str2);
            x localx = new x();
            localx.setUsername(str2);
            localx.bi(3);
            a(new l(this, localx, localpf.hOU.aLL().getBytes()));
          }
        }
      }
      if (localz.sz() != null)
      {
        Iterator localIterator1 = localz.sz().iterator();
        while (localIterator1.hasNext())
        {
          String str1 = ((vt)localIterator1.next()).getString();
          if (!localHashSet.contains(str1))
            this.dmP.remove(str1);
        }
      }
      this.dmO = false;
    }
    while (this.dmR.size() <= 0);
    this.dmV.cP(0L);
  }

  public final Bitmap b(String paramString, boolean paramBoolean, int paramInt)
  {
    m localm = sh();
    if (localm != null)
      if (paramInt > 5)
      {
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = paramString;
        arrayOfObject3[1] = Integer.valueOf(paramInt);
        localBitmap1 = m.eR(String.format("%s$$%d", arrayOfObject3));
        if (localBitmap1 != null)
        {
          Object[] arrayOfObject5 = new Object[1];
          arrayOfObject5[0] = Integer.valueOf(paramInt);
          com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpJO3ngf+FD8EZfQGyZYk2Ww", "find custom corner avatar, custom corner %d", arrayOfObject5);
          return localBitmap1;
        }
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = Integer.valueOf(paramInt);
        com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpJO3ngf+FD8EZfQGyZYk2Ww", "can not find custom corner avatar, custom corner %d", arrayOfObject4);
        label103: if (localBitmap1 != null);
      }
    for (Bitmap localBitmap1 = m.eR(paramString); ; localBitmap1 = null)
    {
      if (localBitmap1 != null)
      {
        if (paramInt <= 5)
          break;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(paramInt);
        com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpJO3ngf+FD8EZfQGyZYk2Ww", "create custom corner avatar, custom corner %d", arrayOfObject1);
        Bitmap localBitmap2 = com.tencent.mm.sdk.platformtools.i.a(localBitmap1, false, paramInt);
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = paramString;
        arrayOfObject2[1] = Integer.valueOf(paramInt);
        localm.c(String.format("%s$$%d", arrayOfObject2), localBitmap2);
        return localBitmap2;
      }
      if (paramBoolean)
        return null;
      com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpJO3ngf+FD8EZfQGyZYk2Ww", "get bitmap from cache failed, try to load :%s", new Object[] { paramString });
      if (this.dmP.contains(paramString))
        return null;
      this.dmP.add(paramString);
      a(new j(this, paramString));
      return null;
      localBitmap1 = null;
      break label103;
    }
  }

  public final void cancel()
  {
    while (this.dmR.size() > 0)
      this.dmP.remove(this.dmR.pop());
  }

  public final void eN(String paramString)
  {
    a(new j(this, paramString));
  }

  public final void eO(String paramString)
  {
    bg.qQ().n(new g(this, paramString));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.e
 * JD-Core Version:    0.6.2
 */