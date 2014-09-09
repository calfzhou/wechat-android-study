package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.os.Looper;
import android.view.ViewStub;
import com.tencent.mm.a.c;
import com.tencent.mm.ad.d;
import com.tencent.mm.ad.f;
import com.tencent.mm.ad.h;
import com.tencent.mm.ad.m;
import com.tencent.mm.ad.s;
import com.tencent.mm.i;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class mj
{
  private boolean dsv;
  private cm gQj = new mk(this, Looper.getMainLooper());
  private List hFY;
  private f juI;
  private ChattingAnimFrame juJ = null;
  private Activity juK;

  private boolean a(String paramString, Activity paramActivity, boolean paramBoolean)
  {
    try
    {
      byte[] arrayOfByte;
      if (this.juI == null)
      {
        arrayOfByte = c.b(bg.qW().pt() + "eggingfo.ini", 0, -1);
        if (arrayOfByte != null)
          break label119;
        z.d("!24@/B4Tb64lLpKqZzcmoNorjw==", "data is null, parse EggList from config file fail");
      }
      while (true)
      {
        if (1000L * ap.ab(ap.b((Long)bg.qW().oQ().get(68108))) > 21600000L)
          new cm().postDelayed(new ml(this), 10000L);
        if (this.juI != null)
          break;
        z.d("!24@/B4Tb64lLpKqZzcmoNorjw==", "eggList is null");
        return false;
        label119: this.juI = new f().u(arrayOfByte);
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localException1.getLocalizedMessage();
        z.w("!24@/B4Tb64lLpKqZzcmoNorjw==", "init crash : %s, try delete egg file", arrayOfObject1);
        try
        {
          c.deleteFile(bg.qW().pt() + "eggingfo.ini");
          s.yO().ec(6);
        }
        catch (Exception localException2)
        {
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = localException2.getLocalizedMessage();
          z.w("!24@/B4Tb64lLpKqZzcmoNorjw==", "init crash cannot delete file: %s", arrayOfObject2);
        }
      }
      int i = (int)ch.CL();
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = Integer.valueOf(i);
      arrayOfObject3[1] = Integer.valueOf(this.juI.dAp.size());
      z.d("!24@/B4Tb64lLpKqZzcmoNorjw==", "cursecond is %d, getEggList.size is %d", arrayOfObject3);
      Iterator localIterator1 = this.juI.dAp.iterator();
      d locald;
      com.tencent.mm.ad.e locale;
      String str;
      label371: 
      do
        while (true)
        {
          if (!localIterator1.hasNext())
            break label636;
          locald = (d)localIterator1.next();
          Iterator localIterator2 = locald.dAi.iterator();
          while (localIterator2.hasNext())
          {
            locale = (com.tencent.mm.ad.e)localIterator2.next();
            str = locale.dAn;
            if (!ap.jb(str))
              break label371;
            z.e("!24@/B4Tb64lLpKqZzcmoNorjw==", "error egg keyWord");
          }
        }
      while (!y(paramString, str, locale.dAo));
      if (this.juJ == null)
      {
        ViewStub localViewStub = (ViewStub)paramActivity.findViewById(i.aVB);
        if (localViewStub != null)
          localViewStub.inflate();
        this.juJ = ((ChattingAnimFrame)paramActivity.findViewById(i.akN));
      }
      if ((locald.dAl <= i) && (i <= 86400L + locald.dAm))
      {
        this.juJ.g(paramActivity, locald.dAj);
        x(locald.dAk, paramBoolean);
        Object[] arrayOfObject5 = new Object[3];
        arrayOfObject5[0] = str;
        arrayOfObject5[1] = Integer.valueOf(locald.dAl);
        arrayOfObject5[2] = Integer.valueOf(locald.dAm);
        z.d("!24@/B4Tb64lLpKqZzcmoNorjw==", "match keyWord[%s], time[%d - %d]", arrayOfObject5);
        return true;
      }
      if ((locald.dAl == locald.dAm) && (locald.dAl == 0))
      {
        this.juJ.g(paramActivity, locald.dAj);
        x(locald.dAk, paramBoolean);
        z.d("!24@/B4Tb64lLpKqZzcmoNorjw==", "match keyWord[%s], time[0 - 0]", new Object[] { str });
        return true;
      }
      Object[] arrayOfObject4 = new Object[3];
      arrayOfObject4[0] = str;
      arrayOfObject4[1] = Integer.valueOf(locald.dAl);
      arrayOfObject4[2] = Integer.valueOf(locald.dAm);
      z.d("!24@/B4Tb64lLpKqZzcmoNorjw==", "match keyWord[%s], but not match time[%d - %d]", arrayOfObject4);
      return false;
      label636: z.d("!24@/B4Tb64lLpKqZzcmoNorjw==", "no match");
    }
    return false;
  }

  private static void x(int paramInt, boolean paramBoolean)
  {
    while (true)
    {
      com.tencent.mm.ad.g localg1;
      try
      {
        byte[] arrayOfByte1 = c.b(bg.qW().pt() + "eggresult.rep", 0, -1);
        h localh;
        com.tencent.mm.ad.g localg2;
        if (arrayOfByte1 != null)
        {
          z.d("!24@/B4Tb64lLpKqZzcmoNorjw==", "data not null, parse it");
          localh = new h().v(arrayOfByte1);
          Iterator localIterator = localh.dAt.iterator();
          if (!localIterator.hasNext())
            break label294;
          localg2 = (com.tencent.mm.ad.g)localIterator.next();
          if (localg2.dAk != paramInt)
            continue;
          if (paramBoolean)
          {
            localg2.dAr = (1 + localg2.dAr);
            break label300;
            if (i == 0)
            {
              localg1 = new com.tencent.mm.ad.g();
              localg1.dAk = paramInt;
              if (!paramBoolean)
                break label285;
              localg1.dAr = 1;
              localh.dAt.add(localg1);
            }
            byte[] arrayOfByte2 = localh.toByteArray();
            Object[] arrayOfObject2 = new Object[1];
            arrayOfObject2[0] = localh.toString();
            z.d("!24@/B4Tb64lLpKqZzcmoNorjw==", "report list is %s, then save it", arrayOfObject2);
            c.a(bg.qW().pt() + "eggresult.rep", arrayOfByte2, arrayOfByte2.length);
          }
        }
        else
        {
          z.d("!24@/B4Tb64lLpKqZzcmoNorjw==", "data is null, new one");
          localh = new h();
          continue;
        }
        localg2.dAs = (1 + localg2.dAs);
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localException.getLocalizedMessage();
        z.w("!24@/B4Tb64lLpKqZzcmoNorjw==", "statistics crash : %s", arrayOfObject1);
        return;
      }
      label285: localg1.dAs = 1;
      continue;
      label294: int i = 0;
      continue;
      label300: i = 1;
    }
  }

  private static boolean y(String paramString1, String paramString2, String paramString3)
  {
    if ((ap.jb(paramString1)) || (ap.jb(paramString2)) || (ak.getContext() == null));
    String str1;
    int i;
    do
    {
      return false;
      str1 = paramString1.toLowerCase();
      i = str1.indexOf(paramString2.toLowerCase());
    }
    while (i == -1);
    int j = i;
    while (true)
    {
      int m;
      try
      {
        if ((j < -1 + str1.length()) && (!ap.jb(paramString3)))
          if ((j > 0) && (str1.charAt(j - 1) >= 'a') && (str1.charAt(j - 1) <= 'z'))
          {
            z.v("!24@/B4Tb64lLpKqZzcmoNorjw==", "letter in the prefix");
            String str2 = paramString1.substring(0, j);
            m = str2.lastIndexOf('/');
            if (m == -1)
              break label393;
            String str3 = str2.subSequence(m, str2.length());
            com.tencent.mm.ar.g localg = com.tencent.mm.ar.e.at(ak.getContext(), str3);
            if ((localg == null) || (localg.text == null) || (m + localg.text.length() != j))
              break label393;
            z.v("!24@/B4Tb64lLpKqZzcmoNorjw==", "letter in the prefix is smiley");
            m = -2;
            break label393;
            if ((bool) && (j + paramString2.length() < str1.length()) && (str1.charAt(j + paramString2.length()) >= 'a') && (str1.charAt(j + paramString2.length()) <= 'z'))
            {
              z.v("!24@/B4Tb64lLpKqZzcmoNorjw==", "letter in the suffix");
              bool = false;
            }
            label271: if (bool)
            {
              Object[] arrayOfObject2 = new Object[3];
              arrayOfObject2[0] = Integer.valueOf(j);
              arrayOfObject2[1] = Integer.valueOf(str1.length());
              arrayOfObject2[2] = Integer.valueOf(paramString2.length());
              z.v("!24@/B4Tb64lLpKqZzcmoNorjw==", "full match, matchPos = %s, TextLength = %s, keyLength = %s", arrayOfObject2);
              return bool;
            }
            int k = str1.indexOf(paramString2.toLowerCase(), j + 1);
            i = k;
            if (i != -1)
              break;
            return false;
          }
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localException.getMessage();
        z.v("!24@/B4Tb64lLpKqZzcmoNorjw==", "Exception in isKeywordMatch, %s", arrayOfObject1);
        return false;
      }
      label393: 
      do
      {
        bool = true;
        break;
        bool = true;
        break label271;
      }
      while (m == -2);
      boolean bool = false;
    }
  }

  public final void a(List paramList, Activity paramActivity, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.hFY = paramList;
    this.juK = paramActivity;
    this.dsv = paramBoolean1;
    if (paramBoolean2);
    Iterator localIterator;
    do
      do
      {
        this.gQj.sendEmptyMessageDelayed(0, 800L);
        return;
        while (paramList == null);
        localIterator = paramList.iterator();
      }
      while (!localIterator.hasNext());
    while (!a((String)localIterator.next(), paramActivity, paramBoolean1));
  }

  public final void aWq()
  {
    this.gQj.removeMessages(0);
    if (this.juJ != null)
      this.juJ.stop();
    z.d("!24@/B4Tb64lLpKqZzcmoNorjw==", "egg has been stop");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.mj
 * JD-Core Version:    0.6.2
 */