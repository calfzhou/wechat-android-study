package com.tencent.mm.sdk.f;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;

public abstract class ad
{
  public long iGx = -1L;

  public static String a(Field paramField)
  {
    if (paramField == null);
    String str;
    do
    {
      return null;
      str = paramField.getName();
    }
    while ((str == null) || (str.length() <= 0));
    if (str.startsWith("field_"))
      return str.substring(6);
    return str;
  }

  public static boolean a(ContentValues paramContentValues, Cursor paramCursor)
  {
    if (paramContentValues == null)
      return paramCursor == null;
    if ((paramCursor == null) || (paramCursor.getCount() != 1))
      return false;
    paramCursor.moveToFirst();
    int i = paramCursor.getColumnCount();
    int j = paramContentValues.size();
    if (paramContentValues.containsKey("rowid"))
      j--;
    if (paramCursor.getColumnIndex("rowid") != -1)
      i--;
    if (j != i)
      return false;
    label213: label344: label350: label356: label360: 
    while (true)
    {
      byte[] arrayOfByte1;
      byte[] arrayOfByte2;
      int m;
      int n;
      try
      {
        Iterator localIterator = paramContentValues.valueSet().iterator();
        if (localIterator.hasNext())
        {
          String str = (String)((Map.Entry)localIterator.next()).getKey();
          if (str.equals("rowid"))
            continue;
          int k = paramCursor.getColumnIndex(str);
          if (k == -1)
            return false;
          if ((paramContentValues.get(str) instanceof byte[]))
          {
            arrayOfByte1 = (byte[])paramContentValues.get(str);
            arrayOfByte2 = paramCursor.getBlob(k);
            if (arrayOfByte1 != null)
              break label308;
            if (arrayOfByte2 == null)
              break label356;
            break label308;
            if (arrayOfByte1.length == arrayOfByte2.length)
              break label344;
            m = 0;
            break label321;
            if (n >= arrayOfByte1.length)
              break label356;
            if (arrayOfByte1[n] == arrayOfByte2[n])
              break label350;
            m = 0;
            break label321;
          }
          if ((paramCursor.getString(k) == null) && (paramContentValues.get(str) != null))
            return false;
          if (paramContentValues.get(str) == null)
            return false;
          boolean bool = paramContentValues.get(str).toString().equals(paramCursor.getString(k));
          if (bool)
            continue;
          return false;
        }
      }
      catch (Exception localException)
      {
        return false;
      }
      return true;
      if ((arrayOfByte1 == null) && (arrayOfByte2 != null))
        m = 0;
      while (true)
      {
        if (m != 0)
          break label360;
        return false;
        if ((arrayOfByte1 == null) || (arrayOfByte2 != null))
          break;
        m = 0;
        continue;
        n = 0;
        break label213;
        n++;
        break label213;
        m = 1;
      }
    }
  }

  private static String[] a(Field[] paramArrayOfField)
  {
    String[] arrayOfString = new String[1 + paramArrayOfField.length];
    int i = 0;
    if (i < paramArrayOfField.length)
    {
      arrayOfString[i] = a(paramArrayOfField[i]);
      String str = "getFullColumns failed:" + paramArrayOfField[i].getName();
      if (!ch.jb(arrayOfString[i]));
      for (boolean bool = true; ; bool = false)
      {
        Assert.assertTrue(str, bool);
        i++;
        break;
      }
    }
    arrayOfString[paramArrayOfField.length] = "rowid";
    return arrayOfString;
  }

  private static Map b(Field[] paramArrayOfField)
  {
    HashMap localHashMap = new HashMap();
    int i = 0;
    if (i < paramArrayOfField.length)
    {
      Field localField = paramArrayOfField[i];
      String str1 = a.b(localField.getType());
      if (str1 == null)
        z.e("!44@/B4Tb64lLpLLUFo2TM7uCbJuPRuarh9/GXNqcjNxYhM=", "failed identify on column: " + localField.getName() + ", skipped");
      while (true)
      {
        i++;
        break;
        String str2 = a(localField);
        if (!ch.jb(str2))
          localHashMap.put(str2, str1);
      }
    }
    return localHashMap;
  }

  private static String c(Field[] paramArrayOfField)
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    int i = 0;
    Field localField;
    String str1;
    String str2;
    String str3;
    if (i < paramArrayOfField.length)
    {
      localField = paramArrayOfField[i];
      str1 = a.b(localField.getType());
      if (str1 == null)
        z.e("!44@/B4Tb64lLpLLUFo2TM7uCbJuPRuarh9/GXNqcjNxYhM=", "failed identify on column: " + localField.getName() + ", skipped");
      do
      {
        i++;
        break;
        str2 = a(localField);
      }
      while (ch.jb(str2));
      if (!localField.isAnnotationPresent(ag.class))
        break label239;
      str3 = " default '" + ((ag)localField.getAnnotation(ag.class)).aNN() + "' ";
    }
    for (int j = ((ag)localField.getAnnotation(ag.class)).aNO(); ; j = 0)
    {
      StringBuilder localStringBuilder2 = new StringBuilder().append(str2).append(" ").append(str1).append(str3);
      String str4;
      if (j == 1)
      {
        str4 = " PRIMARY KEY ";
        label183: localStringBuilder1.append(str4);
        if (i != -1 + paramArrayOfField.length)
          break label227;
      }
      label227: for (String str5 = ""; ; str5 = ", ")
      {
        localStringBuilder1.append(str5);
        break;
        str4 = "";
        break label183;
      }
      return localStringBuilder1.toString();
      label239: str3 = "";
    }
  }

  public static Field[] c(Class paramClass)
  {
    ae localae = new ae();
    LinkedList localLinkedList = new LinkedList();
    Field[] arrayOfField = paramClass.getDeclaredFields();
    int i = arrayOfField.length;
    int j = 0;
    if (j < i)
    {
      Field localField = arrayOfField[j];
      int k = localField.getModifiers();
      String str1 = localField.getName();
      String str2;
      if ((str1 != null) && (Modifier.isPublic(k)) && (!Modifier.isFinal(k)))
      {
        if (!str1.startsWith("field_"))
          break label169;
        str2 = str1.substring(6);
        label95: if (!localField.isAnnotationPresent(ag.class))
          break label176;
        if (((ag)localField.getAnnotation(ag.class)).aNO() == 1)
          localae.ihb = str2;
      }
      while (true)
      {
        if (!ch.jb(str2))
        {
          if (str2.equals("rowid"))
            Assert.assertTrue("field_rowid reserved by MAutoDBItem, change now!", false);
          localLinkedList.add(localField);
        }
        label169: label176: 
        do
        {
          j++;
          break;
          str2 = str1;
          break label95;
        }
        while (!str1.startsWith("field_"));
      }
    }
    localae.dFq = ((Field[])localLinkedList.toArray(new Field[0]));
    localae.dhI = a(localae.dFq);
    localae.iGy = b(localae.dFq);
    localae.dlP = c(localae.dFq);
    return localae.dFq;
  }

  public abstract void b(Cursor paramCursor);

  public abstract ContentValues ir();

  protected abstract ae nF();
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.f.ad
 * JD-Core Version:    0.6.2
 */