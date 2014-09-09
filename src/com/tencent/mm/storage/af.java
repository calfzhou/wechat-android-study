package com.tencent.mm.storage;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.tencent.mm.as.f;
import com.tencent.mm.as.g;
import com.tencent.mm.as.h;
import com.tencent.mm.protocal.a.gm;
import com.tencent.mm.protocal.a.qg;
import com.tencent.mm.sdk.f.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class af extends ah
  implements g
{
  public static final String[] dmc = arrayOfString;
  private com.tencent.mm.sdk.f.af dtV;
  private SharedPreferences iji;

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(ae.dhu, "EmojiInfoDesc");
  }

  public af(com.tencent.mm.sdk.f.af paramaf)
  {
    this(paramaf, ae.dhu, "EmojiInfoDesc");
  }

  private af(com.tencent.mm.sdk.f.af paramaf, com.tencent.mm.sdk.f.ae paramae, String paramString)
  {
    super(paramaf, paramae, paramString, null);
    this.dtV = paramaf;
    this.iji = PreferenceManager.getDefaultSharedPreferences(ak.getContext());
  }

  public static boolean aJp()
  {
    return true;
  }

  private boolean zb(String paramString)
  {
    boolean bool1 = TextUtils.isEmpty(paramString);
    boolean bool2 = false;
    String str;
    String[] arrayOfString;
    Cursor localCursor;
    if (!bool1)
    {
      str = String.format("select %s from %s where %s=?", new Object[] { "desc", "EmojiInfoDesc", "groupId", "lang" });
      arrayOfString = new String[] { paramString };
      localCursor = null;
    }
    try
    {
      localCursor = this.dtV.rawQuery(str, arrayOfString);
      bool2 = false;
      if (localCursor != null)
      {
        boolean bool3 = localCursor.moveToFirst();
        bool2 = false;
        if (bool3)
          bool2 = true;
      }
      return bool2;
    }
    catch (Exception localException)
    {
      z.w("!56@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyMF0Xpt1phU6jzUyNjz5ZCw==", localException.toString());
      bool2 = false;
      return false;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
    }
  }

  public final int a(f paramf)
  {
    if (paramf != null)
      this.dtV = paramf;
    return 0;
  }

  public final boolean a(List paramList, String paramString, int paramInt1, int paramInt2)
  {
    if ((paramList == null) || (paramList.size() <= 0))
      return false;
    h localh2;
    long l;
    if ((this.dtV instanceof h))
    {
      localh2 = (h)this.dtV;
      l = localh2.dc(Thread.currentThread().getId());
    }
    for (h localh1 = localh2; ; localh1 = null)
    {
      this.dtV.delete("EmojiInfoDesc", "groupId=?", new String[] { paramString });
      ae localae = new ae();
      localae.field_groupId = paramString;
      localae.field_click_flag = paramInt1;
      localae.field_download_flag = paramInt2;
      Iterator localIterator1 = paramList.iterator();
      ContentValues localContentValues;
      do
      {
        Iterator localIterator2;
        while (!localIterator2.hasNext())
        {
          if (!localIterator1.hasNext())
            break;
          gm localgm = (gm)localIterator1.next();
          localae.field_md5 = localgm.hWb;
          localIterator2 = localgm.hQc.iterator();
        }
        qg localqg = (qg)localIterator2.next();
        localae.field_desc = localqg.hwQ;
        localae.field_lang = localqg.hPf;
        localae.field_md5_lang = (localae.field_md5 + localae.field_lang);
        localContentValues = localae.ir();
      }
      while (this.dtV.replace("EmojiInfoDesc", "md5_lang", localContentValues) >= 0L);
      if (localh1 != null)
        localh1.dd(l);
      return false;
      this.dtV.replace("EmojiInfoDesc", "md5_lang", localae.ir());
      if (localh1 != null)
        localh1.dd(l);
      this.iji.edit().putLong("274544" + paramString, System.currentTimeMillis()).commit();
      return true;
      l = -1L;
    }
  }

  public final String kN(String paramString)
  {
    String str1 = String.format("select %s from %s where %s=?", new Object[] { "desc", "EmojiInfoDesc", "md5_lang" });
    String[] arrayOfString1 = new String[1];
    arrayOfString1[0] = (paramString + y.aGW().toLowerCase());
    Cursor localCursor1 = this.dtV.rawQuery(str1, arrayOfString1);
    boolean bool = localCursor1.moveToFirst();
    String str2 = null;
    if (bool)
      str2 = localCursor1.getString(localCursor1.getColumnIndex("desc"));
    localCursor1.close();
    if (!ch.jb(str2))
      return str2;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = (paramString + "default");
    Cursor localCursor2 = this.dtV.rawQuery(str1, arrayOfString2);
    if (localCursor2.moveToFirst())
      str2 = localCursor2.getString(localCursor2.getColumnIndex("desc"));
    localCursor2.close();
    return str2;
  }

  public final boolean za(String paramString)
  {
    int i = 1;
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = "click_flag";
    arrayOfObject1[i] = "EmojiInfoDesc";
    arrayOfObject1[2] = "groupId";
    String str = String.format("select %s from %s where %s=?", arrayOfObject1);
    String[] arrayOfString = new String[i];
    arrayOfString[0] = paramString;
    Cursor localCursor = null;
    try
    {
      localCursor = this.dtV.rawQuery(str, arrayOfString);
      bool1 = false;
      if (localCursor != null)
      {
        boolean bool2 = localCursor.moveToFirst();
        bool1 = false;
        if (bool2)
        {
          int j = localCursor.getInt(localCursor.getColumnIndex("click_flag"));
          if (j != i)
            break label128;
        }
      }
      while (true)
      {
        bool1 = i;
        return bool1;
        label128: i = 0;
      }
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = localException.toString();
      z.w("!56@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyMF0Xpt1phU6jzUyNjz5ZCw==", "[isPurChase] Exception:%s", arrayOfObject2);
      boolean bool1 = false;
      return false;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
    }
  }

  public final boolean zc(String paramString)
  {
    if ((!TextUtils.isEmpty(paramString)) && (!paramString.equals(ab.iiH)))
    {
      long l = this.iji.getLong("274544" + paramString, 0L);
      if (System.currentTimeMillis() - l >= 86400000L);
      while (!zb(paramString))
        return true;
      return false;
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.af
 * JD-Core Version:    0.6.2
 */