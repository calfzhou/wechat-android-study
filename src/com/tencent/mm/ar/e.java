package com.tencent.mm.ar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import com.tencent.mm.c;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.widget.a;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class e
{
  private static e iHg = null;
  private static Pattern iHo;
  public static int iHp = 6;
  private static final Comparator iHq = new f();
  private String[] iHh = null;
  private String[] iHi = null;
  private String[] iHj = null;
  private String[] iHk = null;
  private String[] iHl = null;
  private String[] iHm = null;
  private g[] iHn = null;

  private e()
  {
  }

  private e(Context paramContext)
  {
    this.iHh = paramContext.getResources().getStringArray(c.Nx);
    this.iHi = paramContext.getResources().getStringArray(c.NA);
    this.iHj = paramContext.getResources().getStringArray(c.Ny);
    this.iHk = paramContext.getResources().getStringArray(c.NC);
    this.iHl = paramContext.getResources().getStringArray(c.Nz);
    this.iHm = paramContext.getResources().getStringArray(c.NB);
    this.iHn = new g[6 * this.iHh.length];
    int i = 0;
    int j = 0;
    while (i < this.iHh.length)
    {
      this.iHn[j] = new g(i, this.iHh[i]);
      j++;
      i++;
    }
    for (int k = 0; k < this.iHi.length; k++)
    {
      this.iHn[j] = new g(k, this.iHi[k]);
      j++;
    }
    for (int m = 0; m < this.iHj.length; m++)
    {
      this.iHn[j] = new g(m, this.iHj[m]);
      j++;
    }
    for (int n = 0; n < this.iHk.length; n++)
    {
      this.iHn[j] = new g(n, this.iHk[n]);
      j++;
    }
    int i3;
    for (int i1 = 0; ; i1++)
    {
      int i2 = this.iHl.length;
      i3 = 0;
      if (i1 >= i2)
        break;
      this.iHn[j] = new g(i1, this.iHl[i1]);
      j++;
    }
    while (i3 < this.iHm.length)
    {
      this.iHn[j] = new g(i3, this.iHm[i3]);
      j++;
      i3++;
    }
    Arrays.sort(this.iHn, iHq);
  }

  public static String Bk(String paramString)
  {
    Context localContext = ak.getContext();
    int i = paramString.length();
    StringBuilder localStringBuilder = new StringBuilder(i);
    int j = 0;
    while (j < i)
    {
      char c = paramString.charAt(j);
      if ((c == '/') || (c == '['))
      {
        g localg = at(localContext, paramString.substring(j));
        if (localg != null)
        {
          for (int k = 0; k < localg.text.length(); k++)
            localStringBuilder.append('​');
          j += localg.text.length();
        }
      }
      else
      {
        localStringBuilder.append(c);
        j++;
      }
    }
    return localStringBuilder.toString();
  }

  public static SpannableString a(Context paramContext, SpannableString paramSpannableString, int paramInt)
  {
    if (paramSpannableString.length() == 0)
    {
      paramSpannableString = new SpannableString("");
      return paramSpannableString;
    }
    String str = paramSpannableString.toString();
    int i = -1;
    while (true)
    {
      i = str.indexOf('/', i + 1);
      if (i == -1)
        break;
      if (i < -1 + str.length())
        a(i, paramContext, paramSpannableString, paramInt, 0);
    }
    while (true)
    {
      i = str.indexOf('[', i + 1);
      if (i == -1)
        break;
      if (i < -1 + str.length())
        a(i, paramContext, paramSpannableString, paramInt, 0);
    }
  }

  private static boolean a(int paramInt1, Context paramContext, SpannableString paramSpannableString, int paramInt2, int paramInt3)
  {
    g localg = at(paramContext, paramSpannableString.subSequence(paramInt1, paramSpannableString.length()));
    boolean bool = false;
    int j;
    Drawable localDrawable;
    if (localg != null)
    {
      int i = localg.pos;
      j = paramContext.getResources().getIdentifier("smiley_" + i, "drawable", paramContext.getPackageName());
      if (j != 0)
        break label150;
      localDrawable = null;
      bool = false;
      if (localDrawable != null)
      {
        localDrawable.setBounds(0, 0, (int)(1.3D * paramInt2), (int)(1.3D * paramInt2));
        if (paramInt3 != 0)
          break label164;
        paramSpannableString.setSpan(new ImageSpan(localDrawable, 0), paramInt1, paramInt1 + localg.text.length(), 33);
      }
    }
    while (true)
    {
      bool = true;
      return bool;
      label150: localDrawable = paramContext.getResources().getDrawable(j);
      break;
      label164: a locala = new a(localDrawable, 0);
      locala.rB(paramInt3);
      paramSpannableString.setSpan(locala, paramInt1, paramInt1 + localg.text.length(), 33);
    }
  }

  public static g at(Context paramContext, String paramString)
  {
    if (iHg == null)
      iHg = new e(paramContext);
    g[] arrayOfg = iHg.iHn;
    int i = Arrays.binarySearch(arrayOfg, new g(0, paramString), iHq);
    if (i < 0)
      i = -2 + -i;
    if ((i >= 0) && (paramString.startsWith(arrayOfg[i].text)))
      return arrayOfg[i];
    return null;
  }

  public static boolean b(Context paramContext, SpannableString paramSpannableString, int paramInt)
  {
    return b(paramContext, paramSpannableString, paramInt, 0);
  }

  public static boolean b(Context paramContext, SpannableString paramSpannableString, int paramInt1, int paramInt2)
  {
    if ((paramSpannableString == null) || (paramSpannableString.length() == 0))
    {
      bool = false;
      return bool;
    }
    String str = paramSpannableString.toString();
    boolean bool = false;
    int i = -1;
    while (true)
    {
      i = str.indexOf('/', i + 1);
      if (i == -1)
        break;
      if ((i < -1 + str.length()) && (a(i, paramContext, paramSpannableString, paramInt1, paramInt2)))
        bool = true;
    }
    while (true)
    {
      i = str.indexOf('[', i + 1);
      if (i == -1)
        break;
      if ((i < -1 + str.length()) && (a(i, paramContext, paramSpannableString, paramInt1, paramInt2)))
        bool = true;
    }
  }

  public static int h(Context paramContext, String paramString, int paramInt)
  {
    if (ch.jb(paramString));
    int i;
    do
    {
      return paramInt;
      i = paramString.length();
    }
    while ((paramInt == 0) || (paramInt == i));
    int i10;
    if (paramContext == null)
    {
      z.e("!44@/B4Tb64lLpLJpeO6UgCknHLw1AQHJIBZqq+CZlUMatI=", "setQQSmileyFailed, null context");
      int i9 = iHp;
      i10 = 0;
      if (paramInt >= i9)
        break label544;
      label48: if (paramInt + iHp < i)
        break label554;
    }
    label544: label554: for (int i11 = i - 1; ; i11 = paramInt + iHp)
    {
      String str = paramString.substring(i10, i11);
      int i12 = iHp;
      Matcher localMatcher = iHo.matcher(str);
      while (localMatcher.find())
        if ((i12 > localMatcher.start()) && (i12 < localMatcher.end()))
          i12 = localMatcher.start();
      return paramInt + (i12 - iHp);
      if (iHo != null)
        break;
      String[] arrayOfString1 = paramContext.getResources().getStringArray(c.Nx);
      String[] arrayOfString2 = paramContext.getResources().getStringArray(c.NA);
      String[] arrayOfString3 = paramContext.getResources().getStringArray(c.Ny);
      String[] arrayOfString4 = paramContext.getResources().getStringArray(c.NC);
      String[] arrayOfString5 = paramContext.getResources().getStringArray(c.Nz);
      String[] arrayOfString6 = paramContext.getResources().getStringArray(c.NB);
      StringBuilder localStringBuilder = new StringBuilder();
      int j = arrayOfString1.length;
      for (int k = 0; k < j; k++)
      {
        localStringBuilder.append(Pattern.quote(arrayOfString1[k]));
        if (k != j - 1)
          localStringBuilder.append('|');
      }
      int m = arrayOfString2.length;
      for (int n = 0; n < m; n++)
      {
        localStringBuilder.append(Pattern.quote(arrayOfString2[n]));
        if (n != m - 1)
          localStringBuilder.append('|');
      }
      int i1 = arrayOfString3.length;
      for (int i2 = 0; i2 < i1; i2++)
      {
        localStringBuilder.append(Pattern.quote(arrayOfString3[i2]));
        if (i2 != i1 - 1)
          localStringBuilder.append('|');
      }
      int i3 = arrayOfString4.length;
      for (int i4 = 0; i4 < i3; i4++)
      {
        localStringBuilder.append(Pattern.quote(arrayOfString4[i4]));
        if (i4 != i3 - 1)
          localStringBuilder.append('|');
      }
      int i5 = arrayOfString5.length;
      for (int i6 = 0; i6 < i5; i6++)
      {
        localStringBuilder.append(Pattern.quote(arrayOfString5[i6]));
        if (i6 != i5 - 1)
          localStringBuilder.append('|');
      }
      int i7 = arrayOfString6.length;
      for (int i8 = 0; i8 < i7; i8++)
      {
        localStringBuilder.append(Pattern.quote(arrayOfString6[i8]));
        if (i8 != i7 - 1)
          localStringBuilder.append('|');
      }
      iHo = Pattern.compile(localStringBuilder.toString());
      break;
      i10 = paramInt - iHp;
      break label48;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ar.e
 * JD-Core Version:    0.6.2
 */