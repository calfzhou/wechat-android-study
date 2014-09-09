package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.modelsearch.a;
import com.tencent.mm.modelsearch.j;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class cj
{
  public static final String a(Context paramContext, bc parambc)
  {
    if (parambc.jyu)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      com.tencent.mm.modelsearch.h localh = parambc.gpv;
      i locali = parambc.elz;
      switch (localh.dBM)
      {
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 22:
      default:
      case 1:
      case 3:
      case 9:
      case 10:
      case 23:
      case 2:
      case 7:
      case 8:
      case 4:
      case 5:
      case 6:
      case 11:
      case 12:
      case 13:
      case 14:
      case 21:
      }
      while (localStringBuilder.length() > 0)
      {
        return localStringBuilder.toString();
        if (!ch.jb(locali.iS()))
        {
          localStringBuilder.append(paramContext.getResources().getString(n.bLI));
          localStringBuilder.append(locali.iS());
        }
        else if (!ch.jb(locali.getUsername()))
        {
          localStringBuilder.append(paramContext.getResources().getString(n.bLI));
          localStringBuilder.append(locali.getUsername());
          continue;
          if ((!ch.jb(locali.ja())) && (c(locali, locali.ja())))
          {
            localStringBuilder.append(paramContext.getResources().getString(n.bLH));
            localStringBuilder.append(locali.ja());
            continue;
            if (!ch.jb(locali.jC()))
            {
              localStringBuilder.append(paramContext.getResources().getString(n.bLH));
              localStringBuilder.append(locali.jC());
              continue;
              if ((!ch.jb(locali.iV())) && (c(locali, locali.iV())))
              {
                localStringBuilder.append(paramContext.getResources().getString(n.bLG));
                localStringBuilder.append(locali.iV());
                continue;
                String str = b(paramContext, parambc);
                if (str != null)
                  localStringBuilder.append(str);
              }
            }
          }
        }
      }
    }
    return null;
  }

  private static final String b(Context paramContext, bc parambc)
  {
    com.tencent.mm.modelsearch.h localh = parambc.gpv;
    if (localh.type != 131073)
      return null;
    i locali = parambc.elz;
    com.tencent.mm.as.h localh1 = bg.qW().oO();
    String[] arrayOfString1 = new String[1];
    arrayOfString1[0] = locali.getUsername();
    Cursor localCursor = localh1.rawQuery("SELECT memberlist FROM chatroom WHERE chatroomname=?;", arrayOfString1);
    String str;
    String[] arrayOfString3;
    if (localCursor.moveToFirst())
    {
      str = localCursor.getString(0);
      if (str == null)
        arrayOfString3 = null;
    }
    for (String[] arrayOfString2 = arrayOfString3; ; arrayOfString2 = null)
    {
      localCursor.close();
      if ((arrayOfString2 == null) || (localh.CG == null) || (!(localh.CG instanceof List)))
        break;
      List localList = (List)localh.CG;
      Arrays.sort(arrayOfString2, new ck());
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramContext.getResources().getString(n.bLF));
      Iterator localIterator = localList.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          j localj = (j)localIterator.next();
          if ((localj.dBX >= 0) && (localj.dBX < arrayOfString2.length))
          {
            localStringBuilder.append(y.dh(arrayOfString2[localj.dBX]));
            localStringBuilder.append("、");
            continue;
            arrayOfString3 = a.dBH.split(str);
            break;
          }
        }
      localStringBuilder.deleteCharAt(-1 + localStringBuilder.length());
      return localStringBuilder.toString();
    }
  }

  public static final Cursor bd(List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = bg.qW().oW().d(y.dkj, paramList, null);
    if (localCursor.moveToFirst())
    {
      int i = 0;
      do
      {
        r localr = new r();
        localr.b(localCursor);
        if (sM(localr.getUsername()))
        {
          localArrayList.add(localr.getUsername());
          i++;
          if (i >= 4)
            break;
        }
      }
      while (localCursor.moveToNext());
    }
    if (localArrayList.size() == 0)
      return bg.qW().oT().aIA();
    return bg.qW().oT().aK(localArrayList);
  }

  private static final boolean c(i parami, String paramString)
  {
    return !parami.od().equals(paramString);
  }

  private static final boolean sM(String paramString)
  {
    String[] arrayOfString = y.dko;
    int i = arrayOfString.length;
    int j = 0;
    if (j < i)
      if (!paramString.equals(arrayOfString[j]));
    while ((y.dc(paramString)) || (y.dj(paramString)))
    {
      return false;
      j++;
      break;
    }
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.cj
 * JD-Core Version:    0.6.2
 */