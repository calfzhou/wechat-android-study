package com.tencent.mm.sdk.f;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;

public abstract class ah extends ai
{
  private final af dtV;
  private final ae iGz;
  private final String ihe;

  public ah(af paramaf, ae paramae, String paramString, String[] paramArrayOfString)
  {
    this.dtV = paramaf;
    this.iGz = paramae;
    ae localae = this.iGz;
    if (ch.jb(this.iGz.ihb));
    for (String str = "rowid"; ; str = this.iGz.ihb)
    {
      localae.ihb = str;
      this.ihe = paramString;
      List localList = a(this.iGz, wj(), this.dtV);
      for (int i = 0; i < localList.size(); i++)
        this.dtV.bp(this.ihe, (String)localList.get(i));
    }
    if (paramArrayOfString != null)
    {
      int j = paramArrayOfString.length;
      int k = 0;
      if (j > 0)
        while (k < paramArrayOfString.length)
        {
          this.dtV.bp(this.ihe, paramArrayOfString[k]);
          k++;
        }
    }
  }

  private void AY(String paramString)
  {
    z.d("!44@/B4Tb64lLpINxdz9rK2idJLP/o47Oe9eivOf1xIfPaU=", wj() + ":" + paramString);
  }

  private void AZ(String paramString)
  {
    z.e("!44@/B4Tb64lLpINxdz9rK2idJLP/o47Oe9eivOf1xIfPaU=", wj() + ":" + paramString);
  }

  public static String a(ae paramae, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("CREATE TABLE IF NOT EXISTS " + paramString + " ( ");
    localStringBuilder.append(paramae.dlP);
    localStringBuilder.append(");");
    return localStringBuilder.toString();
  }

