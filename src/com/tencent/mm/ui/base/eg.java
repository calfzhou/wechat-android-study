package com.tencent.mm.ui.base;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class eg
  implements InputFilter
{
  private int jcF = 18;
  private int jcG = 128;

  public eg(MMTagPanel paramMMTagPanel)
  {
  }

  public final int aSQ()
  {
    return this.jcF;
  }

  public final CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
  {
    int i = this.jcF - (paramSpanned.length() - (paramInt4 - paramInt3));
    int j = this.jcG - (paramSpanned.length() - (paramInt4 - paramInt3));
    Object[] arrayOfObject = new Object[8];
    arrayOfObject[0] = Integer.valueOf(i);
    arrayOfObject[1] = Integer.valueOf(j);
    arrayOfObject[2] = paramCharSequence;
    arrayOfObject[3] = Integer.valueOf(paramInt1);
    arrayOfObject[4] = Integer.valueOf(paramInt2);
    arrayOfObject[5] = paramSpanned;
    arrayOfObject[6] = Integer.valueOf(paramInt3);
    arrayOfObject[7] = Integer.valueOf(paramInt4);
    z.v("!32@/B4Tb64lLpL4fhNdmBV+Mf4yaXXb52KA", "on length filter, keep[%d] showKeep[%d] %s [%d, %d) %s [%d, %d)", arrayOfObject);
    String str;
    if (i == 0)
      if (paramInt2 - paramInt1 > 0)
      {
        char[] arrayOfChar = new char[paramInt2 - paramInt1];
        TextUtils.getChars(paramCharSequence, paramInt1, paramInt2, arrayOfChar, 0);
        if (arrayOfChar[0] == '\n')
        {
          MMTagPanel.a(this.jcy, false);
          str = "\n";
        }
      }
    while (true)
    {
      boolean bool = MMTagPanel.h(this.jcy);
      if (MMTagPanel.e(this.jcy) != null)
        this.jcy.post(new eh(this, bool, paramInt2, paramInt1, i));
      if (ch.jb(str))
        break;
      return str;
      MMTagPanel.a(this.jcy, true);
      str = "";
      continue;
      MMTagPanel.a(this.jcy, false);
      str = "";
      continue;
      if ((i < 0) || (i < paramInt2 - paramInt1))
      {
        MMTagPanel.a(this.jcy, true);
        str = "";
      }
      else
      {
        MMTagPanel.a(this.jcy, false);
        str = "";
      }
    }
    if (j <= 0)
      return "";
    if (j >= paramInt2 - paramInt1)
      return null;
    int k = j + paramInt1;
    if (Character.isHighSurrogate(paramCharSequence.charAt(k - 1)))
    {
      k--;
      if (k == paramInt1)
        return "";
    }
    return paramCharSequence.subSequence(paramInt1, k);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.eg
 * JD-Core Version:    0.6.2
 */