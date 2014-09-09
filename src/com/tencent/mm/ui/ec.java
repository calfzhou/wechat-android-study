package com.tencent.mm.ui;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.tencent.mm.f.c;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.Map;

final class ec
{
  private static ec iNd = null;
  private int iNe = 0;
  private SparseIntArray iNf = new SparseIntArray();
  private SparseArray iNg = new SparseArray();
  private ArrayList iNh = new ArrayList();
  public SparseArray iNi = new SparseArray();
  private boolean iNj = false;
  private long timestamp = 0L;

  public static ec aQm()
  {
    if (iNd == null)
      iNd = new ec();
    return iNd;
  }

  private void aQo()
  {
    this.iNf.clear();
    String str = (String)bg.qW().oQ().get(299010);
    if (!ch.jb(str))
    {
      String[] arrayOfString1 = str.split("\\|");
      for (int i = 0; i < arrayOfString1.length; i++)
      {
        String[] arrayOfString2 = arrayOfString1[i].split("\\:");
        if (arrayOfString2.length == 2)
          this.iNf.put(ch.xy(arrayOfString2[0]), ch.xy(arrayOfString2[1]));
      }
    }
    this.iNj = true;
  }

  public final boolean aQn()
  {
    return this.iNe > 0;
  }

  public final void eH(boolean paramBoolean)
  {
    int i = 0;
    int i2;
    long l;
    Map localMap;
    int i1;
    label87: StringBuilder localStringBuilder;
    if (!paramBoolean)
    {
      if ((this.iNg.size() == 0) || (System.currentTimeMillis() - this.timestamp > 3600000L))
      {
        i2 = 1;
        if (i2 == 0)
          break label382;
      }
    }
    else
    {
      l = System.currentTimeMillis();
      this.iNg.clear();
      this.iNh.clear();
      String str1 = com.tencent.mm.f.e.or().getValue("TopRightMenus");
      if (ch.jb(str1))
        break label333;
      localMap = x.bB(str1, "TopRightMenus");
      i1 = 0;
      if (i1 >= 100)
        break label333;
      localStringBuilder = new StringBuilder(".TopRightMenus.Menu");
      if (i1 != 0)
        break label323;
    }
    label323: for (Object localObject = ""; ; localObject = Integer.valueOf(i1))
    {
      String str2 = localObject;
      String str3 = (String)localMap.get(str2 + ".$id");
      if ((str3 == null) || (ch.jb(str3)))
        break label333;
      String str4 = (String)localMap.get(str2 + ".$shownew");
      String str5 = (String)localMap.get(str2 + ".$seq");
      z.d("!44@/B4Tb64lLpLfQyQg5GrZ4IvjIqJd24psdc20wspQJlI=", "got plus panel configs : %s %s %s", new Object[] { str3, str4, str5 });
      this.iNg.put(ch.xy(str3), new eh(ch.xy(str3), ch.xy(str4), ch.xy(str5)));
      this.iNh.add(Integer.valueOf(ch.xy(str3)));
      i1++;
      break label87;
      i2 = 0;
      break;
    }
    label333: if (this.iNg.size() != 0)
      aQo();
    this.timestamp = System.currentTimeMillis();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(this.timestamp - l);
    z.d("!44@/B4Tb64lLpLfQyQg5GrZ4IvjIqJd24psdc20wspQJlI=", "plus menu load data spent time : %s", arrayOfObject);
    label382: this.iNe = 0;
    int j = 0;
    if (i < this.iNh.size())
    {
      int k = ((Integer)this.iNh.get(i)).intValue();
      eh localeh = (eh)this.iNg.get(k);
      ej localej = ed.pa(k);
      if (localej == null)
        break label564;
      ei localei = new ei(localej);
      this.iNi.put(j, localei);
      int m = this.iNf.get(k);
      if ((localeh.iNo == 1) && (m != localeh.ebz))
      {
        localei.iNq = true;
        this.iNe = (1 + this.iNe);
      }
    }
    label564: for (int n = j + 1; ; n = j)
    {
      i++;
      j = n;
      break;
      if (this.iNh.size() > 0)
        this.iNi.put(this.iNh.size(), new ei(ed.pa(2147483647)));
      return;
    }
  }

  public final void oZ(int paramInt)
  {
    if (this.iNg.size() != 0)
    {
      eh localeh = (eh)this.iNg.get(paramInt);
      if ((localeh != null) && (localeh.iNo == 1))
      {
        this.iNf.put(localeh.id, localeh.ebz);
        this.iNe = (-1 + this.iNe);
        if (this.iNj)
        {
          StringBuffer localStringBuffer = new StringBuffer();
          for (int i = 0; i < this.iNf.size(); i++)
          {
            int j = this.iNf.keyAt(i);
            Integer localInteger = Integer.valueOf(this.iNf.get(j));
            localStringBuffer.append(j);
            localStringBuffer.append(":");
            localStringBuffer.append(localInteger);
            localStringBuffer.append("|");
          }
          bg.qW().oQ().set(299010, localStringBuffer.toString());
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ec
 * JD-Core Version:    0.6.2
 */