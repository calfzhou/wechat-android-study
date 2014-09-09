package com.tencent.mm.ui.widget;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;

final class m
{
  private ArrayList kbA = new ArrayList();
  private ArrayList kbz = new ArrayList();

  public static m DD(String paramString)
  {
    m localm = new m();
    if (ch.jb(paramString))
    {
      z.e("!56@/B4Tb64lLpLUa7oZpyRLqij3W7tXskNBXnuaPQThJwsm2AtcGko5rg==", "parse fail, section is null");
      return localm;
    }
    while (true)
    {
      int j;
      try
      {
        String[] arrayOfString1 = paramString.split("\\|");
        if (arrayOfString1 == null)
          break;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(arrayOfString1.length);
        z.d("!56@/B4Tb64lLpLUa7oZpyRLqij3W7tXskNBXnuaPQThJwsm2AtcGko5rg==", "parse items array length = %d", arrayOfObject2);
        int i = arrayOfString1.length;
        j = 0;
        if (j < i)
        {
          String str = arrayOfString1[j];
          if (!ch.jb(str))
          {
            String[] arrayOfString2 = str.split(",");
            if ((arrayOfString2 != null) && (arrayOfString2.length == 2))
            {
              localm.kbz.add(Integer.valueOf(ch.getInt(arrayOfString2[0], 0)));
              localm.kbA.add(Integer.valueOf(ch.getInt(arrayOfString2[1], 0)));
            }
          }
        }
        else
        {
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = Integer.valueOf(localm.kbz.size());
          z.d("!56@/B4Tb64lLpLUa7oZpyRLqij3W7tXskNBXnuaPQThJwsm2AtcGko5rg==", "parse items list size = %d", arrayOfObject3);
          return localm;
        }
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localException.getMessage();
        z.e("!56@/B4Tb64lLpLUa7oZpyRLqij3W7tXskNBXnuaPQThJwsm2AtcGko5rg==", "parse ex = %s", arrayOfObject1);
        return localm;
      }
      j++;
    }
  }

  public final boolean rC(int paramInt)
  {
    for (int i = 0; ; i++)
    {
      int j = this.kbz.size();
      boolean bool = false;
      if (i < j)
      {
        int k = ((Integer)this.kbz.get(i)).intValue();
        int m = ((Integer)this.kbA.get(i)).intValue();
        if ((k >= 0) && (m > 0) && (m >= k) && (k <= paramInt) && (paramInt <= m))
          bool = true;
      }
      else
      {
        return bool;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.m
 * JD-Core Version:    0.6.2
 */