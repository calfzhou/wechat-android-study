package com.tencent.mm.model;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.n.af;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import java.util.ArrayList;
import java.util.List;

public class bt
{
  private static bt dlu;
  public bv dlt;

  private static boolean b(String paramString, List paramList)
  {
    SharedPreferences localSharedPreferences = bg.qW().cO("banner");
    if (localSharedPreferences == null)
      return false;
    SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    localEditor.putInt(paramString + "ArraySize", paramList.size());
    for (int i = 0; i < paramList.size(); i++)
      localEditor.putInt(paramString + i, ((Integer)paramList.get(i)).intValue());
    return localEditor.commit();
  }

  private static List ej(String paramString)
  {
    SharedPreferences localSharedPreferences = bg.qW().cO("banner");
    Object localObject;
    if (localSharedPreferences == null)
      localObject = null;
    while (true)
    {
      return localObject;
      int i = localSharedPreferences.getInt(paramString + "ArraySize", 0);
      localObject = new ArrayList(i);
      for (int j = 0; j < i; j++)
        ((List)localObject).add(Integer.valueOf(localSharedPreferences.getInt(paramString + j, 0)));
    }
  }

  public static bt rn()
  {
    try
    {
      if (dlu == null)
        dlu = new bt();
      return dlu;
    }
    finally
    {
    }
  }

  public static bs ro()
  {
    SharedPreferences localSharedPreferences = bg.qW().cO("banner");
    if (localSharedPreferences == null)
      return null;
    int i = localSharedPreferences.getInt("CurrentType", -1);
    int j = localSharedPreferences.getInt("CurrentShowType", -1);
    String str1 = localSharedPreferences.getString("CurrentData", "");
    if (i != -1)
    {
      switch (i)
      {
      case 4:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      default:
      case 1:
      case 3:
      case 2:
      case 5:
        String str2;
        do
        {
          do
          {
            do
            {
              int k;
              do
              {
                return new bs(i, j, str1);
                k = rp();
              }
              while ((k != bu.dlx) && (k != bu.dly));
              z.i("!44@kCDfVf11b5NCeprZfz972Ag4FJNFWg5rdvaK4iyvyKU=", "already Bind the Mobile");
              return null;
              af.sI();
            }
            while (!af.sM());
            z.i("!44@kCDfVf11b5NCeprZfz972Ag4FJNFWg5rdvaK4iyvyKU=", "avatar already existed");
            return null;
          }
          while (rp() != bu.dlx);
          z.i("!44@kCDfVf11b5NCeprZfz972Ag4FJNFWg5rdvaK4iyvyKU=", "already upload the contacts");
          return null;
          str2 = (String)bg.qW().oQ().get(208903);
        }
        while ((str2 == null) || (str2.length() <= 0));
        z.i("!44@kCDfVf11b5NCeprZfz972Ag4FJNFWg5rdvaK4iyvyKU=", "already bind Google Account");
        return null;
      case 10000:
      case 57005:
      }
      return null;
    }
    return null;
  }

  private static int rp()
  {
    while (true)
    {
      try
      {
        str1 = (String)bg.qW().oQ().get(4097, "");
        str2 = (String)bg.qW().oQ().get(6, "");
        boolean bool = x.qe();
        z.d("!44@kCDfVf11b5NCeprZfz972Ag4FJNFWg5rdvaK4iyvyKU=", "isUpload " + bool + " stat " + x.pK());
        if ((str1 != null) && (str1.length() > 0))
        {
          if ((str2 == null) || (str2.length() <= 0))
            break label149;
          if ((str1 == null) && (str2 == null))
            return bu.dlv;
          if ((str1 != null) && (str2 == null))
            return bu.dlw;
          if (bool)
            return bu.dlx;
          int i = bu.dly;
          return i;
        }
      }
      catch (Exception localException)
      {
        return bu.dlv;
      }
      String str1 = null;
      continue;
      label149: String str2 = null;
    }
  }

  public final boolean a(bs parambs)
  {
    boolean bool = true;
    if (parambs.getType() == 10000)
    {
      SharedPreferences localSharedPreferences2 = bg.qW().cO("banner");
      if (localSharedPreferences2 != null)
        localSharedPreferences2.edit().clear().commit();
      if (this.dlt != null)
        this.dlt.rq();
      return bool;
    }
    if (parambs.getType() == 57005)
      return false;
    SharedPreferences localSharedPreferences1 = bg.qW().cO("banner");
    if (localSharedPreferences1 == null)
      return false;
    SharedPreferences.Editor localEditor = localSharedPreferences1.edit();
    bs localbs = ro();
    if (!ej("HistoryInfo").contains(Integer.valueOf(parambs.getType())));
    while (true)
    {
      if ((localbs != null) && (localbs.rm() == 2))
      {
        List localList = ej("HistoryInfo");
        if (!localList.contains(Integer.valueOf(localbs.getType())))
          localList.add(Integer.valueOf(localbs.getType()));
        b("HistoryInfo", localList);
      }
      if (bool)
        localEditor.putInt("CurrentType", parambs.getType()).putInt("CurrentShowType", parambs.rm()).putString("CurrentData", parambs.getData()).commit();
      if (this.dlt == null)
        break;
      this.dlt.rq();
      return bool;
      bool = false;
    }
  }

  public final void y(int paramInt1, int paramInt2)
  {
    SharedPreferences localSharedPreferences = bg.qW().cO("banner");
    if (localSharedPreferences == null);
    while (true)
    {
      return;
      SharedPreferences.Editor localEditor = localSharedPreferences.edit();
      switch (paramInt2)
      {
      default:
      case 1:
      case 2:
      case 3:
      }
      while (this.dlt != null)
      {
        this.dlt.rq();
        return;
        localEditor.remove("CurrentType").remove("CurrentShowType").remove("CurrentData").commit();
        continue;
        localEditor.remove("CurrentType").remove("CurrentShowType").remove("CurrentData").commit();
        List localList = ej("HistoryInfo");
        if (!localList.contains(Integer.valueOf(paramInt1)))
          localList.add(Integer.valueOf(paramInt1));
        b("HistoryInfo", localList);
        continue;
        if (paramInt1 == 3)
          localEditor.remove("CurrentType").remove("CurrentShowType").remove("CurrentData").commit();
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bt
 * JD-Core Version:    0.6.2
 */