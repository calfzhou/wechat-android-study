package com.tencent.mm.pluginsdk.ui.musicplayer;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
{
  private ArrayList hFA = new ArrayList();
  private LinkedList hFB = new LinkedList();
  private int hFC = 0;
  private String hFD;
  private String hFE;
  private String hFF;
  private long hFG;
  private String hFH;
  private String hFI;
  private boolean hFJ = false;
  private String title;

  private static void a(a parama, b paramb)
  {
    for (int i = -1 + parama.hFA.size(); ; i--)
      if ((i >= 0) && (((b)parama.hFA.get(i)).timestamp != paramb.timestamp))
      {
        if (((b)parama.hFA.get(i)).timestamp < paramb.timestamp)
          parama.hFA.add(i + 1, paramb);
      }
      else
      {
        if (i < 0)
          parama.hFA.add(0, paramb);
        return;
      }
  }

  public static a bh(String paramString1, String paramString2)
  {
    if (paramString1 == null)
    {
      z.w("!24@/B4Tb64lLpIWml4tN+VM9w==", "getLrcMgr: but lrc is null");
      return null;
    }
    long l = ch.CN();
    z.w("!24@/B4Tb64lLpIWml4tN+VM9w==", "getLrcMgr beg: src lrc = %s", new Object[] { paramString1 });
    a locala = new a();
    if (paramString1 == null)
      z.w("!24@/B4Tb64lLpIWml4tN+VM9w==", "parserLrc: but lrc or lrcMgr is null");
    while (true)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(locala.hFA.size());
      z.i("!24@/B4Tb64lLpIWml4tN+VM9w==", "parse finish: sentence size [%d], result:", arrayOfObject2);
      Iterator localIterator = locala.hFA.iterator();
      while (localIterator.hasNext())
        z.i("!24@/B4Tb64lLpIWml4tN+VM9w==", ((b)localIterator.next()).toString());
      String str1 = paramString1.replaceAll("\n", " ").replaceAll("\r", " ");
      Matcher localMatcher1 = Pattern.compile("(\\[((\\d{2}:\\d{2}(\\.\\d{2}){0,1}\\])|(al:|ar:|by:|offset:|re:|ti:|ve:))[^\\[]*)").matcher(str1);
      label648: 
      while (localMatcher1.find())
      {
        String str2 = localMatcher1.group();
        int k = localMatcher1.start();
        int m = localMatcher1.end();
        Object[] arrayOfObject4 = new Object[3];
        arrayOfObject4[0] = str2;
        arrayOfObject4[1] = Integer.valueOf(k);
        arrayOfObject4[2] = Integer.valueOf(m);
        z.i("!24@/B4Tb64lLpIWml4tN+VM9w==", "new msg %s , start %d , end %d", arrayOfObject4);
        if (str2 == null)
        {
          z.w("!24@/B4Tb64lLpIWml4tN+VM9w==", "parserLine fail: lrcMgr or str is null");
        }
        else if (str2.startsWith("[ti:"))
        {
          locala.title = bi(str2, "[ti:");
        }
        else if (str2.startsWith("[ar:"))
        {
          locala.hFD = bi(str2, "[ar:");
        }
        else if (str2.startsWith("[al:"))
        {
          locala.hFE = bi(str2, "[al:");
        }
        else if (str2.startsWith("[by:"))
        {
          locala.hFF = bi(str2, "[by:");
        }
        else if (str2.startsWith("[offset:"))
        {
          locala.hFG = ch.getLong(bi(str2, "[offset:"), 0L);
        }
        else if (str2.startsWith("[re:"))
        {
          locala.hFH = bi(str2, "[re:");
        }
        else if (str2.startsWith("[ve:"))
        {
          locala.hFI = bi(str2, "[ve:");
        }
        else
        {
          Pattern localPattern = Pattern.compile("\\[(\\d{2}:\\d{2}(\\.\\d{2}){0,1})\\]");
          Matcher localMatcher2 = localPattern.matcher(str2);
          b localb4 = new b();
          while (true)
          {
            if (!localMatcher2.find())
              break label648;
            if (localMatcher2.groupCount() > 0)
              localb4.timestamp = vK(localMatcher2.group(1));
            String[] arrayOfString = localPattern.split(str2);
            int n;
            if ((arrayOfString != null) && (arrayOfString.length > 0))
            {
              String str3 = arrayOfString[(-1 + arrayOfString.length)];
              if (str3 != null)
                str3 = str3.trim();
              if (ch.jb(str3))
                str3 = " ";
              localb4.content = str3;
              n = 0;
            }
            while (true)
              if (n < locala.hFB.size())
              {
                b localb5 = new b();
                localb5.timestamp = ((Long)locala.hFB.get(n)).longValue();
                localb5.content = localb4.content;
                b.b(localb5);
                a(locala, localb5);
                n++;
                continue;
                z.d("!24@/B4Tb64lLpIWml4tN+VM9w==", "need repeat");
                locala.hFB.add(Long.valueOf(localb4.timestamp));
                break;
              }
            locala.hFB.clear();
            a(locala, localb4);
          }
        }
      }
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Long.valueOf(locala.hFG);
      z.d("!24@/B4Tb64lLpIWml4tN+VM9w==", "handle offset %d", arrayOfObject1);
      if (locala.hFG != 0L)
      {
        for (int j = 0; j < locala.hFA.size(); j++)
        {
          b localb3 = (b)locala.hFA.get(j);
          localb3.timestamp += locala.hFG;
        }
        locala.hFG = 0L;
      }
      for (int i = 0; i < -1 + locala.hFA.size(); i++)
      {
        b localb1 = (b)locala.hFA.get(i);
        if ((b.a(localb1)) && (localb1.content.equals(((b)locala.hFA.get(i + 1)).content)))
          localb1.content = " ";
      }
    }
    if (ch.jb(paramString2))
      z.w("!24@/B4Tb64lLpIWml4tN+VM9w==", "add lyric prefix: but prefix is empty, return");
    while (true)
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Long.valueOf(ch.ad(l));
      z.w("!24@/B4Tb64lLpIWml4tN+VM9w==", "getLrcMgr finish: use %d ms", arrayOfObject3);
      return locala;
      b localb2 = new b();
      localb2.timestamp = 0L;
      localb2.content = paramString2;
      if (locala.hFA.isEmpty())
      {
        locala.hFA.add(localb2);
      }
      else if (locala.hFA.size() == 1)
      {
        locala.hFA.add(0, localb2);
        ((b)locala.hFA.get(1)).timestamp = 5000L;
      }
      else
      {
        locala.hFA.add(0, localb2);
        ((b)locala.hFA.get(1)).timestamp = (3L * (((b)locala.hFA.get(2)).timestamp >> 2));
      }
    }
  }

  private static String bi(String paramString1, String paramString2)
  {
    if ((ch.jb(paramString1)) || (ch.jb(paramString2)))
      return paramString1;
    if (paramString2.length() >= -1 + paramString1.length())
      return "";
    String str = paramString1.substring(paramString2.length(), -1 + paramString1.length());
    z.d("!24@/B4Tb64lLpIWml4tN+VM9w==", "str[%s] prefix[%s] attr[%s]", new Object[] { paramString1, paramString2, str });
    return str;
  }

  private static long vK(String paramString)
  {
    while (true)
    {
      try
      {
        String[] arrayOfString1 = paramString.split(":");
        int i = Integer.parseInt(arrayOfString1[0]);
        if (arrayOfString1.length > 1)
        {
          String[] arrayOfString2 = arrayOfString1[1].split("\\.");
          k = Integer.parseInt(arrayOfString2[0]);
          int m = arrayOfString2.length;
          j = 0;
          if (m > 1)
          {
            int n = Integer.parseInt(arrayOfString2[1]);
            j = n;
          }
          return 1000 * (i * 60) + k * 1000 + j * 10;
        }
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localException.getLocalizedMessage();
        z.w("!24@/B4Tb64lLpIWml4tN+VM9w==", "strToLong error: %s", arrayOfObject);
        return 0L;
      }
      int j = 0;
      int k = 0;
    }
  }

  public final float a(float paramFloat, long paramLong)
  {
    int i = cC(paramLong);
    if (-1 == i)
    {
      z.w("!24@/B4Tb64lLpIWml4tN+VM9w==", "getCurVelocity: but getCurIndex fail");
      return 0.0F;
    }
    if (i == -1 + this.hFA.size())
      return 0.0F;
    long l = ((b)this.hFA.get(i + 1)).timestamp - ((b)this.hFA.get(i)).timestamp;
    if (0L == l)
      return 0.0F;
    return paramFloat / (float)l;
  }

  public final boolean aCN()
  {
    return this.hFJ;
  }

  public final long aCO()
  {
    if (this.hFA.isEmpty())
      return 20000L;
    return 20000L + ((b)this.hFA.get(-1 + this.hFA.size())).timestamp;
  }

  public final int aCP()
  {
    return this.hFA.size();
  }

  public final void cB(long paramLong)
  {
    if (this.hFJ)
    {
      z.w("!24@/B4Tb64lLpIWml4tN+VM9w==", "has add tail");
      return;
    }
    this.hFJ = true;
    if (this.hFA.isEmpty());
    for (b localb1 = new b(); ; localb1 = (b)this.hFA.get(-1 + this.hFA.size()))
    {
      long l1 = Math.max(paramLong, localb1.timestamp);
      long l2 = Math.max(l1 - 5000L, l1 + localb1.timestamp >> 1);
      long l3 = (l1 - l2) / 5L;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Long.valueOf(l1);
      arrayOfObject[1] = Long.valueOf(l2);
      arrayOfObject[2] = Long.valueOf(l3);
      z.i("!24@/B4Tb64lLpIWml4tN+VM9w==", "maxTimestamp[%d], begTimestamp[%d], step[%d]", arrayOfObject);
      for (int i = 0; i < 5; i++)
      {
        b localb2 = new b();
        localb2.timestamp = (l2 + l3 * i);
        localb2.content = " ";
        this.hFA.add(localb2);
      }
      break;
    }
  }

  public final int cC(long paramLong)
  {
    if (this.hFA.isEmpty())
    {
      z.w("!24@/B4Tb64lLpIWml4tN+VM9w==", "getCurIndex: but sentence list is empty");
      return -1;
    }
    int j;
    if (((b)this.hFA.get(this.hFC)).timestamp <= paramLong)
    {
      j = -1 + this.hFA.size();
      for (int k = this.hFC; k < j; k++)
        if ((((b)this.hFA.get(k)).timestamp <= paramLong) && (paramLong < ((b)this.hFA.get(k + 1)).timestamp))
        {
          this.hFC = k;
          return this.hFC;
        }
    }
    for (this.hFC = j; ; this.hFC = 0)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(this.hFC);
      z.w("!24@/B4Tb64lLpIWml4tN+VM9w==", "curIndex %d", arrayOfObject);
      return this.hFC;
      for (int i = this.hFC; i > 0; i--)
        if ((((b)this.hFA.get(i)).timestamp >= paramLong) && (paramLong > ((b)this.hFA.get(i - 1)).timestamp))
        {
          this.hFC = i;
          return this.hFC;
        }
    }
  }

  public final b mV(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.hFA.size()))
      return null;
    return (b)this.hFA.get(paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.musicplayer.a
 * JD-Core Version:    0.6.2
 */