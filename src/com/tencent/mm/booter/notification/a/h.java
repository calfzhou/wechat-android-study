package com.tencent.mm.booter.notification.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.format.Time;
import com.tencent.mm.c.a.mx;
import com.tencent.mm.c.a.mz;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.network.bm;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.e;
import java.util.HashSet;
import java.util.Set;

public final class h
{
  private static final Set djk;
  private final String TAG = "!56@/B4Tb64lLpKR3MWtFvfaILkpFAm7jXGl9CT4VaPq52n4Cdz5g1XhsA==";
  private boolean djl;

  static
  {
    HashSet localHashSet = new HashSet();
    djk = localHashSet;
    localHashSet.add("readerapp");
    djk.add("blogapp");
    djk.add("newsapp");
  }

  private static boolean a(boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    if (!paramBoolean);
    for (boolean bool = true; ; bool = false)
    {
      paramArrayOfBoolean[0] = (paramBoolean & paramArrayOfBoolean[0]);
      paramArrayOfBoolean[1] = (paramBoolean & paramArrayOfBoolean[1]);
      return bool;
    }
  }

  private static boolean a(boolean[] paramArrayOfBoolean, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((!paramBoolean1) && (!paramBoolean2));
    for (boolean bool = true; ; bool = false)
    {
      paramArrayOfBoolean[0] = (paramBoolean1 & paramArrayOfBoolean[0]);
      paramArrayOfBoolean[1] = (paramBoolean2 & paramArrayOfBoolean[1]);
      return bool;
    }
  }

  private static boolean lN()
  {
    boolean bool1 = true;
    try
    {
      mx localmx = new mx();
      localmx.cPr.cEg = 2;
      com.tencent.mm.sdk.c.a.aGB().g(localmx);
      bool2 = localmx.cPs.cPv;
      Object[] arrayOfObject = new Object[bool1];
      if (!bool2)
      {
        arrayOfObject[0] = Boolean.valueOf(bool1);
        z.d("!56@/B4Tb64lLpKR3MWtFvfaILkpFAm7jXGl9CT4VaPq52n4Cdz5g1XhsA==", "check is Voip NOT Calling: %B", arrayOfObject);
        return bool2;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        boolean bool2 = false;
        continue;
        bool1 = false;
      }
    }
  }

