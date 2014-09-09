package com.tencent.mm.modelsimple;

import com.tencent.mm.model.bg;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.m;
import com.tencent.mm.protocal.a.ba;
import com.tencent.mm.protocal.a.mk;
import com.tencent.mm.protocal.a.ml;
import com.tencent.mm.protocal.a.tt;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class av extends com.tencent.mm.o.x
  implements ab
{
  public static String dSA;
  private static int dSB;
  private static int dSC = 0;
  public static String dSu;
  public static String dSv;
  public static String dSw;
  public static String dSx;
  public static String dSy;
  public static String dSz;
  private m dlH;

  public av(int paramInt)
  {
    dSB = paramInt;
  }

  public static int CK()
  {
    return dSC;
  }

  public static boolean eo(int paramInt)
  {
    return dSB != paramInt;
  }

  public final int a(r paramr, m paramm)
  {
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    mk localmk = new mk();
    localmk.eJv = y.aGW();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = localmk.eJv;
    z.d("!44@/B4Tb64lLpK+IBX8XDgnviNDI2401O6WLLoFb7jDtRE=", "language %s", arrayOfObject);
    localb.a(localmk);
    localb.b(new ml());
    localb.fi("/cgi-bin/micromsg-bin/getonlineinfo");
    localb.de(526);
    localb.df(0);
    localb.dg(0);
    this.dlH = paramm;
    return a(paramr, localb.sU(), this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(paramInt2);
    arrayOfObject1[1] = Integer.valueOf(paramInt3);
    z.d("!44@/B4Tb64lLpK+IBX8XDgnviNDI2401O6WLLoFb7jDtRE=", "ongynetend %d, %d", arrayOfObject1);
    if ((paramInt2 == 0) || (paramInt3 == 0))
    {
      ml localml = (ml)((a)paramaj).sP();
      Map localMap1 = com.tencent.mm.sdk.platformtools.x.bB(localml.icT, "summary");
      if (localMap1 != null)
      {
        dSu = (String)localMap1.get(".summary.banner");
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf(localml.icR);
        arrayOfObject2[1] = localml.icT;
        z.d("!44@/B4Tb64lLpK+IBX8XDgnviNDI2401O6WLLoFb7jDtRE=", "onlineinfo, count:%d, summary:%s", arrayOfObject2);
        if (ch.jb(dSu))
          bg.qW().oI();
        mk localmk = (mk)((a)paramaj).sO();
        Iterator localIterator = localml.icS.iterator();
        while (localIterator.hasNext())
        {
          tt localtt = (tt)localIterator.next();
          if (localtt.hPL.aFt().hashCode() != localmk.hRy.hPL.aFt().hashCode())
          {
            Map localMap2 = com.tencent.mm.sdk.platformtools.x.bB(localtt.ioH, "wording");
            if (localMap2 != null)
            {
              dSv = (String)localMap2.get(".wording.title");
              dSw = (String)localMap2.get(".wording.notify");
              dSx = (String)localMap2.get(".wording.mute");
              dSy = (String)localMap2.get(".wording.mute_tips");
              dSz = (String)localMap2.get(".wording.exit");
              dSA = (String)localMap2.get(".wording.exit_confirm");
              Object[] arrayOfObject3 = new Object[5];
              arrayOfObject3[0] = localtt.ioH;
              arrayOfObject3[1] = dSv;
              arrayOfObject3[2] = dSw;
              arrayOfObject3[3] = dSz;
              arrayOfObject3[4] = dSA;
              z.d("!44@/B4Tb64lLpK+IBX8XDgnviNDI2401O6WLLoFb7jDtRE=", "detail: %s, %s %s %s %s", arrayOfObject3);
            }
          }
        }
      }
      dSC = localml.icU;
    }
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 526;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.av
 * JD-Core Version:    0.6.2
 */