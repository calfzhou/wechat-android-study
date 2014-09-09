package com.tencent.mm.f;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b
{
  public static final int[] dPg = { 1 };
  private HashMap dPh = new HashMap();
  private int id;
  private int version;

  public b(int paramInt)
  {
    this.id = paramInt;
  }

  private static boolean cM(String paramString)
  {
    while (true)
    {
      int i;
      try
      {
        if (ch.jb(paramString))
          return false;
        ArrayList localArrayList = new ArrayList();
        if (!ch.jb(paramString))
        {
          String[] arrayOfString = paramString.split(",");
          if ((arrayOfString != null) && (arrayOfString.length > 0))
          {
            i = 0;
            if (i < arrayOfString.length)
            {
              if (ch.jb(arrayOfString[i]))
                break label235;
              localArrayList.add(arrayOfString[i]);
              break label235;
            }
          }
        }
        String str1 = y.aGW();
        if (ch.jb(str1))
          return false;
        z.d("!32@/B4Tb64lLpIGhQOF66mZz2YYmnWBJuR7", "locale is " + str1);
        Iterator localIterator = localArrayList.iterator();
        if (localIterator.hasNext())
        {
          String str2 = (String)localIterator.next();
          if ((str2.trim().toLowerCase().equals("other")) && (!str1.equals("zh_CN")))
          {
            z.d("!32@/B4Tb64lLpIGhQOF66mZz2YYmnWBJuR7", "find other");
            return true;
          }
          if (!str2.trim().toLowerCase().equals(str1.trim().toLowerCase()))
            continue;
          z.d("!32@/B4Tb64lLpIGhQOF66mZz2YYmnWBJuR7", "find ");
          return true;
        }
      }
      catch (Exception localException)
      {
        z.d("!32@/B4Tb64lLpIGhQOF66mZz2YYmnWBJuR7", "isContainLocale failed " + localException.getMessage());
      }
      return false;
      label235: i++;
    }
  }

  public final String U(String paramString1, String paramString2)
  {
    if (this.dPh.containsKey(paramString1))
      return (String)((HashMap)this.dPh.get(paramString1)).get(paramString2);
    return null;
  }

  public final void cL(String paramString)
  {
    Map localMap = x.bB(paramString, "ConfigList");
    if (localMap.containsKey(".ConfigList.$version"))
      this.version = Integer.valueOf((String)localMap.get(".ConfigList.$version")).intValue();
    label135: label163: label203: label464: for (int i = 0; ; i++)
    {
      StringBuilder localStringBuilder1 = new StringBuilder(".ConfigList.Config");
      Object localObject1;
      String str2;
      int j;
      Object localObject2;
      String str3;
      Object localObject3;
      String str4;
      StringBuilder localStringBuilder4;
      if (i == 0)
      {
        localObject1 = "";
        String str1 = localObject1;
        if (localMap.get(str1 + ".$name") == null)
          break;
        str2 = (String)localMap.get(str1 + ".$name");
        j = 0;
        StringBuilder localStringBuilder2 = new StringBuilder().append(str1).append(".Item");
        if (j != 0)
          break label434;
        localObject2 = "";
        str3 = localObject2;
        StringBuilder localStringBuilder3 = new StringBuilder().append(str1).append(".Item");
        if (j != 0)
          break label444;
        localObject3 = "";
        str4 = localObject3 + ".$key";
        localStringBuilder4 = new StringBuilder().append(str1).append(".Item");
        if (j != 0)
          break label454;
      }
      for (Object localObject4 = ""; ; localObject4 = Integer.valueOf(j))
      {
        String str5 = localObject4 + ".$lang";
        if (!localMap.containsKey(str3))
          break label464;
        String str6 = (String)localMap.get(str4);
        String str7 = (String)localMap.get(str3);
        String str8 = (String)localMap.get(str5);
        z.d("!32@/B4Tb64lLpIGhQOF66mZz2YYmnWBJuR7", "itemKey " + str6 + " itemValue " + str7 + " itemLang " + str8);
        if ((str8 == null) || (cM(str8)))
        {
          if (!this.dPh.containsKey(str2))
            this.dPh.put(str2, new HashMap());
          ((HashMap)this.dPh.get(str2)).put(str6, str7);
        }
        j++;
        break label135;
        localObject1 = Integer.valueOf(i);
        break;
        localObject2 = Integer.valueOf(j);
        break label163;
        localObject3 = Integer.valueOf(j);
        break label203;
      }
    }
    label434: label444: label454: return;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.f.b
 * JD-Core Version:    0.6.2
 */