  public final boolean[] a(Context paramContext, ar paramar, int paramInt1, String paramString1, String paramString2, int paramInt2, boolean paramBoolean, long paramLong)
  {
    boolean[] arrayOfBoolean = { 1, 1 };
    boolean bool1 = paramContext.getSharedPreferences(ak.aHi(), 0).getBoolean("settings_sound", true);
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Boolean.valueOf(bool1);
    z.d("!56@/B4Tb64lLpKR3MWtFvfaILkpFAm7jXGl9CT4VaPq52n4Cdz5g1XhsA==", "check is Sound Mode: %B", arrayOfObject1);
    boolean bool2 = paramContext.getSharedPreferences(ak.aHi(), 0).getBoolean("settings_shake", true);
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Boolean.valueOf(bool2);
    z.d("!56@/B4Tb64lLpKR3MWtFvfaILkpFAm7jXGl9CT4VaPq52n4Cdz5g1XhsA==", "check is Shake Mode: %B", arrayOfObject2);
    int i;
    boolean bool3;
    label162: boolean bool5;
    label198: boolean bool6;
    label224: boolean bool7;
    label244: boolean bool8;
    label278: label332: boolean bool9;
    label348: boolean bool10;
    label376: int j;
    label404: boolean bool11;
    label418: boolean bool12;
    label444: int i1;
    label500: int i2;
    if (!a(arrayOfBoolean, bool1, bool2))
    {
      Time localTime = new Time();
      localTime.setToNow();
      if (bm.a(localTime.hour, localTime.minute, ak.getContext()))
        break label624;
      z.w("!56@/B4Tb64lLpKR3MWtFvfaILkpFAm7jXGl9CT4VaPq52n4Cdz5g1XhsA==", "no shake & sound notification during background deactive time");
      i = 1;
      if (i != 0)
        break label630;
      bool3 = true;
      if (!a(arrayOfBoolean, bool3))
      {
        boolean bool4 = djk.contains(paramString2);
        Object[] arrayOfObject3 = new Object[1];
        if (bool4)
          break label636;
        bool5 = true;
        arrayOfObject3[0] = Boolean.valueOf(bool5);
        z.d("!56@/B4Tb64lLpKR3MWtFvfaILkpFAm7jXGl9CT4VaPq52n4Cdz5g1XhsA==", "check is NOT Siler User: %B", arrayOfObject3);
        if (bool4)
          break label642;
        bool6 = true;
        if (!a(arrayOfBoolean, bool6))
        {
          if ((paramInt2 & 0x2) == 0)
            break label648;
          bool7 = true;
          Object[] arrayOfObject4 = new Object[1];
          arrayOfObject4[0] = Boolean.valueOf(bool7);
          z.d("!56@/B4Tb64lLpKR3MWtFvfaILkpFAm7jXGl9CT4VaPq52n4Cdz5g1XhsA==", "check is Service Request Sound: %B", arrayOfObject4);
          if ((paramInt2 & 0x2) == 0)
            break label654;
          bool8 = true;
          Object[] arrayOfObject5 = new Object[1];
          arrayOfObject5[0] = Boolean.valueOf(bool8);
          z.d("!56@/B4Tb64lLpKR3MWtFvfaILkpFAm7jXGl9CT4VaPq52n4Cdz5g1XhsA==", "check is Service Request Shake: %B", arrayOfObject5);
          if (!a(arrayOfBoolean, bool7, bool8))
          {
            this.djl = false;
            if (!as.AR("keep_app_silent"))
              break label660;
            this.djl = true;
            Object[] arrayOfObject6 = new Object[1];
            if (this.djl)
              break label706;
            bool9 = true;
            arrayOfObject6[0] = Boolean.valueOf(bool9);
            z.d("!56@/B4Tb64lLpKR3MWtFvfaILkpFAm7jXGl9CT4VaPq52n4Cdz5g1XhsA==", "check Refresh Keep is NOT Silent: %B", arrayOfObject6);
            if (this.djl)
              break label712;
            bool10 = true;
            if (!a(arrayOfBoolean, bool10))
            {
              if ((!a.cl(paramString2)) || (a.n(paramar)))
                break label718;
              j = 1;
              Object[] arrayOfObject7 = new Object[1];
              if (j != 0)
                break label724;
              bool11 = true;
              arrayOfObject7[0] = Boolean.valueOf(bool11);
              z.d("!56@/B4Tb64lLpKR3MWtFvfaILkpFAm7jXGl9CT4VaPq52n4Cdz5g1XhsA==", "check is NOT Must Mute: %B", arrayOfObject7);
              if (j != 0)
                break label730;
              bool12 = true;
              if (!a(arrayOfBoolean, bool12))
              {
                if (arrayOfBoolean[0] != 0)
                {
                  int n = arrayOfBoolean[0];
                  if (!as.AR("keep_chatting_silent" + paramString2))
                    break label736;
                  z.d("!56@/B4Tb64lLpKR3MWtFvfaILkpFAm7jXGl9CT4VaPq52n4Cdz5g1XhsA==", "check is Sound NOT Lock: FALSE");
                  i1 = 1;
                  if (i1 != 0)
                    break label749;
                  i2 = 1;
                  label508: arrayOfBoolean[0] = (i2 & n);
                }
                if (arrayOfBoolean[0] != 0)
                {
                  int k = arrayOfBoolean[0];
                  int m = 1;
                  if (a.bR(paramInt1))
                  {
                    if (!a.cj(paramString1))
                      break label755;
                    m = ((Boolean)bg.qW().oQ().get(73217, Boolean.valueOf(true))).booleanValue();
                  }
                  label571: Object[] arrayOfObject8 = new Object[1];
                  arrayOfObject8[0] = Boolean.valueOf(m);
                  z.d("!56@/B4Tb64lLpKR3MWtFvfaILkpFAm7jXGl9CT4VaPq52n4Cdz5g1XhsA==", "check is Voip Need Sound: %B", arrayOfObject8);
                  arrayOfBoolean[0] = (m & k);
                }
                if (lN())
                  break label789;
              }
            }
          }
        }
      }
    }
    label642: label648: label654: label660: label789: for (boolean bool13 = true; ; bool13 = false)
    {
      a(arrayOfBoolean, bool13);
      return arrayOfBoolean;
      label624: i = 0;
      break;
      label630: bool3 = false;
      break label162;
      label636: bool5 = false;
      break label198;
      bool6 = false;
      break label224;
      bool7 = false;
      break label244;
      bool8 = false;
      break label278;
      if (paramLong <= 0L)
      {
        this.djl = false;
        break label332;
      }
      if ((System.currentTimeMillis() <= paramLong) || (System.currentTimeMillis() >= 5000L + paramLong))
        break label332;
      this.djl = paramBoolean;
      break label332;
      label706: bool9 = false;
      break label348;
      label712: bool10 = false;
      break label376;
      label718: j = 0;
      break label404;
      label724: bool11 = false;
      break label418;
      label730: bool12 = false;
      break label444;
      label736: z.d("!56@/B4Tb64lLpKR3MWtFvfaILkpFAm7jXGl9CT4VaPq52n4Cdz5g1XhsA==", "check is Sound NOT Lock: TRUE");
      i1 = 0;
      break label500;
      label749: i2 = 0;
      break label508;
      label755: if (!a.ck(paramString1))
        break label571;
      boolean bool14 = ((Boolean)bg.qW().oQ().get(73218, Boolean.valueOf(true))).booleanValue();
      break label571;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.h
 * JD-Core Version:    0.6.2
 */