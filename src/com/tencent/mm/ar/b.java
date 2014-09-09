package com.tencent.mm.ar;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import com.tencent.mm.a.d;
import com.tencent.mm.compatible.g.u;
import com.tencent.mm.g;
import com.tencent.mm.sdk.platformtools.ch;

public final class b
{
  private static final d ihA = new d(500);
  private static final d ihB = new d(500);

  public static SpannableString a(Context paramContext, String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.equals("")))
      return new SpannableString("");
    String str1;
    String str2;
    if (ch.jb(paramString2))
    {
      str1 = paramString1 + "@" + paramInt1;
      str2 = u.n(paramString1).toString();
      switch (paramInt1)
      {
      default:
      case -1:
      case -2:
      }
    }
    while (true)
    {
      SpannableString localSpannableString1 = (SpannableString)ihA.get(str1);
      if (localSpannableString1 == null)
        break label175;
      a(localSpannableString1);
      return localSpannableString1;
      str1 = paramString2 + "@" + paramInt1;
      break;
      paramInt1 = paramContext.getResources().getDimensionPixelSize(g.Pl);
      continue;
      paramInt1 = paramContext.getResources().getDimensionPixelSize(g.Pz);
    }
    label175: SpannableString localSpannableString2 = new SpannableString(a.Bg(str2));
    boolean bool1 = e.b(paramContext, localSpannableString2, paramInt1, paramInt2);
    boolean bool2 = a.a(paramContext, localSpannableString2, paramInt1, paramInt2);
    if ((bool1) || (bool2));
    for (boolean bool3 = true; ; bool3 = false)
    {
      ihB.b(str1, Boolean.valueOf(bool3));
      ihA.b(str1, localSpannableString2);
      return localSpannableString2;
    }
  }

  public static SpannableString a(Context paramContext, String paramString1, int paramInt, String paramString2)
  {
    return a(paramContext, paramString1, paramInt, 0, paramString2);
  }

  public static SpannableString a(Context paramContext, String paramString, int paramInt, boolean paramBoolean)
  {
    if ((paramString == null) || (paramString.equals("")))
      return new SpannableString("");
    if (paramBoolean)
      paramString = u.n(paramString).toString();
    switch (paramInt)
    {
    default:
    case -1:
    case -2:
    }
    String str;
    while (true)
    {
      str = paramString + "@" + paramInt;
      SpannableString localSpannableString1 = (SpannableString)ihA.get(str);
      if (localSpannableString1 == null)
        break;
      a(localSpannableString1);
      return localSpannableString1;
      paramInt = paramContext.getResources().getDimensionPixelSize(g.Pl);
      continue;
      paramInt = paramContext.getResources().getDimensionPixelSize(g.Pz);
    }
    SpannableString localSpannableString2 = new SpannableString(a.Bg(paramString));
    boolean bool1 = e.b(paramContext, localSpannableString2, paramInt);
    boolean bool2 = a.b(paramContext, localSpannableString2, paramInt);
    if ((bool1) || (bool2));
    for (boolean bool3 = true; ; bool3 = false)
    {
      ihB.b(str, Boolean.valueOf(bool3));
      ihA.b(str, localSpannableString2);
      return localSpannableString2;
    }
  }

  private static void a(Spannable paramSpannable)
  {
    int i = 0;
    ClickableSpan[] arrayOfClickableSpan = (ClickableSpan[])paramSpannable.getSpans(0, paramSpannable.length(), ClickableSpan.class);
    while (i < arrayOfClickableSpan.length)
    {
      paramSpannable.removeSpan(arrayOfClickableSpan[i]);
      i++;
    }
  }

  public static SpannableString b(Context paramContext, String paramString, int paramInt, boolean paramBoolean)
  {
    if ((paramString == null) || (paramString.equals("")))
      return new SpannableString("");
    if (paramBoolean)
      paramString = u.n(paramString).toString();
    switch (paramInt)
    {
    default:
    case -1:
    case -2:
    }
    String str;
    while (true)
    {
      str = paramString + "@" + paramInt;
      SpannableString localSpannableString1 = (SpannableString)ihA.get(str);
      if (localSpannableString1 == null)
        break;
      a(localSpannableString1);
      return localSpannableString1;
      paramInt = paramContext.getResources().getDimensionPixelSize(g.Pl);
      continue;
      paramInt = paramContext.getResources().getDimensionPixelSize(g.Pz);
    }
    SpannableString localSpannableString2 = new SpannableString(a.Bg(paramString));
    boolean bool1 = e.b(paramContext, localSpannableString2, paramInt);
    boolean bool2 = a.b(paramContext, localSpannableString2, paramInt);
    if ((bool1) || (bool2));
    for (boolean bool3 = true; ; bool3 = false)
    {
      ihB.b(str, Boolean.valueOf(bool3));
      ihA.b(str, localSpannableString2);
      return localSpannableString2;
    }
  }

  public static SpannableString c(Context paramContext, String paramString, int paramInt)
  {
    return a(paramContext, paramString, paramInt, true);
  }

  public static void clearCache()
  {
    ihA.clear();
    ihB.clear();
  }

  public static CharSequence d(Context paramContext, String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.equals("")))
      return new String("");
    String str1 = xN(paramString);
    switch (paramInt)
    {
    default:
    case -1:
    case -2:
    }
    String str2;
    while (true)
    {
      str2 = str1 + "@" + paramInt;
      Boolean localBoolean = (Boolean)ihB.get(str2);
      if ((localBoolean == null) || (localBoolean.booleanValue()))
        break;
      return str1;
      paramInt = paramContext.getResources().getDimensionPixelSize(g.Pl);
      continue;
      paramInt = paramContext.getResources().getDimensionPixelSize(g.Pz);
    }
    SpannableString localSpannableString1 = (SpannableString)ihA.get(str2);
    if (localSpannableString1 != null)
    {
      a(localSpannableString1);
      return localSpannableString1;
    }
    String str3 = a.Bg(str1);
    SpannableString localSpannableString2 = new SpannableString(str3);
    boolean bool1 = e.b(paramContext, localSpannableString2, paramInt, 0);
    boolean bool2 = a.a(paramContext, localSpannableString2, paramInt, 0);
    if ((bool1) || (bool2));
    for (boolean bool3 = true; ; bool3 = false)
    {
      ihB.b(str2, Boolean.valueOf(bool3));
      ihA.b(str2, localSpannableString2);
      if (!bool3)
        break;
      return localSpannableString2;
    }
    return str3;
  }

  public static SpannableString e(Context paramContext, String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.equals("")))
      return new SpannableString("");
    String str1 = u.n(paramString).toString();
    switch (paramInt)
    {
    default:
    case -1:
    case -2:
    }
    String str2;
    while (true)
    {
      str2 = str1 + "@" + paramInt;
      SpannableString localSpannableString1 = (SpannableString)ihA.get(str2);
      if (localSpannableString1 == null)
        break;
      a(localSpannableString1);
      return localSpannableString1;
      paramInt = paramContext.getResources().getDimensionPixelSize(g.Pl);
      continue;
      paramInt = paramContext.getResources().getDimensionPixelSize(g.Pz);
    }
    SpannableString localSpannableString2 = new SpannableString(a.Bg(str1));
    boolean bool = a.b(paramContext, localSpannableString2, paramInt);
    ihB.b(str2, Boolean.valueOf(bool));
    ihA.b(str2, localSpannableString2);
    return localSpannableString2;
  }

  public static CharSequence f(Context paramContext, String paramString, int paramInt)
  {
    SpannableString localSpannableString1;
    if ((paramString == null) || (paramString.equals("")))
      localSpannableString1 = new SpannableString("");
    String str3;
    boolean bool;
    do
    {
      return localSpannableString1;
      String str1 = u.n(paramString).toString();
      switch (paramInt)
      {
      default:
      case -1:
      case -2:
      }
      String str2;
      while (true)
      {
        str2 = str1 + "@" + paramInt;
        Boolean localBoolean = (Boolean)ihB.get(str2);
        if ((localBoolean == null) || (localBoolean.booleanValue()))
          break;
        return str1;
        paramInt = paramContext.getResources().getDimensionPixelSize(g.Pl);
        continue;
        paramInt = paramContext.getResources().getDimensionPixelSize(g.Pz);
      }
      SpannableString localSpannableString2 = (SpannableString)ihA.get(str2);
      if (localSpannableString2 != null)
      {
        a(localSpannableString2);
        return localSpannableString2;
      }
      str3 = a.Bg(str1);
      localSpannableString1 = new SpannableString(str3);
      bool = a.a(paramContext, localSpannableString1, paramInt, 0);
      ihB.b(str2, Boolean.valueOf(bool));
      ihA.b(str2, localSpannableString1);
    }
    while (bool);
    return str3;
  }

  public static SpannableString g(Context paramContext, String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.equals("")))
      return new SpannableString("");
    String str1 = u.n(paramString).toString();
    switch (paramInt)
    {
    default:
    case -1:
    case -2:
    }
    String str2;
    while (true)
    {
      str2 = str1 + "@" + paramInt;
      SpannableString localSpannableString1 = (SpannableString)ihA.get(str2);
      if (localSpannableString1 == null)
        break;
      a(localSpannableString1);
      return localSpannableString1;
      paramInt = paramContext.getResources().getDimensionPixelSize(g.Pl);
      continue;
      paramInt = paramContext.getResources().getDimensionPixelSize(g.Pz);
    }
    SpannableString localSpannableString2 = new SpannableString(a.Bg(str1));
    a.a(paramContext, localSpannableString2, paramInt);
    ihA.b(str2, localSpannableString2);
    return localSpannableString2;
  }

  public static void release()
  {
    ihA.clear();
  }

  private static String xN(String paramString)
  {
    int i = paramString.length();
    for (int j = 0; (j < i) && (paramString.charAt(j) == '\n'); j++);
    if (j > 0)
      paramString = paramString.substring(j);
    return paramString.replace('\n', ' ');
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ar.b
 * JD-Core Version:    0.6.2
 */