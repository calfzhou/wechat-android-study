package com.tencent.mm.ui.contact;

import android.text.InputFilter;
import android.text.Spanned;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.z;

final class dk
  implements InputFilter
{
  private int pA = 200;

  public dk(ModRemarkNameUI paramModRemarkNameUI)
  {
  }

  public final CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
  {
    z.d("!32@9DU/RFsdGl+RDQXDdsDwXSf1gIUFYGLx", paramCharSequence + " start:" + paramInt1 + " end:" + paramInt2 + " " + paramSpanned + " dstart:" + paramInt3 + " dend:" + paramInt4);
    float f = ModRemarkNameUI.y(paramSpanned);
    int i = this.pA - Math.round(f) - (paramInt4 - paramInt3);
    if (i <= 0)
    {
      if ((Float.compare(f, (float)(this.pA - 0.5D)) == 0) && (paramCharSequence.length() > 0) && (!ap.l(paramCharSequence.charAt(0))))
        return paramCharSequence.subSequence(0, 1);
      return "";
    }
    if (i >= paramInt2 - paramInt1)
      return null;
    int j = i + paramInt1;
    if (Character.isHighSurrogate(paramCharSequence.charAt(j - 1)))
    {
      j--;
      if (j == paramInt1)
        return "";
    }
    return paramCharSequence.subSequence(paramInt1, j);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.dk
 * JD-Core Version:    0.6.2
 */