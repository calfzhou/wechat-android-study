package com.tencent.mm.compatible.g;

import com.tencent.mm.a.c;
import com.tencent.mm.sdk.platformtools.bz;
import com.tencent.mm.sdk.platformtools.ca;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public final class h
{
  public static String dOH = m.getExternalStorageDirectory().getAbsolutePath();
  public static String dOI = dOH + "/tencent/MicroMsg/";
  public static String dOJ = dOI + "/Download/";
  public static String dOK;
  public static String dOL;
  public static String dOM = dOI + "/vusericon/";
  public static String dON = dOI + "/Game/";
  public static String dOO = dOI + "/Download/VoiceRemind";
  public static String dOP = dOI + "watchdog/";
  public static String dOQ = dOI + "xlog";
  public static String dOR = dOI + "crash/";
  public static String dOS = dOI + "avatar/";
  public static String dgF = "/data/data/com.tencent.mm/MicroMsg/";

  public static void cH(String paramString)
  {
    z.d("!32@/B4Tb64lLpLb5u1Bko9L0FNA8C2bcisL", "initSdCardPath start SDCARD_ROOT: " + dOH);
    if (ch.jb(paramString))
    {
      ArrayList localArrayList = bz.aNA();
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
        z.d("!32@/B4Tb64lLpLb5u1Bko9L0FNA8C2bcisL", "initSdCardPath s list i = " + j + " StatMountParse: " + localArrayList.get(j));
      if (i > 1)
        Collections.sort(localArrayList, new i());
      if ((i > 0) && (localArrayList.get(0) != null) && (!ch.jb(((ca)localArrayList.get(0)).iFE)))
      {
        dOH = ((ca)localArrayList.get(0)).iFE;
        for (int k = 0; k < i; k++)
          z.d("!32@/B4Tb64lLpLb5u1Bko9L0FNA8C2bcisL", "initSdCardPath e list i = " + k + " StatMountParse: " + localArrayList.get(k));
      }
    }
    else
    {
      dOH = paramString;
    }
    dOI = dOH + "/tencent/MicroMsg/";
    dOJ = dOI + "/Download/";
    dOM = dOI + "/vusericon/";
    dON = dOI + "/Game/";
    dOP = dOI + "watchdog/";
    dOQ = dOI + "xlog";
    dOR = dOI + "crash/";
    dOS = dOI + "avatar/";
    dOK = dOI + "/Cache/";
    String str1 = dOI + "/WeChat/";
    String str2 = dOI + "/WeiXin/";
    if (!c.ac(str1))
      if (!c.ac(str2));
    while (true)
    {
      dOL = str2;
      z.d("!32@/B4Tb64lLpLb5u1Bko9L0FNA8C2bcisL", "initSdCardPath end SDCARD_ROOT: " + dOH);
      return;
      if (!y.aGW().equals("zh_CN"))
        str2 = str1;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.g.h
 * JD-Core Version:    0.6.2
 */