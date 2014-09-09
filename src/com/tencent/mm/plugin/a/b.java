package com.tencent.mm.plugin.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cq;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.f.c.e;
import com.tencent.mm.protocal.a.pz;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;

public final class b
{
  public static String DL()
  {
    return ak.getContext().getSharedPreferences(ak.aHi(), 0).getString("reg_last_exit_ui", "");
  }

  public static void b(boolean paramBoolean, String paramString)
  {
    LinkedList localLinkedList = new LinkedList();
    pz localpz = new pz();
    localpz.huF = 1;
    localpz.ifI = 10645;
    localpz.hUn = ((int)ch.CL());
    localpz.hUm = ((int)ch.CL());
    if (paramBoolean);
    for (localpz.ifH = (paramString + "," + ws() + "," + ch.CM() + "," + DL()); ; localpz.ifH = (paramString + "," + ws() + "," + ch.CM() + "," + ak.getContext().getSharedPreferences(ak.aHi(), 0).getString("reg_next_enter_ui", "")))
    {
      localLinkedList.add(localpz);
      com.tencent.mm.plugin.b.a.b localb = new com.tencent.mm.plugin.b.a.b(localLinkedList);
      bg.qX().d(localb);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(10645);
      arrayOfObject[1] = localpz.ifH;
      z.d("!44@/B4Tb64lLpIaKqQrIg/z8PEe3+iWus6GHPU1BVlp2xU=", "accountsync rsakv logID:%d val:%s", arrayOfObject);
      e.a(10645, localpz.hUm, localpz.hUn, localpz.ifH, true, true);
      return;
    }
  }

  public static void eT(int paramInt)
  {
    if (paramInt > 0)
    {
      cq.rO();
      cq.rO();
      if (paramInt == 20)
        ak.getContext().getSharedPreferences(ak.aHi(), 0).edit().putInt("reg_style_id", paramInt).commit();
    }
  }

  public static void jD(String paramString)
  {
    ak.getContext().getSharedPreferences(ak.aHi(), 0).edit().putString("reg_last_exit_ui", paramString).commit();
  }

  public static void jE(String paramString)
  {
    ak.getContext().getSharedPreferences(ak.aHi(), 0).edit().putString("reg_next_enter_ui", paramString).commit();
  }

  public static void jF(String paramString)
  {
    LinkedList localLinkedList = new LinkedList();
    pz localpz = new pz();
    localpz.huF = 1;
    localpz.ifI = 10645;
    localpz.hUn = ((int)ch.CL());
    localpz.hUm = ((int)ch.CL());
    localpz.ifH = (paramString + "," + ws() + "," + ch.CM() + "," + DL());
    localLinkedList.add(localpz);
    com.tencent.mm.plugin.b.a.b localb = new com.tencent.mm.plugin.b.a.b(localLinkedList);
    bg.qX().d(localb);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(10645);
    arrayOfObject[1] = localpz.ifH;
    z.d("!44@/B4Tb64lLpIaKqQrIg/z8PEe3+iWus6GHPU1BVlp2xU=", "accountsync rsakv logID:%d val:%s", arrayOfObject);
    e.a(10645, localpz.hUm, localpz.hUn, localpz.ifH, true, true);
  }

  private static int ws()
  {
    return ak.getContext().getSharedPreferences(ak.aHi(), 0).getInt("reg_style_id", 0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.a.b
 * JD-Core Version:    0.6.2
 */