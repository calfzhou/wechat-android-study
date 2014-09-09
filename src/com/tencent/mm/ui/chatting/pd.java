package com.tencent.mm.ui.chatting;

import com.tencent.mm.ak.m;
import com.tencent.mm.ak.q;
import com.tencent.mm.ak.r;
import com.tencent.mm.ak.v;
import com.tencent.mm.c.a.iz;
import com.tencent.mm.c.a.ja;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.k;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import java.lang.ref.WeakReference;

final class pd extends g
{
  WeakReference jwC = null;

  public pd()
  {
    super(0);
  }

  public final boolean a(com.tencent.mm.sdk.c.e parame)
  {
    if (!(parame instanceof iz))
    {
      z.e("!44@/B4Tb64lLpKYc17gQ4E+i2zzIzCJ7JpqKkNH7lU5Rrk=", "can not be here");
      return false;
    }
    iz localiz = (iz)parame;
    long l = localiz.cNk.cDM;
    ar localar = bg.qW().oV().cV(l);
    if (62 != localar.getType())
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(localar.getType());
      z.e("!44@/B4Tb64lLpKYc17gQ4E+i2zzIzCJ7JpqKkNH7lU5Rrk=", "not short video type !!! cur type %d", arrayOfObject3);
      return false;
    }
    q localq = v.ij(localar.kp());
    String str;
    if (localq != null)
      str = i.a("downvideo", localq.kn(), localq.getUser(), localq.getFileName());
    try
    {
      k.vl().fP(str);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Boolean.valueOf(true);
      z.i("!44@/B4Tb64lLpKYc17gQ4E+i2zzIzCJ7JpqKkNH7lU5Rrk=", "[oneliang][revokeMsgVideo] cancel result:%s", arrayOfObject2);
      bg.qX().cancel(150);
      m.AL().hZ(localq.getFileName());
      if (this.jwC == null)
      {
        z.w("!44@/B4Tb64lLpKYc17gQ4E+i2zzIzCJ7JpqKkNH7lU5Rrk=", "popup view ref is null");
        return false;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localException.getMessage();
        z.printErrStackTrace("!44@/B4Tb64lLpKYc17gQ4E+i2zzIzCJ7JpqKkNH7lU5Rrk=", localException, "[oneliang][revokeMsgVideo] chatting item video,cancel failure:%s", arrayOfObject1);
      }
      ox localox = (ox)this.jwC.get();
      if (localox == null)
      {
        z.w("!44@/B4Tb64lLpKYc17gQ4E+i2zzIzCJ7JpqKkNH7lU5Rrk=", "popup view is null");
        this.jwC = null;
        return false;
      }
      ox.a(localox);
      com.tencent.mm.ui.base.e.a(localox.getContext(), localiz.cNk.cNl, "", false, new pe(this, localox));
      this.jwC = null;
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.pd
 * JD-Core Version:    0.6.2
 */