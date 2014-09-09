package com.tencent.mm.pluginsdk.e;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.format.DateUtils;
import android.text.format.Time;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class l
{
  private static int a(SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2)
  {
    int i;
    if ((paramInt1 + 1 < paramInt2) && (paramSpannableStringBuilder.charAt(paramInt1 + 1) == '\''))
    {
      paramSpannableStringBuilder.delete(paramInt1, paramInt1 + 1);
      i = 1;
    }
    while (true)
    {
      return i;
      i = 0;
      paramSpannableStringBuilder.delete(paramInt1, paramInt1 + 1);
      int j = paramInt2 - 1;
      while (paramInt1 < j)
        if (paramSpannableStringBuilder.charAt(paramInt1) == '\'')
        {
          if ((paramInt1 + 1 < j) && (paramSpannableStringBuilder.charAt(paramInt1 + 1) == '\''))
          {
            paramSpannableStringBuilder.delete(paramInt1, paramInt1 + 1);
            j--;
            i++;
            paramInt1++;
          }
          else
          {
            paramSpannableStringBuilder.delete(paramInt1, paramInt1 + 1);
            return i;
          }
        }
        else
        {
          paramInt1++;
          i++;
        }
    }
  }

  public static CharSequence a(CharSequence paramCharSequence, Time paramTime)
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(paramCharSequence);
    int i = paramCharSequence.length();
    int j = 0;
    int k;
    int m;
    int i2;
    int i1;
    if (j < i)
    {
      k = 1;
      m = localSpannableStringBuilder.charAt(j);
      if (m == 39)
      {
        i2 = a(localSpannableStringBuilder, j, i);
        i1 = localSpannableStringBuilder.length();
      }
    }
    while (true)
    {
      j = i2 + j;
      i = i1;
      break;
      while ((j + k < i) && (localSpannableStringBuilder.charAt(j + k) == m))
        k++;
      Object localObject;
      switch (m)
      {
      default:
        localObject = null;
      case 97:
      case 65:
      case 100:
      case 69:
      case 104:
      case 107:
      case 109:
      case 76:
      case 77:
      case 115:
      case 122:
      case 121:
      }
      while (true)
        if (localObject != null)
        {
          localSpannableStringBuilder.replace(j, j + k, (CharSequence)localObject);
          i2 = ((String)localObject).length();
          i1 = localSpannableStringBuilder.length();
          break;
          if (paramTime.hour < 12);
          for (int i10 = 0; ; i10 = 1)
          {
            localObject = DateUtils.getAMPMString(i10);
            break;
          }
          if (paramTime.hour < 12);
          for (int i9 = 0; ; i9 = 1)
          {
            localObject = DateUtils.getAMPMString(i9);
            break;
          }
          localObject = aJ(paramTime.monthDay, k);
          continue;
          int i7 = 1 + paramTime.weekDay;
          if (k < 4);
          for (int i8 = 20; ; i8 = 10)
          {
            localObject = DateUtils.getDayOfWeekString(i7, i8);
            break;
          }
          int i6 = paramTime.hour;
          if (i6 == 0)
            i6 = 12;
          if (i6 > 12)
            i6 -= 12;
          localObject = aJ(i6, k);
          continue;
          localObject = aJ(paramTime.hour, k);
          continue;
          localObject = aJ(paramTime.minute, k);
          continue;
          int i5 = paramTime.month;
          if (k >= 4)
          {
            localObject = DateUtils.getMonthString(i5, 10);
          }
          else if (k == 3)
          {
            localObject = DateUtils.getMonthString(i5, 20);
          }
          else
          {
            localObject = aJ(i5 + 1, k);
            continue;
            localObject = aJ(paramTime.second, k);
            continue;
            TimeZone localTimeZone = TimeZone.getDefault();
            localTimeZone.inDaylightTime(new Date(paramTime.toMillis(false)));
            if (k < 2)
            {
              long l = (localTimeZone.getRawOffset() + paramTime.gmtoff) / 1000L;
              StringBuilder localStringBuilder = new StringBuilder();
              if (l < 0L)
              {
                localStringBuilder.insert(0, "-");
                l = -l;
              }
              while (true)
              {
                int i3 = (int)(l / 3600L);
                int i4 = (int)(l % 3600L / 60L);
                localStringBuilder.append(aJ(i3, 2));
                localStringBuilder.append(aJ(i4, 2));
                localObject = localStringBuilder.toString();
                break;
                localStringBuilder.insert(0, "+");
              }
            }
            if (paramTime.isDst != 0);
            for (boolean bool = true; ; bool = false)
            {
              localObject = localTimeZone.getDisplayName(bool, 0);
              break;
            }
            int n = paramTime.year;
            if (k <= 2)
            {
              localObject = aJ(n % 100, 2);
            }
            else
            {
              Locale localLocale = Locale.getDefault();
              Object[] arrayOfObject = new Object[1];
              arrayOfObject[0] = Integer.valueOf(n);
              localObject = String.format(localLocale, "%d", arrayOfObject);
              continue;
              if ((paramCharSequence instanceof Spanned))
                return new SpannedString(localSpannableStringBuilder);
              return localSpannableStringBuilder.toString();
            }
          }
        }
      i1 = i;
      i2 = k;
    }
  }

  private static String aJ(int paramInt1, int paramInt2)
  {
    Locale localLocale = Locale.getDefault();
    String str = "%0" + paramInt2 + "d";
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    return String.format(localLocale, str, arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.e.l
 * JD-Core Version:    0.6.2
 */