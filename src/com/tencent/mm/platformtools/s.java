package com.tencent.mm.platformtools;

import android.graphics.Bitmap;
import com.tencent.mm.compatible.g.j;
import com.tencent.mm.sdk.platformtools.ch;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Vector;

public final class s
{
  private static LinkedList dUO = new LinkedList();
  private static Vector dni = new Vector();

  public static Bitmap a(q paramq)
  {
    if (!b(paramq))
      return null;
    if (!j.nI())
      return paramq.DE();
    if (paramq.DD())
      return u.a(u.dUP, paramq);
    return u.b(u.dUP, paramq);
  }

  public static boolean a(t paramt)
  {
    return dni.add(new WeakReference(paramt));
  }

  private static boolean b(q paramq)
  {
    return (paramq != null) && (!ch.jb(paramq.Dz()));
  }

  public static boolean b(t paramt)
  {
    dUO.remove(paramt);
    return dUO.add(paramt);
  }

  public static boolean c(t paramt)
  {
    return dUO.remove(paramt);
  }

  public static Bitmap h(String paramString, int paramInt1, int paramInt2)
  {
    return u.h(paramString, paramInt1, paramInt2);
  }

  public static Bitmap jA(String paramString)
  {
    return u.jA(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.s
 * JD-Core Version:    0.6.2
 */