  private static StringBuilder a(ContentValues paramContentValues, String[] paramArrayOfString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str = paramArrayOfString[j];
      localStringBuilder.append(str + " = ? AND ");
      if (paramContentValues.get(str) == null)
        return null;
    }
    localStringBuilder.append(" 1=1");
    return localStringBuilder;
  }

  public static List a(ae paramae, String paramString, af paramaf)
  {
    LinkedList localLinkedList = new LinkedList();
    if ((paramaf == null) || (paramString == null))
    {
      Object[] arrayOfObject = new Object[2];
      if (paramaf == null);
      for (boolean bool = true; ; bool = false)
      {
        arrayOfObject[0] = Boolean.valueOf(bool);
        arrayOfObject[1] = paramString;
        z.e("!44@/B4Tb64lLpINxdz9rK2idJLP/o47Oe9eivOf1xIfPaU=", "dk getUpdateSQLs db==null :%b  table:%s", arrayOfObject);
        return localLinkedList;
      }
    }
    Cursor localCursor = paramaf.rawQuery("PRAGMA table_info( " + paramString + " )", new String[0]);
    if (localCursor == null)
      return localLinkedList;
    HashMap localHashMap = new HashMap();
    while (localCursor.moveToNext())
      localHashMap.put(localCursor.getString(localCursor.getColumnIndex("name")), localCursor.getString(localCursor.getColumnIndex("type")));
    localCursor.close();
    Iterator localIterator = paramae.iGy.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str1 = (String)localEntry.getValue();
      String str2 = (String)localEntry.getKey();
      if ((str1 != null) && (str1.length() > 0))
      {
        String str3 = (String)localHashMap.get(str2);
        if (str3 == null)
        {
          localLinkedList.add("ALTER TABLE " + paramString + " ADD COLUMN " + str2 + " " + str1 + ";");
          localHashMap.remove(str2);
        }
        else if (!str1.toLowerCase().startsWith(str3.toLowerCase()))
        {
          z.e("!44@/B4Tb64lLpINxdz9rK2idJLP/o47Oe9eivOf1xIfPaU=", "conflicting alter table on column: " + str2 + ", " + str3 + "<o-n>" + str1);
          localHashMap.remove(str2);
        }
      }
    }
    return localLinkedList;
  }

  private boolean a(ContentValues paramContentValues)
  {
    af localaf = this.dtV;
    String str1 = wj();
    String[] arrayOfString1 = this.iGz.dhI;
    String str2 = this.iGz.ihb + " = ?";
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = ch.ja(paramContentValues.getAsString(this.iGz.ihb));
    Cursor localCursor = localaf.a(str1, arrayOfString1, str2, arrayOfString2, null, null);
    boolean bool = ad.a(paramContentValues, localCursor);
    localCursor.close();
    return bool;
  }

  private static String[] a(String[] paramArrayOfString, ContentValues paramContentValues)
  {
    String[] arrayOfString = new String[paramArrayOfString.length];
    for (int i = 0; i < arrayOfString.length; i++)
      arrayOfString[i] = ch.ja(paramContentValues.getAsString(paramArrayOfString[i]));
    return arrayOfString;
  }

  public boolean a(long paramLong, ad paramad)
  {
    ContentValues localContentValues = paramad.ir();
    boolean bool;
    if ((localContentValues == null) || (localContentValues.size() <= 0))
    {
      AZ("update failed, value.size <= 0");
      bool = false;
    }
    while (true)
    {
      return bool;
      af localaf1 = this.dtV;
      String str1 = wj();
      String[] arrayOfString1 = this.iGz.dhI;
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = String.valueOf(paramLong);
      Cursor localCursor = localaf1.a(str1, arrayOfString1, "rowid = ?", arrayOfString2, null, null);
      if (ad.a(localContentValues, localCursor))
      {
        localCursor.close();
        AY("no need replace , fields no change");
        return true;
      }
      localCursor.close();
      af localaf2 = this.dtV;
      String str2 = wj();
      String[] arrayOfString3 = new String[1];
      arrayOfString3[0] = String.valueOf(paramLong);
      if (localaf2.update(str2, localContentValues, "rowid = ?", arrayOfString3) > 0);
      for (bool = true; bool; bool = false)
      {
        Bo();
        return bool;
      }
    }
  }

  public boolean a(ad paramad)
  {
    boolean bool;
    ContentValues localContentValues;
    int i;
    int j;
    if (!ch.jb(this.iGz.ihb))
    {
      bool = true;
      Assert.assertTrue("replace primaryKey == null", bool);
      localContentValues = paramad.ir();
      if (localContentValues != null)
      {
        i = localContentValues.size();
        j = paramad.nF().dFq.length;
        if (!localContentValues.containsKey("rowid"))
          break label83;
      }
    }
    label83: for (int k = 1; ; k = 0)
    {
      if (i == k + j)
        break label89;
      AZ("replace failed, cv.size() != item.fields().length");
      return false;
      bool = false;
      break;
    }
    label89: if (a(localContentValues))
    {
      AY("no need replace , fields no change");
      return true;
    }
    if (this.dtV.replace(wj(), this.iGz.ihb, localContentValues) > 0L)
    {
      Ba(this.iGz.ihb);
      return true;
    }
    AZ("replace failed");
    return false;
  }

  public final boolean a(ad paramad, boolean paramBoolean)
  {
    ContentValues localContentValues = paramad.ir();
    if ((localContentValues == null) || (localContentValues.size() <= 0))
    {
      AZ("insert failed, value.size <= 0");
      return false;
    }
    paramad.iGx = this.dtV.insert(wj(), this.iGz.ihb, localContentValues);
    if (paramad.iGx <= 0L)
    {
      AZ("insert failed");
      return false;
    }
    localContentValues.put("rowid", Long.valueOf(paramad.iGx));
    if (paramBoolean)
      Ba(localContentValues.getAsString(this.iGz.ihb));
    return true;
  }

  public final boolean a(ad paramad, boolean paramBoolean, String[] paramArrayOfString)
  {
    boolean bool = false;
    ContentValues localContentValues = paramad.ir();
    if ((localContentValues == null) || (localContentValues.size() <= 0))
      AZ("update failed, value.size <= 0");
    do
    {
      return bool;
      if ((paramArrayOfString != null) && (paramArrayOfString.length > 0))
        break;
      AY("update with primary key");
      if (a(localContentValues))
      {
        AY("no need replace , fields no change");
        return true;
      }
      af localaf = this.dtV;
      String str1 = wj();
      String str2 = this.iGz.ihb + " = ?";
      String[] arrayOfString = new String[1];
      arrayOfString[0] = ch.ja(localContentValues.getAsString(this.iGz.ihb));
      int i = localaf.update(str1, localContentValues, str2, arrayOfString);
      bool = false;
      if (i > 0)
        bool = true;
    }
    while ((!bool) || (!paramBoolean));
    Bo();
    return bool;
    StringBuilder localStringBuilder = a(localContentValues, paramArrayOfString);
    if (localStringBuilder == null)
    {
      AZ("update failed, check keys failed");
      return false;
    }
    if (this.dtV.update(wj(), localContentValues, localStringBuilder.toString(), a(paramArrayOfString, localContentValues)) > 0)
    {
      if (paramBoolean)
        Ba(localContentValues.getAsString(this.iGz.ihb));
      return true;
    }
    AZ("update failed");
    return false;
  }

  public boolean a(ad paramad, String[] paramArrayOfString)
  {
    return a(paramad, true, paramArrayOfString);
  }

  public final String aNP()
  {
    return this.iGz.ihb;
  }

  public final boolean b(long paramLong, ad paramad)
  {
    af localaf = this.dtV;
    String str = wj();
    String[] arrayOfString1 = this.iGz.dhI;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = String.valueOf(paramLong);
    Cursor localCursor = localaf.a(str, arrayOfString1, "rowid = ?", arrayOfString2, null, null);
    if (localCursor.moveToFirst())
    {
      paramad.b(localCursor);
      localCursor.close();
      return true;
    }
    localCursor.close();
    return false;
  }

  public boolean b(ad paramad)
  {
    return a(paramad, true);
  }

  public boolean b(ad paramad, String[] paramArrayOfString)
  {
    boolean bool = false;
    ContentValues localContentValues = paramad.ir();
    if ((localContentValues == null) || (localContentValues.size() <= 0))
      AZ("delete failed, value.size <= 0");
    do
    {
      return bool;
      if ((paramArrayOfString != null) && (paramArrayOfString.length > 0))
        break;
      AY("delete with primary key");
      af localaf = this.dtV;
      String str1 = wj();
      String str2 = this.iGz.ihb + " = ?";
      String[] arrayOfString = new String[1];
      arrayOfString[0] = ch.ja(localContentValues.getAsString(this.iGz.ihb));
      int i = localaf.delete(str1, str2, arrayOfString);
      bool = false;
      if (i > 0)
        bool = true;
    }
    while (!bool);
    Bo();
    return bool;
    StringBuilder localStringBuilder = a(localContentValues, paramArrayOfString);
    if (localStringBuilder == null)
    {
      AZ("delete failed, check keys failed");
      return false;
    }
    if (this.dtV.delete(wj(), localStringBuilder.toString(), a(paramArrayOfString, localContentValues)) > 0)
    {
      Ba(this.iGz.ihb);
      return true;
    }
    AZ("delete failed");
    return false;
  }

  public final boolean bp(String paramString1, String paramString2)
  {
    if (paramString1.length() == 0)
    {
      AZ("null or nill table");
      return false;
    }
    if ((paramString2 == null) || (paramString2.length() == 0))
    {
      AZ("null or nill sql");
      return false;
    }
    return this.dtV.bp(paramString1, paramString2);
  }

  public final boolean c(ad paramad, String[] paramArrayOfString)
  {
    ContentValues localContentValues = paramad.ir();
    if ((localContentValues == null) || (localContentValues.size() <= 0))
    {
      AZ("get failed, value.size <= 0");
      return false;
    }
    if (paramArrayOfString.length <= 0)
    {
      AY("get with primary key");
      af localaf = this.dtV;
      String str1 = wj();
      String[] arrayOfString1 = this.iGz.dhI;
      String str2 = this.iGz.ihb + " = ?";
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = ch.ja(localContentValues.getAsString(this.iGz.ihb));
      Cursor localCursor2 = localaf.a(str1, arrayOfString1, str2, arrayOfString2, null, null);
      if (localCursor2.moveToFirst())
      {
        paramad.b(localCursor2);
        localCursor2.close();
        return true;
      }
      localCursor2.close();
      return false;
    }
    StringBuilder localStringBuilder = a(localContentValues, paramArrayOfString);
    if (localStringBuilder == null)
    {
      AZ("get failed, check keys failed");
      return false;
    }
    Cursor localCursor1 = this.dtV.a(wj(), this.iGz.dhI, localStringBuilder.toString(), a(paramArrayOfString, localContentValues), null, null);
    if (localCursor1.moveToFirst())
    {
      paramad.b(localCursor1);
      localCursor1.close();
      return true;
    }
    localCursor1.close();
    AY("get failed, not found");
    return false;
  }

  public boolean delete(long paramLong)
  {
    boolean bool = true;
    af localaf = this.dtV;
    String str = wj();
    String[] arrayOfString = new String[bool];
    arrayOfString[0] = String.valueOf(paramLong);
    if (localaf.delete(str, "rowid = ?", arrayOfString) > 0);
    while (true)
    {
      if (bool)
        Bo();
      return bool;
      bool = false;
    }
  }

  public int getCount()
  {
    Cursor localCursor = rawQuery("select count(*) from " + wj(), new String[0]);
    int i = 0;
    if (localCursor != null)
    {
      localCursor.moveToFirst();
      i = localCursor.getInt(0);
      localCursor.close();
    }
    return i;
  }

  public final Cursor rawQuery(String paramString, String[] paramArrayOfString)
  {
    return this.dtV.rawQuery(paramString, paramArrayOfString);
  }

  public String wj()
  {
    return this.ihe;
  }

  public Cursor yF()
  {
    return this.dtV.a(wj(), this.iGz.dhI, null, null, null, null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.f.ah
 * JD-Core Version:    0.6.2
 */