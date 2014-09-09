package com.tencent.mm.n;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.mm.a.f;
import com.tencent.mm.model.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import com.tencent.mm.model.x;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;

public class af
  implements bd
{
  private static HashMap cZG;
  private y dnZ;
  private m doa;
  private e dob;
  private w doc;
  private ay dod = new ay(bg.qQ().getLooper(), new ai(this), false);

  static
  {
    HashMap localHashMap = new HashMap();
    cZG = localHashMap;
    localHashMap.put(Integer.valueOf("IMG_FLAG_TABLE".hashCode()), new ag());
    cZG.put(Integer.valueOf("HDHEADIMGINFO_TABLE".hashCode()), new ah());
  }

  static Context getContext()
  {
    return ak.getContext();
  }

  public static af sI()
  {
    af localaf = (af)bg.qF().eA(af.class.getName());
    if (localaf == null)
    {
      localaf = new af();
      bg.qF().a(af.class.getName(), localaf);
    }
    return localaf;
  }

  public static y sJ()
  {
    if (bg.qW().oD() == 0)
      throw new a();
    if (sI().dnZ == null)
      sI().dnZ = new y(bg.qW().oO());
    return sI().dnZ;
  }

  public static w sK()
  {
    if (bg.qW().oD() == 0)
      throw new a();
    if (sI().doc == null)
      sI().doc = new w(bg.qW().oO());
    return sI().doc;
  }

  public static e sL()
  {
    if (bg.qW().oD() == 0)
      throw new a();
    if (sI().dob == null)
      sI().dob = new e();
    return sI().dob;
  }

  public static boolean sM()
  {
    if (ch.a((Boolean)bg.qW().oQ().get(59), false))
      return true;
    if (sh().eS(x.pG()))
      return true;
    String str = x.pG();
    if (ch.jb(str))
      return false;
    Bitmap localBitmap = q.F(bg.qW().pa() + "user_" + f.d(str.getBytes()) + ".png", str);
    if ((localBitmap == null) || (localBitmap.isRecycled()))
      return false;
    return sh().d(str, localBitmap);
  }

  public static m sh()
  {
    if (bg.qW().oD() == 0)
      throw new a();
    if (sI().doa == null)
      sI().doa = new m(bg.qW().pc());
    return sI().doa;
  }

  public final void O(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      z.d("!32@/B4Tb64lLpIAhUt0Bg2QTjPirIFtLxXY", "update all plugin avatars");
      bg.qW().oQ().set(90113, Boolean.valueOf(true));
    }
    this.dod.cP(10000L);
  }

  public final void ci(int paramInt)
  {
  }

  public final void nv()
  {
    this.dod.aNu();
    if (sI().doa != null)
      m.reset();
    e locale = sI().dob;
    if (locale != null)
      bg.qX().b(123, locale);
    y localy = sI().dnZ;
    if (localy != null)
      localy.sx();
  }

  public final HashMap nw()
  {
    return cZG;
  }

  public final void r(String paramString1, String paramString2)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.af
 * JD-Core Version:    0.6.2
 */