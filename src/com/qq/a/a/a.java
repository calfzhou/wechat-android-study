package com.qq.a.a;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a
{
  public static Object O(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramString.indexOf("<");
    int j = 0;
    while (true)
    {
      int n;
      if (j < i)
      {
        a(localArrayList, paramString.substring(j, i));
        n = i + 1;
        i = paramString.indexOf("<", n);
        int i1 = paramString.indexOf(",", n);
        if (i == -1)
          i = i1;
        if ((i1 != -1) && (i1 < i))
        {
          i = i1;
          j = n;
        }
      }
      else
      {
        a(localArrayList, paramString.substring(j, paramString.length()));
        Iterator localIterator = localArrayList.iterator();
        Object localObject1 = null;
        Object localObject2 = null;
        Object localObject3 = null;
        label291: label337: Object localObject4;
        while (localIterator.hasNext())
        {
          localObject1 = P((String)localIterator.next());
          if ((localObject1 instanceof String))
          {
            if ("Array".equals((String)localObject1))
            {
              if (localObject3 != null)
                break label373;
              localObject1 = Array.newInstance(Byte.class, 0);
            }
            else
            {
              if ("?".equals((String)localObject1))
                break label373;
              if (localObject3 == null)
              {
                localObject3 = localObject1;
              }
              else
              {
                localObject2 = localObject3;
                localObject3 = localObject1;
              }
            }
          }
          else if ((localObject1 instanceof List))
          {
            if ((localObject3 != null) && ((localObject3 instanceof Byte)))
            {
              localObject1 = Array.newInstance(Byte.class, 1);
              Array.set(localObject1, 0, localObject3);
            }
            else
            {
              if (localObject3 != null)
                ((List)localObject1).add(localObject3);
              localObject3 = null;
            }
          }
          else
          {
            if ((localObject1 instanceof Map))
            {
              int k;
              if (localObject3 != null)
              {
                k = 1;
                if (localObject2 == null)
                  break label337;
              }
              for (int m = 1; ; m = 0)
              {
                if ((m & k) != 0)
                  ((Map)localObject1).put(localObject3, localObject2);
                localObject2 = null;
                localObject3 = null;
                break;
                k = 0;
                break label291;
              }
            }
            if (localObject3 == null)
            {
              localObject3 = localObject1;
            }
            else
            {
              localObject4 = localObject3;
              localObject3 = localObject1;
            }
          }
        }
        while (true)
        {
          localObject2 = localObject4;
          break;
          return localObject1;
          label373: localObject4 = localObject2;
        }
        j = n;
      }
    }
  }

  private static Object P(String paramString)
  {
    if (paramString.equals("java.lang.Integer"))
      paramString = Integer.valueOf(0);
    do
    {
      return paramString;
      if (paramString.equals("java.lang.Boolean"))
        return Boolean.valueOf(false);
      if (paramString.equals("java.lang.Byte"))
        return Byte.valueOf((byte)0);
      if (paramString.equals("java.lang.Double"))
        return Double.valueOf(0.0D);
      if (paramString.equals("java.lang.Float"))
        return Float.valueOf(0.0F);
      if (paramString.equals("java.lang.Long"))
        return Long.valueOf(0L);
      if (paramString.equals("java.lang.Short"))
        return Short.valueOf((short)0);
      if (paramString.equals("java.lang.Character"))
        throw new IllegalArgumentException("can not support java.lang.Character");
      if (paramString.equals("java.lang.String"))
        return "";
      if (paramString.equals("java.util.List"))
        return new ArrayList();
      if (paramString.equals("java.util.Map"))
        return new HashMap();
      if (paramString.equals("Array"))
        return "Array";
    }
    while (paramString.equals("?"));
    try
    {
      Object localObject = Class.forName(paramString).getConstructor(new Class[0]).newInstance(new Object[0]);
      return localObject;
    }
    catch (Exception localException)
    {
      throw new b(localException);
    }
  }

  public static String a(ArrayList paramArrayList)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    if (i < paramArrayList.size())
    {
      String str2 = (String)paramArrayList.get(i);
      if ((str2.equals("java.lang.Integer")) || (str2.equals("int")))
        str2 = "int32";
      while (true)
      {
        paramArrayList.set(i, str2);
        i++;
        break;
        if ((str2.equals("java.lang.Boolean")) || (str2.equals("boolean")))
        {
          str2 = "bool";
        }
        else if ((str2.equals("java.lang.Byte")) || (str2.equals("byte")))
        {
          str2 = "char";
        }
        else if ((str2.equals("java.lang.Double")) || (str2.equals("double")))
        {
          str2 = "double";
        }
        else if ((str2.equals("java.lang.Float")) || (str2.equals("float")))
        {
          str2 = "float";
        }
        else if ((str2.equals("java.lang.Long")) || (str2.equals("long")))
        {
          str2 = "int64";
        }
        else if ((str2.equals("java.lang.Short")) || (str2.equals("short")))
        {
          str2 = "short";
        }
        else
        {
          if (str2.equals("java.lang.Character"))
            throw new IllegalArgumentException("can not support java.lang.Character");
          if (str2.equals("java.lang.String"))
            str2 = "string";
          else if (str2.equals("java.util.List"))
            str2 = "list";
          else if (str2.equals("java.util.Map"))
            str2 = "map";
        }
      }
    }
    Collections.reverse(paramArrayList);
    int j = 0;
    if (j < paramArrayList.size())
    {
      String str1 = (String)paramArrayList.get(j);
      if (str1.equals("list"))
      {
        paramArrayList.set(j - 1, "<" + (String)paramArrayList.get(j - 1));
        paramArrayList.set(0, (String)paramArrayList.get(0) + ">");
      }
      while (true)
      {
        j++;
        break;
        if (str1.equals("map"))
        {
          paramArrayList.set(j - 1, "<" + (String)paramArrayList.get(j - 1) + ",");
          paramArrayList.set(0, (String)paramArrayList.get(0) + ">");
        }
        else if (str1.equals("Array"))
        {
          paramArrayList.set(j - 1, "<" + (String)paramArrayList.get(j - 1));
          paramArrayList.set(0, (String)paramArrayList.get(0) + ">");
        }
      }
    }
    Collections.reverse(paramArrayList);
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
      localStringBuffer.append((String)localIterator.next());
    return localStringBuffer.toString();
  }

  private static void a(ArrayList paramArrayList, String paramString)
  {
    int i = paramString.length();
    do
    {
      if (paramString.charAt(i - 1) != '>')
        break;
      i--;
    }
    while (i != 0);
    String str = paramString.substring(0, i);
    if (str.equals("int32"))
      str = "java.lang.Integer";
    while (true)
    {
      paramArrayList.add(0, str);
      return;
      if (str.equals("bool"))
        str = "java.lang.Boolean";
      else if (str.equals("char"))
        str = "java.lang.Byte";
      else if (str.equals("double"))
        str = "java.lang.Double";
      else if (str.equals("float"))
        str = "java.lang.Float";
      else if (str.equals("int64"))
        str = "java.lang.Long";
      else if (str.equals("short"))
        str = "java.lang.Short";
      else if (str.equals("string"))
        str = "java.lang.String";
      else if (str.equals("list"))
        str = "java.util.List";
      else if (str.equals("map"))
        str = "java.util.Map";
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.qq.a.a.a
 * JD-Core Version:    0.6.2
 */