package c.a.d;

import c.a.g.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class e
{
  private final List klZ;

  public e()
  {
    this.klZ = new ArrayList();
  }

  private e(List paramList)
  {
    this.klZ = new ArrayList(paramList);
  }

  public e(Map paramMap)
  {
    this();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (true)
    {
      if (!localIterator.hasNext())
        return;
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      this.klZ.add(new d((String)localEntry.getKey(), (String)localEntry.getValue()));
    }
  }

  public final String DX(String paramString)
  {
    c.a.g.d.b(paramString, "Cannot append to null URL");
    String str = bfM();
    if (str.equals(""))
      return paramString;
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString));
    if (paramString.indexOf('?') != -1);
    for (Object localObject = "&"; ; localObject = Character.valueOf('?'))
      return localStringBuilder.append(localObject).toString() + str;
  }

  public final void DY(String paramString)
  {
    String[] arrayOfString1;
    int j;
    if ((paramString != null) && (paramString.length() > 0))
    {
      arrayOfString1 = paramString.split("&");
      int i = arrayOfString1.length;
      j = 0;
      if (j < i);
    }
    else
    {
      return;
    }
    String[] arrayOfString2 = arrayOfString1[j].split("=");
    String str1 = c.decode(arrayOfString2[0]);
    if (arrayOfString2.length > 1);
    for (String str2 = c.decode(arrayOfString2[1]); ; str2 = "")
    {
      this.klZ.add(new d(str1, str2));
      j++;
      break;
    }
  }

  public final void a(e parame)
  {
    this.klZ.addAll(parame.klZ);
  }

  public final void bW(String paramString1, String paramString2)
  {
    this.klZ.add(new d(paramString1, paramString2));
  }

  public final String bfM()
  {
    if (this.klZ.size() == 0)
      return "";
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = this.klZ.iterator();
    while (true)
    {
      if (!localIterator.hasNext())
        return localStringBuilder.toString().substring(1);
      d locald = (d)localIterator.next();
      localStringBuilder.append('&').append(locald.bfL());
    }
  }

  public final e bfN()
  {
    e locale = new e(this.klZ);
    Collections.sort(locale.klZ);
    return locale;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     c.a.d.e
 * JD-Core Version:    0.6.2
 */